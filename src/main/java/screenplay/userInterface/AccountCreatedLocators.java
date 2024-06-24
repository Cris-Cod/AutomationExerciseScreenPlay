package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountCreatedLocators {

    public static final Target TEXT_ACCOUNT_CREATED  = Target.the("text account created").located(By.cssSelector("div[class='col-sm-9 col-sm-offset-1'] h2"));
    public static final Target BTN_CONTINUE  = Target.the("button continue").located(By.cssSelector("a[data-qa='continue-button']"));
}
