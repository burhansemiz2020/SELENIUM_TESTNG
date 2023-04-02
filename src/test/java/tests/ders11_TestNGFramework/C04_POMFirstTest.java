package tests.ders11_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C04_POMFirstTest {
    /*
    Page object model javadaki OOP konsepte dayanir. Ornegin
    1. driver classindan webdriver olusturup kullanmak icin static
    yontemi kullaniriz
    2. Locate leri page sayfalarinda yapip, onlara obje
    olusturarak ulasabiliriz.
     */
    @Test
    public void test01() throws InterruptedException {
        //qualitydemy sayfasina gidip
        Driver.getDriver().get("https://www.qualitydemy.com");
        //login linkine tiklayin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.firstLoginLink.click();

        //dogru kullanici adi ve sifre ile giris yapin
        qualitydemyPage.loginEmailBox.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.loginPasswordBox.sendKeys("Nevzat152032");
        qualitydemyPage.loginButton.click();
        //giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.successEnterElement.isDisplayed());
        Thread.sleep(5000);
        //Driver.closeDriver();
    }

}
