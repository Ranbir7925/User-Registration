import com.bridgelabz.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidatePasswordTest
{
    private final String passwordForTest;
    private final boolean expectedResult;

    public ValidatePasswordTest(String passwordForTest, boolean result)
    {
        this.passwordForTest = passwordForTest;
        this.expectedResult = result;
    }

    @Test
    public void givenValidOrInvalidPassword_ShouldReturnAsPerResult()
    {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validPassword(this.passwordForTest);
        Assert.assertEquals(this.expectedResult,result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]
                {
                        {"Ranbir3456", true},
                        {"Ranbir45", true},
                        {"Ranbir", false},
                        {"ranbir4566", false},
                        {"ranbir", false}
                };
        return Arrays.asList(data);
    }
}
