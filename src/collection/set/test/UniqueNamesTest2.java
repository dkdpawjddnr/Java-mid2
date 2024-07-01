package collection.set.test;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성 (중복을 제거하고 입력 순서대로 출력해라.)
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr)); //배열을 List로 변환한다.

        for (Integer setValue : set) {
            System.out.println(setValue);
        }
    }
}