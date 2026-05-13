package Gun04;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _02_SearchFunctionalityPD extends BaseDriverParameter {
    /*
      Senaryo ;
      1- Siteyi açınız.
      2- mac(xml den gönderilecek) kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung(xml den gönderilecek için de yapınız
    */

    @Test
    @Parameters("searchText")
    public void SearchFunction(String aranacakKelime)
    {
        WebElement searchInput=driver.findElement(By.name("search"));
        searchInput.sendKeys(aranacakKelime+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.xpath("//*[@class='caption']/h4/a"));

        for (WebElement e : captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime));
    }





}
