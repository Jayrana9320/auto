package Test;

import Base.BasePage;
import Common.HeaderPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {

    //comment in Master Branch

    HomePage homePage;//=new HomePage(); //homePage=?

    public TestHomePage(){
        super(); //will call BasePage();
    }

    @BeforeMethod
    public void setUp(){
        initialization(); //webdriver, property file

        homePage=new HomePage();
    }

    //RUN THIS TEST TO CHECK IF PAGE OBJECT MODEL IS WORKING?
    @Test
    public void verifyHomePageTitle() {
        //just call the login page , which will make the title page works...
        Assert.assertEquals(homePage.getHomePageTitle(),prop.getProperty("HOME_PAGE_TITLE"));
    }

    @Test
    public void veirfyHomePageBannerTitle(){
        Assert.assertEquals(homePage.getBannerTitle(),prop.getProperty("BANNER_TITLE"));
    }

    @Test
    public void verifyMenus(){
        HeaderPage page=new HeaderPage();
        page.verifyMenus();
    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}



