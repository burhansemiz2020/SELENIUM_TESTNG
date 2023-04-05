package tests.ders14_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class C02_CrossBrowserPozitifLoginTest extends TestBaseCross {
    @Test
    public void test01() throws InterruptedException {
        // Bir test methodu olusturun
        // qualitydemy anasayfasina gidin
        driver.get(ConfigReader.getProperty("qdUrl"));
        // cookies'i kabul edin

        driver.findElement(By.xpath("//a[text()='Accept']")).click();

        Thread.sleep(3000);
        // Login linkine tiklayin
        driver.findElement(By.xpath("//a[@class='btn btn-sign-in-simple']")).click();

        // gecerli kullanici adi ve gecerli password yazip

        WebElement emailKutusu= driver.findElement(By.xpath("//*[@id='login-email']"));

        WebElement passwordKutusu= driver.findElement(By.xpath("//*[@id='login-password']"));
        emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUserName"));
        passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        // login butonuna bastiginizda
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        // basarili olarak giris yapildigini test edin
        WebElement successEnterElement = driver.findElement(By.linkText("My courses"));

        Assert.assertTrue(successEnterElement.isEnabled());

        Thread.sleep(3000);

    }
}