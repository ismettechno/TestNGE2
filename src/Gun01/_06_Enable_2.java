package Gun01;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class _06_Enable_2 extends BaseDriver {

    @Test
    public void Test1(){
        System.out.println("test 1 çalıştı");
        driver.get("https://www.facebook.com/");
    }

    @Test(enabled = false)
    public void Test2(){
        System.out.println("test 2 çalıştı");
    }

    @Test
    public void Test3(){
        System.out.println("test 3 çalıştı");
        driver.get("https://www.google.com/");
    }

}
