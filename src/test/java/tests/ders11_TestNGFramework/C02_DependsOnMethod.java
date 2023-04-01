package tests.ders11_TestNGFramework;

import org.testng.annotations.Test;
/*
dependdsOnMethods ozelligi ile
bir methodun calismasini, basla methodun
calismasindan sonraya ayaralayabilirsiniz.
Bu durumda bagli olunan method calisip,
passed olmadan bagli olan method calismaz
 */

public class C02_DependsOnMethod {
    @Test(priority = 5)
    public void amazonTest(){
        System.out.println("amazon");
    }
    @Test(priority = -7,dependsOnMethods = "amazonTest")
    public void youtubeTest(){
        System.out.println("youtube");
    }
    @Test
    public void wiseQuarterTest(){
        System.out.println("wise quarter");
    }
    @Test(dependsOnMethods = "youtubeTest")
    public void bestBuyTest(){
        System.out.println("bestBuy");
    }
}
