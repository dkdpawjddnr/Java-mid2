package generic.ex5;

import generic.animal.Animal;

// 와일드카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다.
// 와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
// 제네릭을 쉽게 사용할 수 있는 도구이다.

public class WildcardEx {

    // 제네릭 메서드를 만듦.
    // Box는 제네릭 타입을 만드는 거.
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }

    // 제네릭 타입인 Box가 들어올 수 있는데 ? 에는 아무거나 다 들어올 수 있음
    // Box<Dog>, Box<Cat>, Box<Object>가 다 들어올 수 있음
    // 이미 만들어진 제네릭 타입을 갖다가 활용하는 것.
    // 와일드카드 ?는 모든 타입을 받을 수 있다.
    static void printWildcardV1(Box<?> box) {
        // Object o = box.get(); Object로 받을 수 있다.
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }
    static void printWildCardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    //와일드카드는 들어온 변수를 사용하여 반환할 때 똑같이 반환해준다.
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
