package collection.iterable;

import java.util.Iterator;

// 우리가 만든 배열을 순회할 수 있다
public class MyArray implements Iterable<Integer> {

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    // 이 자료 구조에 반환할 반복자를 반환하면 된다.
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
