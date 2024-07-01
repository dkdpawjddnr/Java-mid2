package collection.set.test;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성 (중복을 제거하고 데이터의 값 순서대로 출력해라.)
        Set<Integer> set = new TreeSet<>(List.of(inputArr));

        for (Integer setValue : set) {
            System.out.println(setValue);
        }
    }
    //List<Integer> list = List.of(10,20,30,40,50,10);
}