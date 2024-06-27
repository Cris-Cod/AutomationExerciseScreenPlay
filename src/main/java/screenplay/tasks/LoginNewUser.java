package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.userInterface.HomeLocators;
import screenplay.userInterface.SingUp_LoginLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginNewUser implements Task {

    private final String name;
    private final String email;

    public LoginNewUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static LoginNewUser loginNewUser(String name, String email){
        return instrumented(LoginNewUser.class, name, email);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(SingUp_LoginLocators.INPUT_NAME),
                Enter.theValue(email).into(SingUp_LoginLocators.INPUT_EMAIL_ADDRESS),
                Click.on(SingUp_LoginLocators.BTN_SIGNUP)
        );
    }
}
