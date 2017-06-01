package autoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by macbook on 6/1/17.
 */
public abstract class BasePage {
    public WebDriver driver;
    public String PAGE_URL;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get(getPageURL());
    }

    public String getPageURL() {
        return PAGE_URL;
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void setElementText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
}

    /**
     * Created by macbook on 6/1/17.
     */
