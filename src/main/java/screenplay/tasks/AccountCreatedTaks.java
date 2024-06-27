package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.AccountCreatedLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccountCreatedTaks implements Task {

    public static AccountCreatedTaks accountCreated(){
        return instrumented(AccountCreatedTaks.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccountCreatedLocators.BTN_CONTINUE)
        );
    }
}
