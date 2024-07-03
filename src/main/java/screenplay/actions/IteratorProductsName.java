package screenplay.actions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.userInterface.ProductPageLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IteratorProductsName implements Task {

    private final String nameP;

    public IteratorProductsName(String nameP) {
        this.nameP = nameP;
    }


    public static IteratorProductsName iteratorProducts(String nameP){
        return instrumented(IteratorProductsName.class, nameP);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades products = ProductPageLocators.TEXT_CARDS.resolveAllFor(actor);
        ListOfWebElementFacades btn_products = ProductPageLocators.BTN_VIEW_PRODUCTS.resolveAllFor(actor);
        for (int i = 0; i < products.size(); i++){
            String nameProduct = products.get(i).getText();
            System.out.println(nameProduct);
            if (nameProduct.equalsIgnoreCase(nameP)){
                actor.attemptsTo(
                        Click.on(btn_products.get(i))
                );
                break;
            }
        }
    }
}
