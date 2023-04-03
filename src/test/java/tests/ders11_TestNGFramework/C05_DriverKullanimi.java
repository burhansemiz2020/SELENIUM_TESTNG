package tests.ders11_testNGFramework;

import org.testng.annotations.Test;
import utilities.Driver;

public class C05_DriverKullanimi {
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("hettps://www.youtube.com");
        Thread.sleep(4000);
        Driver.getDriver().get("hettps://www.wisequarter.com");
        Thread.sleep(4000);
        Driver.getDriver().get("hettps://www.amazon.com");
        Thread.sleep(4000);
        //Driver.closeDriver();


    }
}
