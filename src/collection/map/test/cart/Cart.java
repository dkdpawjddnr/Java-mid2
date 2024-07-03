package collection.map.test.cart;
import java.util.HashMap;
import java.util.Map;
public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();
    // 코드 작성
    public void add(Product product, int addQuantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);// 지금 현재 수량
        // 수량이 없으면 0으로 저장
        cartMap.put(product, existingQuantity + addQuantity);
    }
    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }

    }
    public void minus(Product product, int minusQuantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        }else {
            cartMap.put(product, newQuantity);
        }
    }
}