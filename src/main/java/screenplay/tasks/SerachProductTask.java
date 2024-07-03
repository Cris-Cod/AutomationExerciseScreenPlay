package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.userInterface.ProductPageLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SerachProductTask implements Task {

    private final String productToSearch;

    public SerachProductTask(String productToSearch) {
        this.productToSearch = productToSearch;
    }

    public static SerachProductTask serachProductTask(String productToSearch){
        return instrumented(SerachProductTask.class, productToSearch);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(productToSearch).into(ProductPageLocators.INPUT_SEARCH_PRODUCT),
                Click.on(ProductPageLocators.BUTTON_SEARCH_PRODUCT)
        );

    }
}
