class InvalidAgeException extends Exception
{
    InvalidAgeException(String str)
    {
        super(str);
    }
}
class InvalidCGPAException extends Exception
{
    InvalidCGPAException(String str)
    {
        super(str);
    }
}
class InvalidGenderException extends Exception
{
    InvalidGenderException(String str)
    {
        super(str);
    }
}
public class JavaAssignment8 {

    public static void validate(int age,char gender,int cgpa)
    {
        try {

            if (age < 18)
                throw new InvalidAgeException("The age should be above 18");
            if (gender != 'F')
                throw new InvalidGenderException("only females can apply for this job");
            if (cgpa < 7)
                throw new InvalidCGPAException("The CGPA should be greater than 7");
            //throw new NullPointerException();
            //finally block works for NullPointerException
        }
        catch (Exception e)
        {
            System.out.println("You are not eligible because "+ e);
        }
        finally
        {
            System.out.println("Thank you for applying");
        }
    }



    public static void main(String[] args) {

        JavaAssignment8.validate(10,'m',6);

    }
}
