package tests;

import autoqa.Pages.LoginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by macbook on 6/1/17.
 */
public class Login_Test {

    static WebDriver driver;
    static LoginPage loginPage;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @AfterClass
    public static void teardown() {
        driver.quit();}

    @Test
    public void testLoginPage(){
        loginPage.loadPage();
        loginPage.setText_EmailLogin("hutornoy@talkable.com");
        loginPage.setText_PasswordlLogin("1qaz@WSX3edc");
        loginPage.clickLogin();

    }
}
