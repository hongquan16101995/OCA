package flow;

public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println((a++ < 3) || (b++ > 7));
//        System.out.println((a++ > 3) | (b++ > 7));
//        System.out.println((a++ > 3) && (b++ > 7));
//        System.out.println((a++ < 3) & (b++ > 7));

        System.out.println(a);
        System.out.println(b);
    }
}
