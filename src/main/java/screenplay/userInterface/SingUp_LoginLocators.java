package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingUp_LoginLocators {

    public static final Target TEXT_NEW_USER_SIGNUP  = Target.the("text new user singUp").located(By.cssSelector("div[class='signup-form'] h2"));
    public static final Target INPUT_NAME = Target.the("input name").located(By.cssSelector("input[data-qa='signup-name']"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("input email address").located(By.cssSelector("input[data-qa='signup-email']"));
    public static final Target BTN_SIGNUP = Target.the("button signUp").located(By.cssSelector("button[data-qa='signup-button']"));

}
