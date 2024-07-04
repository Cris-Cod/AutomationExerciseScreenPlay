package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import screenplay.questions.ValidateElementIsDisplayed;
import screenplay.questions.ValidateText;
import screenplay.tasks.*;
import screenplay.userInterface.HomeLocators;
import screenplay.userInterface.ProductPageLocators;
import screenplay.userInterface.TextsPages;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

//@RunWith(SerenityRunner.class)
public class VerifyDetailAllProducts extends Setup{


    //GetTextValidate getTextValidate = new GetTextValidate();

    @Before
    public void setUpTest(){
        setUp();
    }

    @Test
    public void verifyDetailProduct(){
        user.attemptsTo(
                OpenPage.loginPage()
        );

        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.IFRAME, HomeLocators.AD_DIMMIS_BUTTON)
        );

        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.IFRAME2, HomeLocators.AD_DIMMIS_BUTTON)
        );


        //String ValidateHome = getTextValidate.featureHome;
        user.should(
                seeThat(new ValidateText(TextsPages.category, GetTextValidate.featureHome))
        );
        user.attemptsTo(
                ClickBtnProduct.clickBtnProduct()
        );

        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.IFRAME, HomeLocators.AD_DIMMIS_BUTTON)
        );

        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.IFRAME2, HomeLocators.AD_DIMMIS_BUTTON)
        );


        /*user.attemptsTo(
                ClosePopUp.closePopUp()
        );*/

        String textAllProducts = user.asksFor(Text.of(ProductPageLocators.TEXT_ALL_PRODUCTS));
        user.should(
                seeThat(new ValidateText(TextsPages.allProducts, textAllProducts))
        );

        user.attemptsTo(
               ProductPageIterator.productPage("Sleeveless Dress")
        );


        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.IFRAME, HomeLocators.AD_DIMMIS_BUTTON)
        );

        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.IFRAME2, HomeLocators.AD_DIMMIS_BUTTON)
        );


       user.should(
                seeThat(new ValidateElementIsDisplayed(ProductPageLocators.TEXT_PRODUCT_NAME))
        );

    }
}
