package Week04;

import java.util.Map;
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        // 使用 Map 介面來創建 HashMap 的實例
        Map<String, String> familyMap = new HashMap<>();

        // 添加元素(put方法)
        familyMap.put("老婆", "美麗的老婆");
        familyMap.put("小孩數量", "兩個小孩");

        // 獲取元素(get方法)
        String wife = familyMap.get("老婆");
        System.out.println("我的老婆是：" + wife);

        // 遍歷 HashMap(entrySet)
        System.out.println("==============家庭資訊：");
        for (Map.Entry<String, String> entry : familyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 刪除元素
        familyMap.remove("小孩數量");
        System.out.println("===============刪除小孩數量後的家庭資訊：");
        for (Map.Entry<String, String> entry : familyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
