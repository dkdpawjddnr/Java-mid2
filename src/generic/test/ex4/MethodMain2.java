package generic.test.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 150);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(cat);

        Animal animal = AnimalMethod.<Animal>bigger(cat, dog);
        System.out.println("animal = " + animal);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.<Dog>bigger(dog,targetDog);
        System.out.println("bigger = " + bigger);
    }
}
