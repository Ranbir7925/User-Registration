import java.util.regex.Pattern;

public class UserRegistration
{
    //PATTERN FOR NAME,EMAIL
    private static final String NAME_PATTERN = "^[A-Z][A-Za-z0-9]{2,}$";
    private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([.+-]?[0-9a-zA-z])*[@][a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}$";

    //PATTERN TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();

    }

    //PATTERN TO VALIDATE LAST NAME
    public boolean validateLastName(String lastName)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    //PATTERN TO VALIDATE EMAIL ID
    public boolean validateEmail(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }
}
