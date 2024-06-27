package testcases;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.questions.ValidateText;
import screenplay.tasks.*;
import screenplay.userInterface.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/data.csv")
public class RegisterUser {

    private WebDriver driver;
    private Actor user = Actor.named("User");

    private String name;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private String company;
    private String address;
    private String state;
    private String city;
    private String zipcode;
    private String mobileNumber;
    private String day;
    private String month;
    private String year;
    private String country;

    @Test
    public void addUser(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();


        user.attemptsTo(
                OpenPage.loginPage()
        );

        String featureHome = user.asksFor(Text.of(HomeLocators.TEXT_CATEGORY));


        //System.out.println(featureHome);

       user.should(
               seeThat(new ValidateText("Category", featureHome))
        );

       user.attemptsTo(
               ClickBtnSingUp.clickBtnSingUp()
       );

       String txtSingup = user.asksFor(Text.of(SingUp_LoginLocators.TEXT_NEW_USER_SIGNUP));
       user.should(
               seeThat(new ValidateText("New User Signup!", txtSingup))
       );

        user.attemptsTo(
                LoginNewUser.loginNewUser(name,email)
        );


        String txtAcountInformation = user.asksFor(Text.of(RegisterInformation.TEXT_ENTER_ACCOUNT_INFORMATION));
        user.should(
                seeThat(new ValidateText("Enter Account Information", txtAcountInformation))
        );

        user.attemptsTo(
                RegisterInformationTask.registerInformationTask(password,firstname,lastname,company,address,state,city,zipcode,mobileNumber,day,month,year,country)
        );

        String txtAccountCreated = user.asksFor(Text.of(AccountCreatedLocators.TEXT_ACCOUNT_CREATED));
        user.should(
                seeThat(new ValidateText("ACCOUNT CREATED!", txtAccountCreated))
        );

        user.attemptsTo(
                AccountCreatedTaks.accountCreated()
        );

        String txtLoggedUsername = user.asksFor(Text.of(HomeLocators.TEXT_LOGGED_NAME));
        user.should(
                seeThat(new ValidateText("Logged in as "+name+"", txtLoggedUsername))
        );


        user.attemptsTo(
                DeleteAccountBtnTaks.deleteAccount()
        );

        String txtDeleteAccount = user.asksFor(Text.of(DeleteAccountLocators.TEXT_ACCOUNT_DELETED));
        user.should(
                seeThat(new ValidateText("ACCOUNT DELETED!", txtDeleteAccount))
        );

        user.attemptsTo(
                DeleteAccountInfoTaks.deleteAccountInfo()
        );

    }
}
