package class1;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 3)
    public void Atest(){
        System.out.println("I am TestA");
    }
    @Test(priority = 1)
    public void Btest(){
        System.out.println("I am TestB");
    }
    @Test(priority = 2)
    public void Ctest(){
        System.out.println("I am TestC");
    }

}
