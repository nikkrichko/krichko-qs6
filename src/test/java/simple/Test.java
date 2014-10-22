package simple;

import org.testng.Assert;

public class Test {

    @org.testng.annotations.Test
    public void print(){
        System.out.println("RUN SIMPLE TEST");
        Assert.assertTrue(true);
    }

}
