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
import screenplay.tasks.BtnBackHome;
import screenplay.tasks.ClickBtnContactUs;
import screenplay.tasks.ContactUsPage;
import screenplay.tasks.OpenPage;
import screenplay.userInterface.ContactUsLocators;
import screenplay.userInterface.HomeLocators;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
@RunWith(SerenityRunner.class)
public class ContactUsForm {
    private WebDriver driver;
    private Actor user = Actor.named("User");
    String name = "Autocode";
    String email = "autocode@gmail.com";
    String subject = "Testing";
    String message = "Testing, Testing";

    @Test
    public void contactFornm(){
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
                ClickBtnContactUs.clickBtnContactUs()
        );

        String txtGetInTouch = user.asksFor(Text.of(ContactUsLocators.TEXT_GET_IN_TOUCH));
        user.should(
                seeThat(new ValidateText("GET IN TOUCH", txtGetInTouch))
        );

        user.attemptsTo(
                ContactUsPage.contactUsPage(name,email,subject,message)
        );

        String txtSucces = user.asksFor(Text.of(ContactUsLocators.TEXT_SUCCES));
        user.should(
                seeThat(new ValidateText("Success! Your details have been submitted successfully.", txtSucces))
        );

        user.attemptsTo(
                BtnBackHome.btnBackHome()
        );

        String categoryHome = user.asksFor(Text.of(HomeLocators.TEXT_CATEGORY));
        user.should(
                seeThat(new ValidateText("Category", categoryHome))
        );

    }
}
