package autoqa.Pages;

import autoqa.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by macbook on 6/1/17.
 */
public class LoginPage extends BasePage {


    @FindBy(id = "email") WebElement field_EmailLogin;
    @FindBy(id = "password") WebElement field_PasswordLogin;
    @FindBy(css= "input.base-btn.is-success.is-xl.ac-login-button") WebElement button_Login;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.PAGE_URL="https://admin.void.talkable.com/sites/81745";

    }

    public void setText_EmailLogin(String text){
        setElementText(field_EmailLogin, text);
    }

    public void setText_PasswordlLogin(String text){
        setElementText(field_PasswordLogin, text);
    }

    public void clickLogin () {
        clickElement(button_Login);
    }
}


