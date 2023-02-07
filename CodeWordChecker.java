public class CodeWordChecker 
{
    public static void main(String[] args) 
{
    CodeWordChecker r = new CodeWordChecker(2, 6, "H");
    System.out.println(r.isValid("Hello"));
}
    private int minLength;
    private int maxLength;
    private String notAllowed;
    public CodeWordChecker(int minLen, int maxLen, String symbol)
    {
    minLength = minLen;
    maxLength = maxLen;
    notAllowed = symbol;
    }
    public CodeWordChecker(String symbol)
    {
    minLength = 6;
    maxLength = 20;
    notAllowed = symbol;
    }
    public boolean isValid(String str)
    {
        if(str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
