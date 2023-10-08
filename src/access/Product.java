package access;

import java.util.*;

public class Product {
    // global primitive
    public int a;
    public boolean b;

    // global instance (preference)
    public String c;
    public final List<Integer> integerList = new ArrayList<>();

    public Product() {
        integerList.add(10);
    }

    public void m1() {
        integerList.set(0, 1000);
        // local: không có access
        //local primitive
        int a = 0;
        System.out.println(a);
        System.out.println(this.a);
        //local instance
        List<String> stringList = new ArrayList<>();
        System.out.println(stringList);

        System.out.println(b);
    }
}


class MainTest {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.a);
        System.out.println(product.b);
        System.out.println(product.c);
        System.out.println(product.integerList);
        product.m1();
    }
}
