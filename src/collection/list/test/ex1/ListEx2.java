package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {

        // 문제2 - 사용자에게 n개의 정수를 입력받아서 List에 저장하고, 입력 순서대로 출력하자.
        // 0을 입력하면 입력을 종료하고 결과를 출력한다.
        // 출력시 출력 포멧은 1,2,3,4,5와 같이 쉼표,를 사용해서 구분하고 마지막에는 쉼표를 넣지 않아야 한다.

        Scanner scanner = new Scanner(System.in);
        List<Integer>list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            int input = scanner.nextInt();
            if (input == 0){
                break;
            }
            list.add(input);
            }
        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size()-1) {
                System.out.print(",");
            }
        }
    }
}
