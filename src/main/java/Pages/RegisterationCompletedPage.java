package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationCompletedPage {

    private WebDriver driver;
    public RegisterationCompletedPage(WebDriver driver) {
        this.driver = driver;
    }

    private By successMessage = By.cssSelector("div.result");

    public String getAlertText (){
        return driver.findElement(successMessage).getText();

    }
}
