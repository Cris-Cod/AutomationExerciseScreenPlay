package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.questions.ValidateText;
import screenplay.tasks.ClickBtnSingUp;
import screenplay.tasks.LoginIncorrectTaks;
import screenplay.tasks.OpenPage;
import screenplay.userInterface.HomeLocators;
import screenplay.userInterface.SingUp_LoginLocators;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


@RunWith(SerenityRunner.class)
public class LoginIncorrectUser {

    private WebDriver driver;
    private Actor user = Actor.named("User");

    @Test
    public void userIncorrect(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();

        user.attemptsTo(
                OpenPage.loginPage()
        );

        String featureHome = user.asksFor(Text.of(HomeLocators.TEXT_CATEGORY));
        user.should(
                seeThat(new ValidateText("Category", featureHome))
        );

        user.attemptsTo(
                ClickBtnSingUp.clickBtnSingUp()
        );

        String txtLogin = user.asksFor(Text.of(SingUp_LoginLocators.TEXT_LOGIN));
        user.should(
                seeThat(new ValidateText("Login to your account", txtLogin))
        );

        user.attemptsTo(
                LoginIncorrectTaks.loginIncorrectTaks("autocod@gmail.com","123456")
        );

        String txtEmailIncorrect = user.asksFor(Text.of(SingUp_LoginLocators.TEXT_EMAIL_INCORRECT));
        System.out.println(txtEmailIncorrect);
        user.should(
                seeThat(new ValidateText("Your email or password is incorrect!", txtEmailIncorrect))
        );

    }
}
