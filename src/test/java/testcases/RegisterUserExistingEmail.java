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
import screenplay.tasks.LoginNewUser;
import screenplay.tasks.OpenPage;
import screenplay.userInterface.HomeLocators;
import screenplay.userInterface.SingUp_LoginLocators;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
@RunWith(SerenityRunner.class)
public class RegisterUserExistingEmail {

    private WebDriver driver;
    private Actor user = Actor.named("User");

    @Test
    public void RegisterEmailExisting() {
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();

        String name = "Autocode";
        String email = "autocode@gmail.com";

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

        String txtSingup = user.asksFor(Text.of(SingUp_LoginLocators.TEXT_NEW_USER_SIGNUP));
        user.should(
                seeThat(new ValidateText("New User Signup!", txtSingup))
        );

        user.attemptsTo(
                LoginNewUser.loginNewUser(name,email)
        );


        String txtEmailExist = user.asksFor(Text.of(SingUp_LoginLocators.TEXT_EMAIL_EXIST));
        user.should(
                seeThat(new ValidateText("Email Address already exist!", txtEmailExist))
        );

    }
}
