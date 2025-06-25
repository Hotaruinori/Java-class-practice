package Week04;

import java.util.Arrays;

public class BubbleDemo {
    public static void main(String[] args) {
        int array[] = {5, 4, 7, 9, 3};

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;


 //                	int temp = array[j+1];
//                	array[j+1] = array[j];
//                	array[j] = temp;
               
                }
            }
        System.out.println(Arrays.toString(array));
        }
    }
}
