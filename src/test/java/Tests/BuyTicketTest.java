package Tests;

import Pages.Base;
import Pages.MainPage;
import Pages.ResultPage;
import Pages.ReservationPage;
import org.junit.*;

public class BuyTicketTest extends Base {
    @Test
    public void BuyTicketAndGoToIzmir(){
        MainPage mainPage = new MainPage();
        ResultPage resultPage = new ResultPage();
        ReservationPage resPage = new ReservationPage();

        mainPage.goToUcuzaBilet();
        mainPage.verifyUcuzaBiletMainPage();
        mainPage.waitForMe();
        //mainPage.fillFrom();
        //mainPage.selectSabiha();
        //mainPage.waitForMe();
        //mainPage.fillTo();
        //mainPage.selectAdnanMenderes();
        //mainPage.waitForMe();
        //mainPage.selectDate();
        //mainPage.clickSearchBtn();
        //resultPage.verifyResultPage();
        //resultPage.clickFirstSelectButton();
        //resPage.verifyReservationPage();
        //resPage.fillCreditCardForm();
        //resPage.selectCreditCardMonth();
        //resPage.selectCreditCardYear();
    }

}
