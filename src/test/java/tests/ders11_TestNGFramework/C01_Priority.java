package tests.ders11_testNGFramework;

import org.testng.annotations.Test;

public class C01_Priority {
    /*
    JUnitte testlerin calisma sirasi bilinemez ve yonetilemez
    Ama TestNG testleri isim sirasina gore calistirir.

    Istersek isim siralamasi disinda da test calisma siralamasi
    yapabiliriz.
    Bunun icin test metotlarina priority degeri atanir
    TestNG kucuk oriority den yuksege dogru calisir.
    Bir metoda priority tanimlanmazsa onu sifir default olarak kabule eder

    Eger iki tane default varsa yani esit oncelikli ise harf sirasina gore calistirir
    Once en kucuk sayi degerine sahip olan calisir sonra sirasiyla buyuge dogru calsimaya
    devam eder.
     */
    @Test(priority = 5)
    public void amazonTest(){
        System.out.println("amazon");
    }
    @Test(priority = -7)
    public void youtubeTest(){
        System.out.println("youtube");
    }
    @Test
    public void wiseQuarterTest(){
        System.out.println("wise quarter");
    }
    @Test
    public void bestBuyTest(){
        System.out.println("bestBuy");
    }

}
