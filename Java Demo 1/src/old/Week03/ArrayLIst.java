package Week03;

import java.util.ArrayList;

public class ArrayLIst {

    public static void main(String[] args) {
        
    
    
           // 創建一個存儲 String 型別的 ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 添加元素
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 插入元素
        fruits.add(1, "Orange"); // 在索引 1 插入 "Orange"
        System.out.println(fruits);

        // 獲取元素
        String fruit2 = fruits.get(2); // 獲取索引 2 的元素，結果為 "Banana"
        System.out.println("fruits2 =" + fruit2);

        // 更新元素
        fruits.set(2, "Mango"); // 將索引 2 的元素設置為 "Mango"
        System.out.println(fruits);
        // 刪除元素
        fruits.remove(3); // 刪除索引 3 的元素，即 "Cherry"

        fruits.add("Banana");
        fruits.add("Banana");
        // 列印所有元素
        for (String item : fruits) {
            System.out.println(item);
        }

        // 檢查 ArrayList 的大小
        int size = fruits.size(); // 結果為 3
        System.out.println("size =" + size);

        // 清空 ArrayList
        fruits.clear();

        // 檢查 ArrayList 是否為空
        System.out.println(fruits.isEmpty()?"空的":"有東西");


    }
}
