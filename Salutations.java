
/**
 * Write a description of class Salutations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salutations
{
    private String name;
    
    public Salutations(String theName)
    {
        name = theName;
    }
    
    public void addressLetter()
    {
        System.out.println("Dear "+name);
    }
    
    public void signLetter()
    {
        System.out.println("Sincerely,");
        System.out.println(name);
    }
    
    public void addressMemo()
    {
        System.out.println("To whom it may concern");
    }
    
    public void signMemo()
    {
        System.out.println("Best,");
        System.out.println(name);
    }
}
