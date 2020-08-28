import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    //TEST CASES FOR FIRST NAME
    @Test
    public void givenValidFirstNameReturnsTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Ranbir");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameStartWithSmallerCaseReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("ranbir");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstnameHasTwoCharacterReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("An");
        Assert.assertFalse(result);
    }


    //TEST CASES FOR LAST NAME
    @Test
    public void givenValidLastNameReturnsTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Singh");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameStartWithSmallerCaseReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("singh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHasTwoCharacterReturnFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Si");
        Assert.assertFalse(result);
    }


    //TEST CASES FOR LAST NAME
    @Test
    public void givenMobileNumberInPreDefinedFormatReturnsTrue()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("92 9876543210");
        Assert.assertTrue(result);

    }

    @Test
    public void givenMobileNumberWithNineDigitReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91 123456789");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumberWithoutSpaceReturnsFalse()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("919874563210");
        Assert.assertFalse(result);
    }
}
