package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GernericBox<Object> integerBox = new GenericBox<>(); 권장
        //타입은 Object라고 생각하면 된다.

        new GenericBox<Integer>();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
