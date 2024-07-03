package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClosePopUp implements Task {


    public static ClosePopUp closePopUp(){
        return instrumented(ClosePopUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toAlert().andAccept()
        );
    }
}
