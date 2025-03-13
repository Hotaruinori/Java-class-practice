public class ch12_34 {
	public static void main(String[] args) {
		String[] files = {"ch1.docx", "ch2.java", "ch3.xlxs",
		"ch4.java", "ch5.c"};		
		for (int i = 0; i < files.length; i++)
			if (files[i].endsWith("java"))			// 比對副檔名是java
				System.out.println(files[i]);		// 列印副檔名是java
	}
}

