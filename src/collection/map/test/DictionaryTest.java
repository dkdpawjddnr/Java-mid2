package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();
        System.out.println("==단어 입력 단계==");
        while (true){
            System.out.println("영어 단어를 입력하세요 (종료는 'q'): " );
            String inputEnglish = scanner.nextLine();

            if (inputEnglish.equals("q")){
                break;
            }

            System.out.println("한글 뜻을 입력하세요: ");
            String inputKorean = scanner.nextLine();

            dictionary.put(inputEnglish, inputKorean);
        }

        System.out.println("==단어 검색 단계==");
        while (true){
            System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String searchEnglish = scanner.nextLine();
            if (searchEnglish.equals("q")){
                break;
            }
            if (dictionary.containsKey(searchEnglish)){
                String searchKorean = dictionary.get(searchEnglish);
                System.out.println(searchEnglish + "의 뜻: " + searchKorean);
            } else {
                System.out.println(searchEnglish + "은(는) 사전에 없는 단어입니다. ");
            }
        }
    }
}
