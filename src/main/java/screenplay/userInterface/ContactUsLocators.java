package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactUsLocators {

    public static final Target TEXT_GET_IN_TOUCH  = Target.the("text Get In Touch").located(By.xpath("//div[@class='contact-form']/h2"));
    public static final Target INPUT_NAME  = Target.the("Input Name").located(By.cssSelector("input[data-qa='name']"));
    public static final Target INPUT_EMAIL  = Target.the("Input Email").located(By.cssSelector("input[data-qa='email']"));
    public static final Target INPUT_SUBJECT  = Target.the("Input Subject").located(By.cssSelector("input[data-qa='subject']"));
    public static final Target TEXTAREA_MESSAGE  = Target.the("TextArea Message").located(By.cssSelector("textarea[data-qa='message']"));
    public static final Target INPUT_FILE  = Target.the("Input Upload File").located(By.cssSelector("input[name='upload_file']"));
    public static final Target BTN_SUBMIT  = Target.the("Button Submit").located(By.cssSelector("input[data-qa='submit-button']"));
    public static final Target TEXT_SUCCES  = Target.the("Text Succces").located(By.cssSelector("div[class='status alert alert-success']"));
    public static final Target BTN_HOMESUCCES  = Target.the("Button Home").located(By.cssSelector("a[class='btn btn-success']"));
}
