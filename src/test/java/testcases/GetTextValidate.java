package testcases;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.userInterface.HomeLocators;
import screenplay.userInterface.ProductPageLocators;


public class GetTextValidate extends Setup{

    public static String featureHome = user.asksFor(Text.of(HomeLocators.TEXT_CATEGORY));
    public static String textAllProducts = user.asksFor(Text.of(ProductPageLocators.TEXT_ALL_PRODUCTS));
}
