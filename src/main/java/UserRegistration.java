import java.util.regex.Pattern;

public class UserRegistration
{
    //REGEX PATTERN FOR NAME,EMAIL,MOBILE NUMBER,PASSWORD
    private static final String NAME_PATTERN = "^[A-Z][A-Za-z0-9]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([.+-]?[0-9a-zA-z])*[@][a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}$";
    private static final String MOBILE_NO_PATTERN = "^[0-9]{2}[ ][0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9]{8,}$";

    //METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();

    }

    //METHOD TO VALIDATE LAST NAME
    public boolean validateLastName(String lastName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    //METHOD TO VALIDATE EMAIL ID
    public boolean validateEmail(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    //METHOD TO VALIDATE MOBILE NUMBER
    public boolean validateMobileNumber(String mobileNumber)
    {
        Pattern pattern = Pattern.compile(MOBILE_NO_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }

    public boolean validPassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}
