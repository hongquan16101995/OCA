package relation.sub_package;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Son son = new Son("abc");
        List<Integer> list = new ArrayList<>();
        AbstractDemo abstractDemo = new AbstractDemo() {
            @Override
            public void m2() {
                System.out.println("Test");
            }
        };
        abstractDemo.m1();

        AbstractDemo abstractDemo1 = new AbstractDemo() {
            @Override
            public void m2() {
                System.out.println("Test2");
            }
        };
        abstractDemo1.m1();
    }
}
