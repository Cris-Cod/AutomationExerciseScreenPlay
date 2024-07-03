package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.questions.Text;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import screenplay.questions.ValidateText;
import screenplay.tasks.ClickBtnProduct;
import screenplay.tasks.HandlePopup;
import screenplay.tasks.OpenPage;
import screenplay.tasks.SerachProductTask;
import screenplay.userInterface.HomeLocators;
import screenplay.userInterface.ProductPageLocators;
import screenplay.userInterface.TextsPages;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


@RunWith(SerenityRunner.class)
public class SearchProduct extends Setup{

    String productSearch = "Frozen Tops For Kids";

    @Before
    public void setUpTest(){
        setUp();
    }

    @Test
    public void searchProduct(){
        user.attemptsTo(
                OpenPage.loginPage()
        );

        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.AD_DIMMIS_BUTTON)
        );

        user.should(
                seeThat(new ValidateText(TextsPages.category, GetTextValidate.featureHome))
        );
        user.attemptsTo(
                ClickBtnProduct.clickBtnProduct()
        );

        user.attemptsTo(
                HandlePopup.ifPresent(HomeLocators.AD_DIMMIS_BUTTON)
        );

        String textAllProducts = user.asksFor(Text.of(ProductPageLocators.TEXT_ALL_PRODUCTS));
        user.should(
                seeThat(new ValidateText(TextsPages.allProducts, textAllProducts))
        );

        user.attemptsTo(
                SerachProductTask.serachProductTask(productSearch)
        );

        String textsearchProduct = user.asksFor(Text.of(ProductPageLocators.TEXT_SEARCH_PRODUCTS));
        user.should(
                seeThat(new ValidateText(TextsPages.searchProduct, textsearchProduct))
        );

        String product = user.asksFor(Text.of(ProductPageLocators.TEXT_CARDS));
        user.should(
                seeThat(new ValidateText(productSearch, product))
        );

    }

}
