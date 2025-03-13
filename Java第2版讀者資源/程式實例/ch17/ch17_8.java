interface MyMath									// 定義MyMath介面 
{
    default int addEven(int... nums) {				// 定義default方法
        return add(true, nums);						// 偶數加法運算
    }
    default int addOdd(int... nums) {				// 定義default方法
        return add(false, nums);					// 奇數加法運算
    }
    private int add(boolean flag, int... nums) {	// 定義private方法
		int sumodd, sumeven;						// 定義奇數加總和偶數加總
		sumodd = sumeven = 0;						// 最初化加總					
        for ( int num:nums ) {						// 遍歷陣列
			if ((num % 2) == 1 )					// true則是奇數
				sumodd += num;						// 奇數加總
			else
				sumeven += num;						// 偶數加總
		}
		if (flag) 									// 如果true
			return sumeven;							// 傳回偶數加總			
		else
			return sumodd;							// 傳回奇數加總
    }
}
public class ch17_8 implements MyMath {
    public static void main(String[] args) {
        MyMath obj = new ch17_8();         
        int evenSum = obj.addEven(1,2,3,4,5,6,7,8,9,10);	// 執行加總偶數
        System.out.println(evenSum);         
        int oddSum = obj.addOdd(1,2,3,4,5,6,7,8,9,10);		// 執行加總奇數
        System.out.println(oddSum);
    }
}



