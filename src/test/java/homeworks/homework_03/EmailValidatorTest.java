package homeworks.homework_03;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EmailValidatorTest {
    EmailValidator validator = new EmailValidator();


    @Test
    public void testValidate() throws Exception {
        Assert.assertTrue(validator.validate("yjrrdk@ya.ru"));
    }

    @Test
     public void testValidateFalse() throws Exception {
        Assert.assertFalse(validator.validate("yjrrdkya.ru"));
    }

    @Test
    @Parameters({"Email"})
    public void testValidateParameterTrue(String Email) throws Exception {
        Assert.assertTrue(validator.validate(Email));
    }

    @Test
    @Parameters({"WrongEmail"})
    public void testValidateParameterFalse(String WrongEmail) throws Exception {
        Assert.assertFalse(validator.validate(WrongEmail));
    }


}
