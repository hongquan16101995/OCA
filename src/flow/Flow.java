package flow;

import relation.Parent;
import relation.Child;

public class Flow {
    public static void main(String[] args) {
        abc: for (int i = 10; i < 100; i++) {
            System.out.println(i);
        }
        // đặt tên cho vòng lặp
        // trong phạm vi sử dụng của vòng lặp đó
        // có thể tác động luồng lă[j thông qua tên
        a: for (int i = 0; i < 10; i++) {
//            System.out.println(i);
            for (int j = 5; j > -1; j--) {
                if (j == 3) {
                    break a;
                } else if (j % 2 == 0){
                    continue;
                }
                System.out.println(j);
            }
        }

//        int a = 99;
//        char b = 'a';
//        System.out.println(a > b);
//        System.out.println((int) b);
//        System.out.println((char) a);
//
//        Child child = new Child();
//        Child child1 = new Child();
//        Child child2 = child;
//        Parent child3 = child;
//        Parent parent = new Parent();
//        System.out.println(child == child1);
//        System.out.println(child == child2);
//        System.out.println(child3 instanceof Child);
//        System.out.println(parent instanceof Child);
    }
}
