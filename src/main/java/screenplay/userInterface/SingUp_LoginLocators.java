package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingUp_LoginLocators {

    public static final Target TEXT_NEW_USER_SIGNUP  = Target.the("text new user singUp").located(By.cssSelector("div[class='signup-form'] h2"));
    public static final Target INPUT_NAME = Target.the("input name").located(By.cssSelector("input[data-qa='signup-name']"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("input email address").located(By.cssSelector("input[data-qa='signup-email']"));
    public static final Target BTN_SIGNUP = Target.the("button signUp").located(By.cssSelector("button[data-qa='signup-button']"));
    public static final Target TEXT_LOGIN = Target.the("Text login to your account").located(By.xpath("//div[@class='login-form']/h2"));
    public static final Target EMAIL_LOGIN = Target.the("input email login").located(By.cssSelector("input[data-qa='login-email']"));
    public static final Target PASSWORD_LOGIN = Target.the("input password login").located(By.cssSelector("input[data-qa='login-password']"));
    public static final Target BTN_LOGIN = Target.the("buttton login").located(By.cssSelector("button[data-qa='login-button']"));
    public static final Target TEXT_EMAIL_INCORRECT = Target.the("Text Email incorrect").located(By.xpath("//div[@class='login-form']/form/p"));
    public static final Target TEXT_EMAIL_EXIST = Target.the("Text Email Address exist").located(By.xpath("//div[@class='signup-form']/form/p"));
}
