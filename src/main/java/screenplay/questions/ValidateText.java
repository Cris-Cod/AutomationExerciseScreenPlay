package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateText implements Question {

    private final String actual;
    private final String expected;

    public ValidateText(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }


    @Override
    public Object answeredBy(Actor actor) {
        return actual.equalsIgnoreCase(expected);
    }

    public static ValidateText areEqual(String actual, String expected){
        return new ValidateText(actual, expected);
    }
}
