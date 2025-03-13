public class ex12_6 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "Java";
		
		int val = str1.compareTo(str2);
		if (val == 0)			
			System.out.println("compareTo結果           : " + "true");
		else
			System.out.println("compareTo結果           : " + "false");
		val = str1.compareToIgnoreCase(str2);
		if (val == 0)	
			System.out.println("compareToIgnoreCase結果 : " + "true");
		else
			System.out.println("compareToIgnoreCase結果 : " + "false");
		System.out.println("equals結果              : " + str1.equals(str2));
		System.out.println("equalsIgnoreCase結果    : " + str1.equalsIgnoreCase(str2));	
	}
}

