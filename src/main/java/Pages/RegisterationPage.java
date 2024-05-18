package Pages;

import Utility.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterationPage {
    public CSVReader csvReader = new CSVReader("./resources/Book1.csv");
    private WebDriver driver;
    public RegisterationPage(WebDriver driver){

        this.driver = driver;
    }
    private By dateOfBirthDay = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");

    private By dateOfBirthMonth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");

    private By dateOfBirthYear = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");


    private By maleGenderRadioButton = By.id("gender-male");
    private By femaleGenderRadioButton = By.id("gender-female");
    private By firstNameTextBox = By.id("FirstName");
    private By lastNameTextBox = By.id("LastName");

    private By emailTextBox = By.id("Email");
    private By companyTextBox = By.id("Company");

    private By newsLetterCheckBox = By.id("Newsletter");
    private By passwordTextBox = By.id("Password");

    private By confirmPasswordTextBox = By.id("ConfirmPassword");

    public void setFirstName (){
        driver.findElement(firstNameTextBox).sendKeys(csvReader.readValue("firstname"));

    }
    public void setLastName (){
        driver.findElement(lastNameTextBox).sendKeys(csvReader.readValue("lastname"));

    }

    public void setEmail (){
        driver.findElement(emailTextBox).sendKeys(csvReader.readValue("email"));

    }

    public void setCompany (){
        driver.findElement(companyTextBox).sendKeys(csvReader.readValue("company"));

    }
    public void setPassword (){
        driver.findElement(passwordTextBox).sendKeys(csvReader.readValue("password"));

    }
    public void setConfirmPassword (){
        driver.findElement(confirmPasswordTextBox).sendKeys(csvReader.readValue("password"));

    }
    public void clickDropDown(WebDriver driver){
        driver.findElement(dateOfBirthDay).click();

    }
    public void selectFromDayDropDown (){
        Select dropDownElement = new Select(driver.findElement(dateOfBirthDay));
        dropDownElement.selectByValue(csvReader.readValue("dayofbirth"));
    }
    public void selectFromMonthDropDown (){
        Select dropDownElement = new Select(driver.findElement(dateOfBirthMonth));
        dropDownElement.selectByValue(csvReader.readValue("monthofbirth"));
    }

    public void selectFromYearDropDown (){
        Select dropDownElement = new Select(driver.findElement(dateOfBirthYear));
        dropDownElement.selectByValue(csvReader.readValue("yearofbirth"));
    }

    private By registerButton = By.id("register-button");

    public RegisterationCompletedPage clickRegisterButton(){
        driver.findElement(registerButton).click();
        return new RegisterationCompletedPage(driver);
    }

}
