package Registeration;

import Base.BaseTests;
import Pages.RegisterationCompletedPage;
import Pages.RegisterationPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegisterTest extends BaseTests {
   @Test
   public void testSuccessfulRegister(){
       RegisterationPage registerationPage = homePage.clickRegister();
       registerationPage.setFirstName();
       registerationPage.setLastName();
      registerationPage.selectFromDayDropDown();
      registerationPage.selectFromMonthDropDown();
      registerationPage.selectFromYearDropDown();
       registerationPage.setEmail();
       registerationPage.setCompany();
       registerationPage.setPassword();
       registerationPage.setConfirmPassword();

       RegisterationCompletedPage registerationCompletedPage = registerationPage.clickRegisterButton();
       assertEquals(registerationCompletedPage.getAlertText(),"Your registration completed","");


    }
}
