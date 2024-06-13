package generic.test.ex4;

public class GenericMethod {

    public static Object obgMethod(Object obg) {
        System.out.println("Object print: " + obg);
        return obg;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }
    public static <T extends  Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
