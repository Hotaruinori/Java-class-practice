package Part1.Basic7_String.String;
public class Ex02_StringLength
{
	public static void main(String[] args)
	{
		String s1 = new String("Java 2");	
		String s2 = new String("Java 2 嚙請學範嚙踝蕭");

		System.out.println("s1 : " + s1 + ", Length = " + s1.length());
		System.out.println("s2 : " + s2 + ", Length = " + s2.length());
        System.out.println();
		
        String s3 = "Java 2";   
        String s4 = "Java 2 嚙請學範嚙踝蕭";

        System.out.println("s3 : " + s3 + ", Length = " + s3.length());
        System.out.println("s4 : " + s4 + ", Length = " + s4.length());        
	}
}