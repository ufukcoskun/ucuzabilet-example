package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage extends Base{

    //Elements
    By FlightDetailArea = By.className("flightDetailAltArea");
    By MakeResButton = By.id("makeResButton");
    By CardFormName = By.cssSelector("#creditCardForm input[name='creditCardOwnerName']");
    By CardFormNumber = By.cssSelector("#creditCardForm input[name='creditCardNumber']");
    By CardFormCVV = By.cssSelector("#creditCardForm input[name='creditCardCVC']");
    By CardValidMonth = By.id("creditCardValidMonth");
    By CardValidYear = By.id("creditCardValidYear");

    //Methods
    public void fillCreditCardForm(){
        driver.findElement(CardFormName).sendKeys("Alessandro Del Piero");
        driver.findElement(CardFormNumber).sendKeys("4355084355084358");
        driver.findElement(CardFormCVV).sendKeys("000");
    }

    public void selectCreditCardMonth(){
        Select dropdown = new Select(driver.findElement(CardValidMonth));
        dropdown.selectByValue("08");
    }

    public void selectCreditCardYear(){
        Select dropdown = new Select(driver.findElement(CardValidYear));
        dropdown.selectByValue("2026");
    }

    //Asserts
    public void verifyReservationPage(){
        waitVisibility(FlightDetailArea);
        waitVisibility(MakeResButton);
        driver.findElement(FlightDetailArea).isDisplayed();
        driver.findElement(MakeResButton).isEnabled();
        System.out.println("reservation page is ok");
    }
}
