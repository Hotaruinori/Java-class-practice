interface CustomCalculator									// 定義LearnJava介面 
{
    default int addEvenNumbers(int... nums) {						// 定義default方法
        return add(true, nums);
    }
 
    default int addOddNumbers(int... nums) {						// 定義default方法
        return add(false, nums);
    }
 
    private int add(boolean flag, int... nums) {			// 定義private方法
		int sumodd, sumeven;
		sumodd = sumeven = 0;
        for ( int num:nums ) {
			if ((num % 2) == 1 )
				sumodd += num;
			else
				sumeven += num;
		}
		if (flag) 
			return sumeven;
		else
			return sumodd;		
    }
}
public class ch17_7_1 implements CustomCalculator {
 
    public static void main(String[] args) {
        CustomCalculator demo = new ch17_7_1();
         
        int sumOfEvens = demo.addEvenNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfEvens);
         
        int sumOfOdds = demo.addOddNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfOdds);
    }
}



