package test;

class Animal1 {
    Integer a;
    int abc;

    public int m1() {

        char demo = 'b';
        String demo1 = "b";
        String demo2 = "abc";

        double abc = 1.2;
        double abc1 = 1.2_3;

        int a;
        return 0;
    }

    public void swap(Integer a, Integer b) {
        Integer c = a;
        a = b;
        b = c;
    }

    public void swap1(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public void swap2(Integer[] ints) {
        Integer c = ints[0];
        ints[0] = ints[1];
        ints[1] = c;
    }

    public static void main(String[] args) {
        System.out.println(1000000000);
        System.out.println(1_000_000_000);
        System.out.println(1.2_3);
        char a = 78;
        System.out.println(a);
        Object ab = null;
        ab.toString();
    }
}

class Animal2 {

}

public class Animal {

    class Demo {

    }

    static class Demo1 {

    }

}
