package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.userInterface.HomeLocators;
import screenplay.userInterface.SingUp_LoginLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginAccountTask implements Task {

    private final String email;
    private final String password;

    public LoginAccountTask(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static LoginAccountTask loginAccount(String email, String password){
        return instrumented(LoginAccountTask.class, email, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(SingUp_LoginLocators.EMAIL_LOGIN),
                Enter.theValue(password).into(SingUp_LoginLocators.PASSWORD_LOGIN),
                Click.on(SingUp_LoginLocators.BTN_LOGIN)
        );
    }
}
