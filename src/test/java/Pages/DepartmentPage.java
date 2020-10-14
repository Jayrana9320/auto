package Pages;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPage extends BasePage {

    public DepartmentPage() {
        PageFactory.initElements(wd,this);
    }

    public String getDepartmentTitle(){
        return wd.getTitle();
    }

}
