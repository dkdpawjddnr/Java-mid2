package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        //코드 작성 (합집합, 교집합, 차집합 중복 제거해서 구하기.)
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합: " + intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합: " + difference);
    }
}
