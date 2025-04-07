package Part1.Basic4;
public class SwitchNew
{
	public static void main(String[] args) 
	{
		int num=4;
        String numString="";
        
        //寫法1(舊語法)
        switch(num) 
        {  
            case 1 : numString="一";
            	     	break;
            case 2 : numString="二"; 
            			break;
            case 3 : numString="三"; 
            			break;
            case 4 : numString="四";
            			break;
            default : numString="錯誤";  
        }
		
        System.out.println( num + " = " + numString);

        //寫法2        
        switch(num) 
        {  
            case 1 -> numString="一";  
            case 2 -> numString="二";  
            case 3 -> numString="三";  
            case 4 -> numString="四";  
            default -> numString="錯誤";  
        }
		
        System.out.println( num + " = " + numString);        
                
        //寫法3		
		//合併在'指定'運算式中
		numString = switch(num) {  
    		case 1 -> "一";  
    		case 2 -> "二";  
    		case 3 -> "三";  
    		case 4 -> "四";  
    		default -> "錯誤";  
		};  //;不可以省略
		  
		System.out.println( num + " = " + numString);		

	
		//寫法4		
		//回傳'值'
		numString = switch(num) {  
			case 1 :yield "一";  
			case 2 :yield "二";  
			case 3 :yield "三";  
			case 4 :yield "四";  
			default :yield "錯誤";  
		};
	  
		System.out.println( num + " = " + numString);		
	}	
}
