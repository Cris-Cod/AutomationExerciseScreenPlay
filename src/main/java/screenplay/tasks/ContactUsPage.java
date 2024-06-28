package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.userInterface.ContactUsLocators;

import java.nio.file.Path;
import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ContactUsPage implements Task {

    private final String name;
    private final String email;
    private final String subject;
    private final String message;

    private final Path path = Path.of("src/test/resources/images/prueba.jpg");

    public ContactUsPage(String name, String email, String subject, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public static ContactUsPage contactUsPage(String name, String email, String subject, String message){
        return instrumented(ContactUsPage.class, name, email, subject, message);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(ContactUsLocators.INPUT_NAME),
                Enter.theValue(email).into(ContactUsLocators.INPUT_EMAIL),
                Enter.theValue(subject).into(ContactUsLocators.INPUT_SUBJECT),
                Enter.theValue(message).into(ContactUsLocators.TEXTAREA_MESSAGE),
                Upload.theFile(path).to(ContactUsLocators.INPUT_FILE),
                Click.on(ContactUsLocators.BTN_SUBMIT),
                WaitUntil.the(alertIsPresent()).forNoMoreThan(Duration.ofSeconds(10)),
                Switch.toAlert().andAccept()
        );
    }
}
