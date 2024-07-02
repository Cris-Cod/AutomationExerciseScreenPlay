package testcases;

import net.serenitybdd.screenplay.Actor;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import screenplay.questions.ValidateElementIsDisplayed;
import screenplay.questions.ValidateText;
import screenplay.tasks.ClickBtnProduct;
import screenplay.tasks.OpenPage;
import screenplay.tasks.ProductPageIterator;
import screenplay.userInterface.GetTextValidate;
import screenplay.userInterface.ProductPageLocators;
import screenplay.userInterface.TextsPages;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerifyDetailAllProducts extends Setup{

    private WebDriver driver;
    private Actor user = Actor.named("User");
    //GetTextValidate getTextValidate = new GetTextValidate();
    @Test
    public void verifyDetailProduct(){
        setUp(driver, user);
        user.attemptsTo(
                OpenPage.loginPage()
        );

        //String ValidateHome = getTextValidate.featureHome;
        user.should(
                seeThat(new ValidateText(TextsPages.category, GetTextValidate.featureHome))
        );
        user.attemptsTo(
                ClickBtnProduct.clickBtnProduct()
        );

        user.should(
                seeThat(new ValidateText(TextsPages.allProducts, GetTextValidate.textAllProducts))
        );

        user.attemptsTo(
                ProductPageIterator.productPage("Blue Top")
        );

        user.should(
                seeThat(new ValidateElementIsDisplayed(ProductPageLocators.TEXT_PRODUCT_NAME))
        );

    }
}
