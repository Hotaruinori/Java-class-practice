//Java Beans
package hibrnt;

public class Account implements java.io.Serializable  
{
    private String no;
    private String name;
 
    public Account(){}

    public String getNo() {
        return no;
    }
	
    public void setNo(String no) {
        this.no = no;
    }
	
    public String getName() {
        return name;
    }
	
    public void setName(String name) {
        this.name = name;
    }
}