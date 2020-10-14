package Test;

import Base.BasePage;
import Common.HeaderPage;
import Pages.DepartmentPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDepartmentPage extends BasePage {

    //128 no , variable..
    DepartmentPage departmentPage;

    public TestDepartmentPage(){
        super(); //will call BasePage();
    }

    @BeforeMethod
    public void setUp(){
        initialization(); //webdriver, property file
        departmentPage=new DepartmentPage();

    }

    //RUN THIS TEST TO CHECK IF PAGE OBJECT MODEL IS WORKING?

    @Test
    public void veirfyDeparmentTitle(){
        Assert.assertEquals(departmentPage.getDepartmentTitle(),prop.getProperty("DEPARTMENT_PAGE_TITLE"));
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}



