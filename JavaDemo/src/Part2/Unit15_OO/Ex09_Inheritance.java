package Part2.Unit15_OO;
class Rectangle{
	private int length, width;
	
	Rectangle() {
		length = 0;
		width = 0;
	}
	
	Rectangle(int length, int width) {
		this.length = length;	//屬性=參數值
		this.width = width;	  
	}
	
	int getLength() {
		return length;
	}
	
	int getWidth() {
		return width;
	}
	
	int getArea(){ //面積 
        return length*width;
    }
}

class Box extends Rectangle{
	private int height;
    Box() {
		super();
		this.height = 0;
	}
	
    Box(int length, int width, int height){
		super(length, width);	//叫用父(基礎)類別的建構
		this.height = height;	
	}
	
	int getHeight() {
		return this.height;
	}
	
	int getVolumn(){ //體積
        return super.getLength()* super.getWidth()* this.getHeight();
    }
}

public class Ex09_Inheritance{
    public static void main(String[] args){
		Box b1 = new Box();
		Box b2 = new Box(10,20,5);
		System.out.print("箱子 1: 長 = " + b1.getLength());	
        System.out.print(", 寬 = " + b1.getWidth());
        System.out.print(", 高 = " + b1.getHeight());  
        System.out.println(", 體積 = " + b1.getVolumn());
         
        System.out.print("箱子 2: 長 = " + b2.getLength());         
        System.out.print(", 寬 = " + b2.getWidth());        
        System.out.print(", 高 = " + b2.getHeight());      
        System.out.println(", 體積 = " + b2.getVolumn());
	}
}
