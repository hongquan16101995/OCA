package relation;

import java.io.FileNotFoundException;

public class Child extends Parent implements Service {
    public void m1() {
        System.out.println("m1 of Child");
    }

    public void mChild() {
        System.out.println("method only Child");
    }

    @Override
    public void m2() {
        System.out.println("m2 of Service and Child");
    }

    String getWord() {
        return "Hello every";
    }

    @Override
    public void m4() {
        System.out.println("m4 of Service and Child");
    }
}
