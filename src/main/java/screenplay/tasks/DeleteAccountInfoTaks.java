package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.DeleteAccountLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAccountInfoTaks implements Task {


    public static DeleteAccountInfoTaks deleteAccountInfo(){
        return instrumented(DeleteAccountInfoTaks.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DeleteAccountLocators.BTN_CONTINUE)
        );
    }
}
