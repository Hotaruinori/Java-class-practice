public class ch25_19 {
    public static void main(String[] args) {
		Runtime.Version version = Runtime.version();                   
        System.out.println("目前版本 "+version);             
        System.out.println("主要版本 "+version.major());   
        System.out.println("次要版本 "+version.minor());   
        System.out.println("安全版本 "+version.security());                         
    }
}

