package tests.ders13_TestNGreports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluPozitifLoginTest extends TestBaseRapor {
    /*
        Yeni hedefimiz test datalarini manuel olarak girmek degil
        test datalarini configuration.properties dosyasindan alip kullanmak
        Boylece test datalarinda herhangi bir update yapilmasi istendiginde
        sadece configuration.properties'deki degeri degistirerek
        tum testlerimizi update edebilmek
     */

    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Pozitif Login Testi", "Dogru bilgilerle giris yapilabilmeli");
        // Bir test methodu olusturun
        // qualitydemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("qualityDemy anasayfaya gidildi");
        // cookies'i kabul edin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.cookiesKabulButonu.click();
        extentTest.info("cookies kabul edildi");
        Thread.sleep(2000);
        // Login linkine tiklayin
        qualitydemyPage.firstLoginLink.click();
        extentTest.info("ilk login linkine tiklandi");
        Thread.sleep(2000);
        // gecerli kullanici adi ve gecerli password yazip

        qualitydemyPage.loginEmailBox.sendKeys(ConfigReader.getProperty("qdGecerliUserName"));
        qualitydemyPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("gecerli kullanici adi ve sifre girildi");

        // login butonuna bastiginizda
        qualitydemyPage.loginButton.click();
        extentTest.info("login butonuna basildi");
        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(qualitydemyPage.successEnterElement.isEnabled());
        extentTest.info("basarili sekilde giris yapildigi test edildi");
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
