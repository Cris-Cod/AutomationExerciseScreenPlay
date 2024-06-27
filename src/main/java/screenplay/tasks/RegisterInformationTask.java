package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import screenplay.userInterface.RegisterInformation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterInformationTask implements Task {

    private final String password;
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String address;
    private final String state;
    private final String city;
    private final String zipCode;
    private final String mobileNumber;
    private final String day;
    private final String month;
    private final String year;
    private final String country;

    public RegisterInformationTask(String password, String firstName, String lastName, String company, String address, String state, String city, String zipCode, String mobileNumber, String day, String month, String year, String country) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
        this.day = day;
        this.month = month;
        this.year = year;
        this.country = country;
    }

    public static RegisterInformationTask registerInformationTask(String password, String firstName, String lastName, String company, String address, String state, String city, String zipCode, String mobileNumber, String day, String month, String year, String country){
        return instrumented(RegisterInformationTask.class, password, firstName, lastName, company, address, state, city, zipCode, mobileNumber, day, month, year, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(RegisterInformation.INPUT_PASSWORD),
                SelectFromOptions.byVisibleText(day).from(RegisterInformation.SELECT_DAY),
                SelectFromOptions.byVisibleText(month).from(RegisterInformation.SELECT_MONTH),
                SelectFromOptions.byVisibleText(year).from(RegisterInformation.SELECT_YEAR),
                Click.on(RegisterInformation.CHECKBOX_NEWSLETTER),
                Enter.theValue(firstName).into(RegisterInformation.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(RegisterInformation.INPUT_LASTNAME),
                Enter.theValue(company).into(RegisterInformation.INPUT_COMPANY),
                Enter.theValue(address).into(RegisterInformation.INPUT_ADDRESS),
                SelectFromOptions.byVisibleText(country).from(RegisterInformation.SELECT_COUNTRY),
                Enter.theValue(state).into(RegisterInformation.INPUT_STATE),
                Enter.theValue(city).into(RegisterInformation.INPUT_CITY),
                Enter.theValue(zipCode).into(RegisterInformation.INPUT_ZIPCODE),
                Enter.theValue(mobileNumber).into(RegisterInformation.INPUT_MOBILE_NUMBER),
                Click.on(RegisterInformation.BTN_CREATE_ACCOUNT)
        );

    }
}
