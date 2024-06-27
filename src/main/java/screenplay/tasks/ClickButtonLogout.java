package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.HomeLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickButtonLogout implements Task {


    public static ClickButtonLogout btnLogout(){
        return instrumented(ClickButtonLogout.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeLocators.BTN_LOGOUT)
        );
    }
}
