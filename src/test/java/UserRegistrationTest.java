import com.bridgelabz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = null;

    @Before
    public void setUp() throws Exception {
         userRegistration = new UserRegistration();
    }

    //TEST CASES FOR FIRST NAME
    @Test
    public void givenValid_FirstName_ReturnsTrue() {
        boolean result = userRegistration.validateFirstName("Ranbir");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameStartWithSmallerCaseReturnsFalse() {
        boolean result = userRegistration.validateFirstName("ranbir");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstnameHasTwoCharacterReturnsFalse() {
        boolean result = userRegistration.validateFirstName("An");
        Assert.assertFalse(result);
    }


    //TEST CASES FOR LAST NAME
    @Test
    public void givenValidLastNameReturnsTrue() {
        boolean result = userRegistration.validateLastName("Singh");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameStartWithSmallerCaseReturnsFalse() {
        boolean result = userRegistration.validateLastName("singh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastNameHasTwoCharacterReturnFalse() {
        boolean result = userRegistration.validateLastName("Si");
        Assert.assertFalse(result);
    }


    //TEST CASES FOR MOBILE NUMBER
    @Test
    public void givenMobileNumberInPreDefinedFormatReturnsTrue() {
        boolean result = userRegistration.validateMobileNumber("92 9876543210");
        Assert.assertTrue(result);

    }

    @Test
    public void givenMobileNumberWithNineDigitReturnsFalse() {
        boolean result = userRegistration.validateMobileNumber("91 123456789");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumberWithoutSpaceReturnsFalse() {
        boolean result = userRegistration.validateMobileNumber("919874563210");
        Assert.assertFalse(result);
    }

    //TEST CASES FOR PASSWORD
    @Test
    public void givenPasswordWithMinimumEightCharacterReturnTrue()
    {
        boolean result = userRegistration.validPassword("qwer5478");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPasswordWithLessThanEightCharacterReturnFalse()
    {
        boolean result = userRegistration.validPassword("qwe123");
        Assert.assertFalse(result);
    }
}