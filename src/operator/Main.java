package operator;

import relation.sub_package.Dad;
import relation.sub_package.Son;

public class Main {
    public static void main(String[] args) {
        long a = 130L;
        // 130 > 127 max value byte
        byte b = (byte) a;
        System.out.println(b);

        long c = -8234567876542344543L;
        long e = 8234567876542344543L;
        long i = 2147483647L;
        long h = 2147483648L;
        int d = (int)c;
        int f = (int)e;
        int j = (int)i;
        int k = (int)h;
        System.out.println(d);
        System.out.println(f);
        System.out.println(j);
        System.out.println(k);

        int number = 100000;
        long number1 = number;

        Son son =(Son) new Dad();
        son.m4();

        Dad dad = new Dad();
        Son son1 = (Son) dad;
    }
}
