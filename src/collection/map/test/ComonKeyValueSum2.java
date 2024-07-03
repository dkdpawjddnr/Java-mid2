package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ComonKeyValueSum2 {

    public static void main(String[] args) {
        //Map.of는 불변이라 변경할 수 없다.
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C",3);
        Map<String, Integer> map2 = Map.of("B",4,"C",5,"D",6);

        HashMap<String, Integer> result = new HashMap<>();
        //코드 작성
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }
}
