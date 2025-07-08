package Part2.Unit17_String_Regular.Matches;
public class StringMatches1 
{
    public static void main(String[] args) 
    {
        String[] numbers = {
            "0910-123456","0916-123-456",
            "0910179428", "0916-179428",
            "091-018-9188", "O910-179428"
        };
        
        for(String number : numbers) 
        {
            if(number.matches("^[0-9]{4}-\\d{6}$")) 
            {
                System.out.println(number);
            }
        }
    }
}
