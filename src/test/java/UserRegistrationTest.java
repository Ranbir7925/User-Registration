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
}
