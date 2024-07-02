package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class ValidateElementIsDisplayed implements Question<Boolean> {

    private final Target target;

    public ValidateElementIsDisplayed(Target target) {
        this.target = target;
    }

    public ValidateElementIsDisplayed validateElementIsDisplayed(Target target){
        return new ValidateElementIsDisplayed(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement element = target.resolveFor(actor);
        return element.isDisplayed();
    }
}
