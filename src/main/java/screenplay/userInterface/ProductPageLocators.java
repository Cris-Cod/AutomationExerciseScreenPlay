package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPageLocators {

    public static final Target TEXT_ALL_PRODUCTS  = Target.the("text All Products").located(By.cssSelector("div[class='features_items'] h2"));
    public static final Target CARDS_ALL_PRODUCTS = Target.the("cards all products").located(By.xpath("//div[@class='features_items']/div/div"));
    public static final Target TEXT_CARDS = Target.the("text cards").located(By.xpath("//div[@class='product-image-wrapper']/div/div/h2"));
    public static final Target BTN_VIEW_PRODUCTS = Target.the("button view products").located(By.xpath("//div[@class='choose']/ul/li/a"));
    public static final Target TEXT_PRODUCT_NAME = Target.the("text product name").located(By.xpath("//div[@class='product-information']/h2"));
    public static final Target TEXT_PRODUCT_CATEGORY = Target.the("text product category").located(By.xpath("//div[@class='product-information']/p[1]"));
    public static final Target TEXT_PRODUCT_PRICE = Target.the("text product price").located(By.xpath("//div[@class='product-information']/span/span"));
    public static final Target TEXT_PRODUCT_AVAILABILITY = Target.the("text product availability").located(By.xpath("//div[@class='product-information']/p[2]"));
    public static final Target TEXT_PRODUCT_CONDITION = Target.the("text product condition").located(By.xpath("//div[@class='product-information']/p[3]"));
    public static final Target TEXT_PRODUCT_BRAND = Target.the("text product brand").located(By.xpath("//div[@class='product-information']/p[4]"));
}
