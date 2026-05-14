package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_Soru extends BaseDriver {
    /*
  Senaryo;
  1- Brands menusune gidiniz.
  2- Burada her bir markanın üstünde yer alan harf ile başladığını doğrulayınız
 */
    @Test
    public void BrandsTest() {
        WebElement brandsLink = driver.findElement(By.linkText("Brands"));
        brandsLink.click();

        List<WebElement> harfler=driver.findElements(By.cssSelector("[id='content'] > h2"));
        List<WebElement> markalar=driver.findElements(By.cssSelector("[id='content'] > div"));//bunun içideki divlerde

        for (int i = 0; i < harfler.size(); i++) {
            System.out.println("harf="+harfler.get(i).getText());
            System.out.println("markaların olduğu html blokları ="+ markalar.get(i).getText());
        }

        for (int i = 0; i < harfler.size(); i++) {
            String harf=harfler.get(i).getText();

            //marka bloklarındaki div leri alarak markalara tek tek ulaşabildim, list olarak
            List<WebElement> harfinMarkalari=markalar.get(i).findElements(By.tagName("div")); // her bir marka adı bulundu

            for (WebElement markaAdi : harfinMarkalari)
            {
                System.out.println(markaAdi.getText());

                Assert.assertTrue(markaAdi.getText().startsWith(harf)," Harf ve marka uyumu bulunamadi");
            }

        }


    }
}
