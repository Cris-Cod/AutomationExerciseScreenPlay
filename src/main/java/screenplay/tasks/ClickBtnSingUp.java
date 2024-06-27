package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.HomeLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnSingUp implements Task {


    public static ClickBtnSingUp clickBtnSingUp(){
        return instrumented(ClickBtnSingUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeLocators.BTN_SINGUP_LOGIN)
        );
    }
}
