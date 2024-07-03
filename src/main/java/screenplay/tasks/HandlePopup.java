package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;

import java.util.NoSuchElementException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HandlePopup implements Task {

    private final Target closeLocator;

    public HandlePopup(Target closeLocator) {
        this.closeLocator = closeLocator;
    }

    public static HandlePopup ifPresent(Target closeLocator){
        return instrumented(HandlePopup.class, closeLocator);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            if(closeLocator.resolveFor(actor).isVisible()){
                actor.attemptsTo(
                        Switch.toFrame("aswift_6"),
                        Click.on(closeLocator),
                        Switch.toDefaultContext()
                );
            }
        }catch (NoSuchElementException e){

        }
    }
}
