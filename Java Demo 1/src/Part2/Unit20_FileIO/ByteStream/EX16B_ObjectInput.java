package Part2.Unit20_FileIO.ByteStream;
import java.io.*;

public class EX16B_ObjectInput
{
	public static void main(String argv[])
	{
		try 
		{
            ObjectInputStream obj = new ObjectInputStream(
                                        new FileInputStream("EX16.data"));

			Student s2 = (Student) obj.readObject();
			
			System.out.println("My name is " + s2.getName());
			
			//s2.printData();
		
			obj.close();
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
}
