package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends Base{
    //Variables
    String baseUrl = "https://www.ucuzabilet.com/";
    String sabihaText = "Sabiha Gokcen (SAW) - İstanbul, Türkiye";
    String adnanMenderesText = "Izmir Adnan Menderes (ADB) - İzmir, Türkiye";
    String fromIstanbul = "istanbul";

    //Elements
    By SearchForm = By.id("searchForm");
    By FromTxtArea = By.id("from_text");
    By ToTxtArea = By.id("to_text");
    By SabihaSelector = By.cssSelector("li[data-value='"+sabihaText+"']");
    By AdnanMenderesSelector = By.cssSelector("li[data-value='"+adnanMenderesText+"']");
    By DatePicker = By.className("ui-datepicker-trigger");
    By DateForwardBtn = By.cssSelector("a[title='ileri>']>.ui-icon.ui-icon-circle-triangle-e");
    By DateDay = By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last>.ui-datepicker-calendar>tbody>tr:nth-of-type(2)>td:nth-of-type(7)>.ui-state-default");
    By SearchBtn = By.id("searchFormSubmit");

    //Methods
    public void goToUcuzaBilet(){
        driver.get(baseUrl);
    }

    public void fillFrom(){
        waitVisibility(FromTxtArea);
        driver.findElement(FromTxtArea).sendKeys(fromIstanbul);
    }

    public void selectSabiha(){
        waitVisibility(SabihaSelector);
        driver.findElement(SabihaSelector).click();
    }

    public void fillTo(){
        waitVisibility(ToTxtArea);
        driver.findElement(ToTxtArea).sendKeys("ızmir");

    }

    public void selectAdnanMenderes(){
        waitVisibility(AdnanMenderesSelector);
        driver.findElement(AdnanMenderesSelector).click();
    }

    public void selectDate(){
        driver.findElement(DatePicker).click();
        WebElement dateNext = driver.findElement(DateForwardBtn);
        Actions act = new Actions(driver);
        act.doubleClick(dateNext).click().perform();
        //Gün
        driver.findElement(DateDay).click();
    }

    public void clickSearchBtn(){
        driver.findElement(SearchBtn).click();
    }

    //Asserts
    public void verifyUcuzaBiletMainPage(){
        driver.findElement(SearchForm).isDisplayed();
        System.out.println("içerdeyim");
    }

}
