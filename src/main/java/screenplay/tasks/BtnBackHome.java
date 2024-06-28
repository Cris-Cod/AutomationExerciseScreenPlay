package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.ContactUsLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BtnBackHome implements Task {

    public static BtnBackHome btnBackHome(){
        return instrumented(BtnBackHome.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContactUsLocators.BTN_HOMESUCCES)
        );
    }
}
