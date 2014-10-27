package lessons.lesson_04;


import org.testng.Assert;
import org.testng.annotations.*;

public class lessonTest04 {
    int a, b, c;

    @BeforeMethod
    public void  initialization(){
        a = 2;
        b = 3;
        System.out.println("initialization");
    }


    @Test
    public void functional(){
        c = a + b;
        Assert.assertEquals(c, a + b);
        System.out.println("test is passed");
    }

    @AfterMethod
    public void finalization(){
        c = 5;
        System.out.println("finalization");

    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { new Integer(2)},
                { new Integer(3)},
                { new Integer(4)},
                { new Integer(5)},
        };
    }

    //This test method declares that its data should be supplied by the Data Provider
//named "test1"
    @Test(dataProvider = "test1")
    public void verifyData1(Integer n2) {
        System.out.println("int: " + n2);
    }


}
