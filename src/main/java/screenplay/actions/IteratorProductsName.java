package screenplay.actions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.ProductPageLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IteratorProductsName implements Task {

    private final String nameProduct;

    public IteratorProductsName(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public static IteratorProductsName iteratorProducts(String nameProduct){
        return instrumented(IteratorProductsName.class, nameProduct);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades products = ProductPageLocators.TEXT_CARDS.resolveAllFor(actor);
        for (int i = 0; i < products.size(); i++){
            String nameProdict = products.get(i).getText();
            if (nameProdict.equalsIgnoreCase(nameProduct)){
                actor.attemptsTo(
                        Click.on(ProductPageLocators.BTN_VIEW_PRODUCTS)
                );
            }
        }
    }
}
