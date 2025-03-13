public class ch19_17 {  
	public static void main(String args[]){    
	Package obj = Package.getPackage("java.lang");  
  
	System.out.println("package name: " + obj.getName());   
	System.out.println("Specification Title: " + obj.getSpecificationTitle());  
	System.out.println("Specification Vendor: " + obj.getSpecificationVendor());  
	System.out.println("Specification Version: " + obj.getSpecificationVersion());  
  
	System.out.println("Implementaion Title: " + obj.getImplementationTitle());  
	System.out.println("Implementation Vendor: " + obj.getImplementationVendor());  
	System.out.println("Implementation Version: " + obj.getImplementationVersion());     
	}  
}  

