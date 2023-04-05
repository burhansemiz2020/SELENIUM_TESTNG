package tests.ders13_TestNGreports;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
/*
        data provider bir test methodunun birden fazla deger icin tekrar calistirilmasini saglar
        Ornegin: negatif login testini 5 kullanici adi, 5 password icin denemek isterseniz
        her seferinde yeniden method yazmak yerine tek method ve ona data saglayan data provider ile
        tek test 5 kez calistirilabilir.
         */

public class C03_DataProvider {
    @DataProvider
    public static Object[][] kullaniciListesi() {
        Object[][]kullanicilar={{"ali", "123"}, {"veli", "345"},{"Nigar", "234"},{"Gevre", "123"},{"Dogan","678"}};

        return kullanicilar;
    }


    @Test(dataProvider="kullaniciListesi")
    public void negatifLoginTest(String username, String password) throws InterruptedException {
        // Bir test methodu olusturun
        // qualitydemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // cookies'i kabul edin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        //qualitydemyPage.cookiesKabulButonu.click();

        // Login linkine tiklayin
        qualitydemyPage.firstLoginLink.click();
        Thread.sleep(2000);
        // gecerli kullanici adi ve gecersiz password yazip
        qualitydemyPage.loginEmailBox.sendKeys(username);
        qualitydemyPage.loginPasswordBox.sendKeys(password);
        Thread.sleep(1000);
        // login butonuna bastiginizda
        qualitydemyPage.loginButton.click();
        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.loginEmailBox.isEnabled());
        // ve sayfayi kapatin
        Driver.closeDriver();
    }
}
