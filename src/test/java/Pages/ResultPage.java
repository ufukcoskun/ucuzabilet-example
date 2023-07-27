package Pages;

import org.openqa.selenium.By;

public class ResultPage extends Base {

    //Elements
    By CalendarGraph = By.cssSelector("#monthCalendarGraphContent>.calendarGraphArea");
    By SelectFirstFlight = By.cssSelector("#flights-table tr#flights-1 .btn-select-flight");

    //Methods
    public void clickFirstSelectButton(){
        driver.findElement(SelectFirstFlight).click();
    }

    //Asserts
    public void verifyResultPage(){
        waitVisibility(CalendarGraph);
        driver.findElement(CalendarGraph).isDisplayed();
        System.out.println("result page is ok");
    }

}
