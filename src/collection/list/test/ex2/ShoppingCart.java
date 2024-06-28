package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemCart = new ArrayList<>();

    public void addItem(Item item1) {
        itemCart.add(item1);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : itemCart) {
            System.out.println("상품명: " + item.getName()+ ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }


    //계산하는거 명확하게 분리하는게 좋음.
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : itemCart){
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
