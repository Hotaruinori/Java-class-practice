public class ch19_18 {

   public static void main(String[] args) {

      // create a package object for java.lang package
      Package pack = Package.getPackage("java.lang");

      // get the fully qualified name for this package
      System.out.println("" + pack.getName());
	        // get the annotation for lang package
      System.out.println(""+pack.getImplementationTitle());
	  System.out.println(""+pack.getImplementationTitle());
	  System.out.println("" + pack.getImplementationVersion());
   }
}

