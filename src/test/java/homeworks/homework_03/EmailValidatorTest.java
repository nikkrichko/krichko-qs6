package homeworks.homework_03;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EmailValidatorTest {
    @Test
    public void testValidate() throws Exception {
        EmailValidator validator = new EmailValidator();
        Assert.assertTrue(validator.validate("yjrrdk@ya.ru"));
    }

    @Test
     public void testValidateFalse() throws Exception {
        EmailValidator validator = new EmailValidator();
        Assert.assertFalse(validator.validate("yjrrdkya.ru"));
    }

    @Test
    @Parameters({"Email"})
    public void testValidateParameterTrue(String Email) throws Exception {
        EmailValidator validator = new EmailValidator();
        Assert.assertTrue(validator.validate(Email));
        System.out.println(Email);
    }

    @Test
    @Parameters({"WrongEmail"})
    public void testValidateParameterFalse(String WrongEmail) throws Exception {
        EmailValidator validator = new EmailValidator();
        Assert.assertFalse(validator.validate(WrongEmail));
        System.out.println(WrongEmail);
    }


}
