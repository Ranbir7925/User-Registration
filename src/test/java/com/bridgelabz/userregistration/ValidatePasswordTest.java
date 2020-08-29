package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * TEST FOR PASSWORD VALIDATING
 */
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
                        {"Ranbir@3456", true},
                        {"Ranbir#5", true},
                        {"Ranb#r9", false},
                        {"ranbi@r4566", false},
                        {"ranb@ir", false},
                        {"Ranbirsing#h", false},
                        {"12345@6789", false},
                        {"Ranbir435", false},
                        {"#$%&*#@567", false}
                };
        return Arrays.asList(data);
    }
}
