package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}}; //배열의 한가지 타입만 가능함.

        // 주어진 배열로부터 Map생성 - 코드 작성
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            productMap.put(product[0], Integer.valueOf(product[1]));
        }
        // Map의 모든 데이터 출력 - 코드 작성
        for (String key : productMap.keySet()) {
            System.out.println("제품" + key + ", 가격: " + productMap.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = productMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries ) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("제품: " + key + ", 가격: " + value);
        }
    }
}