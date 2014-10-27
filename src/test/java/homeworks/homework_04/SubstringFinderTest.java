package homeworks.homework_04;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubstringFinderTest {
    SubstringFinder substringFinder = new SubstringFinder();

    @BeforeMethod
    public void cleanFile(){
        StringWriterHelper.fileCleanUp("testfile.txt");
    }

    @Test
    public void testSubstring() throws Exception {
        Assert.assertTrue(substringFinder.substring("hello world", "ello"));
    }

    @AfterMethod
    public void writeInFile(){
        StringWriterHelper.fileWriter("testfile.txt", "hello world", "ello");
    }


}
