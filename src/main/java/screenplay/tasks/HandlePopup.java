package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import screenplay.userInterface.HomeLocators;

import java.util.NoSuchElementException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HandlePopup implements Task {

    private final Target closeLocator;
    private final Target iframeLocator;

    public HandlePopup(Target closeLocator, Target iframeLocator) {
        this.closeLocator = closeLocator;
        this.iframeLocator = iframeLocator;
    }

    public static HandlePopup ifPresent(Target iframeLocator, Target closeLocator){
        return instrumented(HandlePopup.class, iframeLocator, closeLocator);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            if(HomeLocators.IFRAME2.resolveFor(actor).isVisible()){
                actor.attemptsTo(
                        Switch.toFrame((WebElement) iframeLocator),
                        Click.on(closeLocator),
                        Switch.toDefaultContext()
                );
            }
        }catch (NoSuchElementException e){

        }
    }
}
