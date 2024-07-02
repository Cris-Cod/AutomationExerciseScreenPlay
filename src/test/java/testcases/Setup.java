package testcases;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.userInterface.GetTextValidate;

public class Setup {

    private WebDriver driver;
    private Actor user = Actor.named("User");

    public void setUp(WebDriver driver, Actor user){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();
    }
}
