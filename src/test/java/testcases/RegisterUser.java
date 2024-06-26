package testcases;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.userInterface.HomeLocators;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

@RunWith(SerenityRunner.class)
public class RegisterUser {

    private WebDriver driver;
    private Actor user = Actor.named("User");

    @Test
    public void addUser(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();

    }
}
