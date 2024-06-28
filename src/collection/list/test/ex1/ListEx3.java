package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        // 문제3 - 합계와 평균
        // 사용자에게 n개의 정수를 입력받아서 List에 보관하고, 보관한 정수의 합계와 평균을 계산하는 프로그램을 작성하자.

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        int total = 0;

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
            total += input;
        }
        double average = total / numbers.size();

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
