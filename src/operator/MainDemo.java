package operator;

import java.util.Arrays;

public class MainDemo {
    public static void main(String[] args) {
        int[] ints = {2,3,5,7,3,78};
//        Arrays.sort(ints, 2, 10);
        System.out.println(Arrays.toString(ints));

        long a = 8;
        long []ints1 = new long[8];

        final int x;
        x = 0;
        final int y = 2;
        int i = (int)(Math.random()*4);

//        switch (i) {
//            case x:
//            {
//                System.out.println("A");
//                break;}
//        }

        boolean f = false;
        int abc = 5;
        if (f = true) {
            System.out.println("abc");
        }

        long test = 10;
        String str = "abc";
        switch (str) {
            case "a": {

            }
        }
    }
}
