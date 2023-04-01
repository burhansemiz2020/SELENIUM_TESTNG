package tests.ders12_assertions_POMGelistirmeler;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NegatifLoginTest {
    // Bir test methodu olusturun
    // qualitydemy anasayfasina gidin
    // cookies'i kabul edin
    // Login linkine tiklayin
    // gecerli kullanici adi ve gecersiz password yazip
    // login butonuna bastiginizda
    // basarili olarak giris yapilamadigini test edin
    // ve sayfayi kapatin

    @Test
    public void negatifLoginTest(){
        // Bir test methodu olusturun
        // qualitydemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // cookies'i kabul edin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.cookiesKabulButonu.click();

        // Login linkine tiklayin
        qualitydemyPage.firstLoginLink.click();
        // gecerli kullanici adi ve gecersiz password yazip
        qualitydemyPage.loginEmailBox.sendKeys(ConfigReader.getProperty("qdGecerliUserName"));
        qualitydemyPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        // login butonuna bastiginizda
        qualitydemyPage.loginButton.click();
        // basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.loginEmailBox.isEnabled());
        // ve sayfayi kapatin
        Driver.closeDriver();
    }








}
