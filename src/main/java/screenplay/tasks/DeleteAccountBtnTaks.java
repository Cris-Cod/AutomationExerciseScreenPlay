package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.HomeLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAccountBtnTaks implements Task {

    public static DeleteAccountBtnTaks deleteAccount(){
        return instrumented(DeleteAccountBtnTaks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeLocators.BTN_DELETE_ACCOUNT)
        );
    }
}
