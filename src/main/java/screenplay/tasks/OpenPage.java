package screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage {
    public static Performable loginPage(){
        return Task.where("{0} open the login page",
                Open.browserOn().thePageNamed("home.page")
        );
    }
}
