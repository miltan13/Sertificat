public class Ukazatel {
    public static void doIt(String String) {
        int i = 10;
        i:
        for (
                int k = 0;
                k < 10; k++)

        { //2
            System.out.println(String + i); //3
            if (k * k > 10) continue i; //4
        }
    }

    public static void main(String[] args) {
        Ukazatel.doIt("fo");
    }
}