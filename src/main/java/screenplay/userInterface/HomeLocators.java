package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeLocators {

    public static final Target TEXT_CATEGORY  = Target.the("text category").located(By.xpath("//div[@class='left-sidebar']/h2"));
    public static final Target BTN_SINGUP_LOGIN = Target.the("Button SingUp-Login").located(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]/a"));
    public static final Target TEXT_LOGGED_NAME = Target.the("text logged user name").located(By.xpath("//div[@class='shop-menu pull-right']/ul/li[10]/a"));
    public static final Target BTN_DELETE_ACCOUNT = Target.the("button delete account").located(By.xpath("//div[@class='shop-menu pull-right']/ul/li[5]/a"));
    public static final Target BTN_LOGOUT = Target.the("button Logout").located(By.xpath("//div[@class='shop-menu pull-right']/ul/li[4]/a"));
    public static final Target BTN_CONTACT_US = Target.the("button Contact US").located(By.xpath("//div[@class='shop-menu pull-right']/ul/li[8]/a"));
    public static final Target BTN_PRODUCTS = Target.the("button Products").located(By.xpath("//div[@class='shop-menu pull-right']/ul/li[2]/a"));

}
