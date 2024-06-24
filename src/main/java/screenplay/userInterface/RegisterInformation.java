package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterInformation {

    public static final Target TEXT_ENTER_ACCOUNT_INFORMATION  = Target.the("text enter account information").located(By.cssSelector("div[class='login-form'] h2"));
    public static final Target CHECKBOX_TITLE  = Target.the("checkbox title").located(By.cssSelector("label[for='id_gender1']"));
    public static final Target INPUT_NAME = Target.the("input name").located(By.id("name"));
    public static final Target INPUT_EMAIL = Target.the("input email").located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("input password").located(By.id("password"));
    public static final Target SELECT_DAY = Target.the("select day").located(By.id("days"));
    public static final Target SELECT_MONTH = Target.the("select day").located(By.id("months"));
    public static final Target SELECT_YEAR = Target.the("select day").located(By.id("years"));
    public static final Target CHECKBOX_NEWSLETTER = Target.the("checkbox newsletter").located(By.id("newsletter"));
    public static final Target INPUT_FIRSTNAME = Target.the("input firtsName").located(By.id("first_name"));
    public static final Target INPUT_LASTNAME = Target.the("input lastname").located(By.id("last_name"));
    public static final Target INPUT_COMPANY = Target.the("input company").located(By.id("company"));
    public static final Target INPUT_ADDRESS = Target.the("input address").located(By.id("address1"));
    public static final Target SELECT_COUNTRY = Target.the("select country").located(By.id("country"));
    public static final Target INPUT_STATE = Target.the("input state").located(By.id("state"));
    public static final Target INPUT_CITY = Target.the("input city").located(By.id("city"));
    public static final Target INPUT_ZIPCODE = Target.the("input zipcode").located(By.id("zipcode"));
    public static final Target INPUT_MOBILE_NUMBER = Target.the("input mobile number").located(By.id("mobile_number"));
    public static final Target BTN_CREATE_ACCOUNT = Target.the("button create account").located(By.cssSelector("button[data-qa='create-account']"));
}
