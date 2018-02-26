public class Static {
    public static final String ID = "5324";
    static {
        System.out.println("Static static");
    }
}

class Stat extends Static {
    public static final String NAME = "Ser";
    static {
        System.out.println("Hello");
    }
    public static void go () {
        System.out.println("go");
    }
}

class Test {
    public static void main(String[] args) {
        Stat.go();
    }
}

