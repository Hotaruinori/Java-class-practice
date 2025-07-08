package Part2.Unit15_OO;
interface Constants{
    int LINE=101;
	int RECTANGLE=102;
	int CIRCLE=103;
	int CURVE=104;
	void show();
}


class Element implements Constants{
	@Override
    public void show(){}
    
	String createElement(int element){
		switch(element){
			case Constants.LINE: 	
				return "直線";
            case Constants.RECTANGLE: 
				return "長方形";
            case Constants.CIRCLE:  
				return "圓形";
            case Constants.CURVE:   
				return "曲線";
			default: 	
				return "無形狀";
		}
	}
}


public class Ex14_Interface
{
    public static void main(String[] args) 
	{
		Element element = new Element();
		System.out.println("建立" + element.createElement(101));
		System.out.println("建立" + element.createElement(102));
		System.out.println("建立" + element.createElement(103));
		System.out.println("建立" + element.createElement(104));
	}
}
