package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.userInterface.SingUp_LoginLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginIncorrectTaks implements Task {

    private final String email;
    private final String password;

    public LoginIncorrectTaks(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static LoginIncorrectTaks loginIncorrectTaks(String email, String password){
        return instrumented(LoginIncorrectTaks.class, email, password);
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
