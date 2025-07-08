package Part2.Unit20_FileIO.ByteStream;
import java.io.*;

public class EX16A_ObjectOutput
{
	public static void main(String argv[])
	{ 
	    String name = "nana";
		int chinese = 80;
		int english = 75;
		int math = 100;

		Student s1 = new Student(name, chinese, english, math);
		
        try {
		
            ObjectOutputStream obj = new ObjectOutputStream(
                                         new FileOutputStream("EX16.data"));
		
			obj.writeObject(s1);
			obj.close();
			System.out.println("成功寫入EX16.data");
		}
        catch (IOException ie){
		
			System.out.println(ie);
		}
		
    }
}
