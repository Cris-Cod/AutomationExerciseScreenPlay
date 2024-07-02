package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import screenplay.actions.IteratorProductsName;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductPageIterator implements Task {

    private final String productName;

    public ProductPageIterator(String productName) {
        this.productName = productName;
    }

    public static ProductPageIterator productPage(String productName){
        return instrumented(ProductPageIterator.class, productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IteratorProductsName.iteratorProducts(productName)
        );
    }
}
