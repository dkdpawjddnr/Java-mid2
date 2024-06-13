package generic.test.ex5;

import generic.animal.Animal;

public class WildcardEx {

    //이것은 제네릭 메서드이다.
    //Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
    //제네릭 타입 Box를 받음
    //제네릭 메서드를 만들고 박스는 제네릭 타입을 만드는 것
    static <T> void  printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    //이것은 제네릭 메서드가 아니다. 일반적인 메서드이다.
    //Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
    //와일드카드는 이미 만들어진 제네릭 타입으로 활용을 하는 것
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get() );
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2V2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }


    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
