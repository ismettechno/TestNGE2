package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _08_Assertions {

    @Test
    public void equalsOrnek() {
        String s1 = "Merhaba";
        String s2 = "Merhaba";

        // AEM
        Assert.assertEquals(s1,s2, "Oluşan la beklenen aynı değil");
    }

    @Test
    public void NotEqualsOrnek() {
        String s1 = "Merhaba";
        String s2 = "merhaba";

        Assert.assertNotEquals(s1,s2,"Oluşan la beklenen eşit oldu");
    }

    @Test
    public void TrueOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        Assert.assertEquals(s1.equals(s2),  "Oluşan la beklenen aynı değil");
    }

    @Test
    public void TrueOrnek_2() {
        int s1 = 4;
        int s2 = 4;

        Assert.assertTrue(s1==s2,  "Oluşan la beklenen aynı değil");
    }





}
