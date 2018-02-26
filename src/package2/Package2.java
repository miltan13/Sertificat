package package2;
import package1.*;

import package1.Package1;

public class Package2 extends Package1 {
    public void process(Package1 a) {
    }
    public static void main(String[] args) {
        Package1 a = new Package1();

        Package2 b = new Package2();
        b.process(a);
        System.out.println( a.getI() );
    }
}
