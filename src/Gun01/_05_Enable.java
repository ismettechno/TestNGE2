package Gun01;

import org.testng.annotations.Test;

public class _05_Enable {

    @Test
    public void Test1(){
        System.out.println("test 1 çalıştı");
    }

    @Test(enabled = false)
    public void Test2(){
        System.out.println("test 2 çalıştı");
    }

    @Test
    public void Test3(){
        System.out.println("test 3 çalıştı");
    }

}
