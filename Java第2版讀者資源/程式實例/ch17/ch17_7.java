interface LearnJava {						// 定義LearnJava介面      
    abstract void method1();				// 定義抽象方法		     
    default void method2() {				// 定義default方法
        method4();  						// private方法在default方法內
        method5();  						// static方法在non-static方法內
        System.out.println("這是default方法");
    }
    public static void method3() {			// 定義static方法
        method5(); 							// static方法在其它static方法內
        System.out.println("這是static方法");
    }  
    private void method4(){					// 定義private方法
        System.out.println("這是private方法");
    }  
    private static void method5(){			// 定義private static方法
        System.out.println("這是private static方法");
    }
}
class Learning implements LearnJava {		// 實作LearnJava介面
    public void method1() {
        System.out.println("這是abstract方法");
    }
} 
public class ch17_7 {   
    public static void main(String[] args){
        LearnJava obj = new Learning();
        obj.method1();						// 呼叫抽象方法
        obj.method2();						// 呼叫default方法
        LearnJava.method3();				// 呼叫static方法
    }
}


