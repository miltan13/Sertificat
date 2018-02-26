package hello1;

import hello2.Hello2;

public class Hello1 {
    public static String hello = "Hello", lo = "lo";

    public static void main(String[] args) {
        System.out.println(Hello1.hello == Hello2.hello);
        System.out.println("Hello" == hello);
        System.out.println("Hello" == Hello2.hello);
        System.out.println("Hello" == "Hel" + lo);
        System.out.println("Hello" == ("Hel" + lo).intern());

    }

}
