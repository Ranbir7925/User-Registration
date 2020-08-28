import java.util.regex.Pattern;

public class UserRegistration
{
    //PATTERN FOR NAME
    private static final String NAME_PATTERN = "^[A-Z][A-Za-z0-9]{2,}$";

    //PATTERN TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstname).matches();

    }
}
