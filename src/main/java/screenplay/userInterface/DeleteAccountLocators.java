package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeleteAccountLocators {

    public static final Target TEXT_ACCOUNT_DELETED  = Target.the("text account deleted").located(By.xpath("//div[@class='col-sm-9 col-sm-offset-1']/h2"));
    public static final Target BTN_CONTINUE  = Target.the("button continue").located(By.xpath("//a[@data-qa='continue-button']"));
}
