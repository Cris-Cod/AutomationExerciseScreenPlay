package testcases;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    protected WebDriver driver;
    protected static Actor user;

    public void setUp(){
        driver = new ChromeDriver();
        user = Actor.named("User");
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();
    }
}
