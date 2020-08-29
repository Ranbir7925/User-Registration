package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = null;

    @Before
    public void setUp() throws Exception {
         userRegistration = new UserRegistration();
    }

    /**
     * TEST CASES FOR FIRST NAME
     */
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateFirstName("Ranbir");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenSmallerCase_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("ranbir");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasTwoCharacter_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("An");
        Assert.assertFalse(result);
    }

    /**
     * TEST CASES FOR LAST NAME
     */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.validateLastName("Singh");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenSmallerCase_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("singh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasTwoCharacter_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Si");
        Assert.assertFalse(result);
    }

    /**
     * TEST CASES FOR MOBILE NUMBER
     */
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.validateMobileNumber("92 9876543210");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNineDigits_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("91 123456789");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenWithoutSpace_ShouldReturnFalse() {
        boolean result = userRegistration.validateMobileNumber("919874563210");
        Assert.assertFalse(result);
    }
}