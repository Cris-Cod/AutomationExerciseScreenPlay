package screenplay.userInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;

public class GetTextValidate {

    private static Actor user = Actor.named("User");



    public static String featureHome = user.asksFor(Text.of(HomeLocators.TEXT_CATEGORY));
    public static String textAllProducts = user.asksFor(Text.of(ProductPageLocators.TEXT_ALL_PRODUCTS));
}
