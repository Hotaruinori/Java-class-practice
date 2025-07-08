package Part1.Basic10_Sort.Lab;
/* 
  Lab: 依字串長度遞減排序, 字串長度相同時再依第2個字元遞增排序
*/

public class Lab_StringSort
{ 
    public static void main(String[] args) 
    {
        String[] names = { "Oscar", "Charlie", "Ryan", "Ted", "David", "Tim", "Diana" };
        
        showData("排序前: ", names);
        for (int i = 0; i < names.length - 1; i++){
            for (int j = 0; j < names.length - 1 - i; j++){
                //依字串長度遞減排序
                if (names[j].length()< names[j+1].length()){
                    swap(names, j);
                } 
                // 字串長度相同時再依第2個字元遞增排序
                else if (names[j].length() == names[j+1].length() && names[j].charAt(1) > names[j+1].charAt(1)){
                    swap(names, j);
                }
            }
        }
        showData("排序後: ", names);  
    }
    
    public static void showData(String msg, String[] data){
        System.out.print(msg);
        for(String element : data) System.out.print(element + "\t");
         
        System.out.println();       
    }    
    
    public static void swap(String[] data, int j){
        String temp = data[j];
        data[j] = data[j + 1];
        data[j + 1] = temp;
    }
}
