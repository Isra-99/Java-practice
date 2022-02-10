package code9;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
        public static void main(String arg[]) {
            Map fruitCalories = new HashMap();
            fruitCalories.put("apple", 95);
            fruitCalories.put("lemon", 20);
            fruitCalories.put("banana", 105);
            fruitCalories.put("orange", 45);
            fruitCalories.put("lemon", 17);

            System.out.println(fruitCalories.size()); //4
            System.out.println(fruitCalories);
        }
}
