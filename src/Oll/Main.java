package Oll;

public class Main {

    public static void method (int... a) {
        System.out.println("int a");
    }

//    public static void method (long a, long b) {
//        System.out.println("long long");
//    }

    public static void method (Integer i, Integer b) {
        System.out.println("Integer Integer");
    }

    public static void main(String[] args) {
        Main.method(5, 6);
    }
}
