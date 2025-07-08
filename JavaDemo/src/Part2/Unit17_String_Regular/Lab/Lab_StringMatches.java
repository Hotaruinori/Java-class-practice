package Part2.Unit17_String_Regular.Lab;
public class Lab_StringMatches 
{
    public static void main(String[] args) 
    {
        String[] numbers = {
            
            "(04)2228-9111","(02)22342264","(04)22334145",
            "(03)2224-7517","(04)2220-0209","(02)2262-7887",
            "(02)2245-3371","(02)2522-1044","(04)2406-3251",
            "(06)2393-6767","(03)2687-6157","(05)2628-0801" };

        for(String number : numbers) 
        {
            if(number.matches("^\\(\\d{2}\\)\\d{4}-\\d{4}$")) 
            {
                System.out.println(number);
            }
        }
    }
}

//(04)1234-5678
//(04)12345678 