package Gun01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations {

    @Test
    public void Test1(){
        System.out.println("test 1 çalıştı");
    }

    @Test
    public void Test2(){
        System.out.println("test 2 çalıştı");
    }

    @BeforeClass
    public void OnceCalistirilacaklar()
    {
        //driver start bütün işlemler
        System.out.println("Class başlarken ilk çalıştı");
    }

    @AfterClass
    public void SonraCalistirilacaklar()
    {
       //BekleKapat
        System.out.println("Class ın içindekiler çalıştıktan sonra en son çalıştı");
    }

}
