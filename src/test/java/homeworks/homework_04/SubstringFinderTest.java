package homeworks.homework_04;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubstringFinderTest {
    SubstringFinder substringFinder = new SubstringFinder();
    String mainString;
    String subString;

    @BeforeMethod
    public void cleanFile(){
        StringWriterHelper.fileCleanUp("testfile.txt");
        this.mainString = null;
        this.subString = null;
    }

    @Test(dataProvider = "textGenerator")
    public void testSubstring(String mainString, String subString) throws Exception {
        if (substringFinder.substring(mainString, subString)){
        this.mainString = mainString;
        this.subString = subString;
        }
        Assert.assertTrue(substringFinder.substring(mainString, subString));
    }

    @AfterMethod
    public void writeInFile(){
        if (mainString != null && subString != null)
        StringWriterHelper.fileWriter("testfile.txt", mainString, subString);
    }

    @DataProvider(name = "textGenerator")
    public Object[][] textGen(){
        return new Object[][] {
            new Object[] {"Hello world", "lo"},
        };
    }



}
