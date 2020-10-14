package Test;

import Base.BasePage;
import Pages.StudentsPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestStudentsPage extends BasePage {

    public StudentsPage studentsPage;

    public TestStudentsPage(){
        super(); //will call BasePage();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        studentsPage=new StudentsPage();
    }

    @Test
    public void verifyStudentPageTitle() {
        //just call the login page , which will make the title page works...
        Assert.assertEquals(studentsPage.getStudentsPageTitle(),prop.getProperty("STUDENT_PAGE_TITLE"));
    }
    //RUN THIS TEST TO CHECK IF PAGE OBJECT MODEL IS WORKING ?
    @Test
    public void verifyAddStudents() throws InterruptedException {
        studentsPage.navigateStudentsmenu();
        Thread.sleep(5000);

        studentsPage.clickCreateNew();
        Thread.sleep(5000);

        //verify Create Heading
        studentsPage.verifyHeadingCreate();

        studentsPage.enterLastName();
        Thread.sleep(3000);

        // Enter forms Value
        studentsPage.enterFirstName();
        Thread.sleep(3000);

        studentsPage.enterEnrollmentDate();
        Thread.sleep(3000);

        studentsPage.clickCreateButton();

        //verify the students create...... create another @Test method to verify the user created..

    }

//    @Test
//    public void verify




    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}



