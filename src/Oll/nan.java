package Oll;

public class nan {
    public static void main(String[] args) {
        Float fl1 = new Float(Float.NaN);
        Float fl2 = new Float(Float.NaN);
        System.out.println(fl1 == fl2);
        System.out.println(fl1.equals(fl2));
        System.out.println(Float.NaN == Float.NaN);
    }
}
