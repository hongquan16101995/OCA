package relation.sub_package;

import relation.Parent;
import relation.Child;
import relation.Service;

public class Son extends Dad {
//    @Override
//    public Child m1() {
//        return new Child();
//    }

    private String name;

    public Son(String name) {
        // từ khóa super để gọi constructor của superclass
        // từ khóa super phải là dòng code đầu tiên trong constructor

        this.name = name;
    }

    public String m1(int a) {
        return "";
    }

    protected String m1(int a, String b) {
        return "abc";
    }

    public int m1(String a) {
        return 0;
    }

    protected String m1(String b, int a) {
        return "abc";
    }

    public int m1(String a, String b) {
        return 0;
    }

    public String[] m2() {
        return new String[5];
    }

    public Parent m3() {
        return new Child();
    }

    public Service m4() {
        return new Child();
    }

    //phương thức trùng tên constructor
    public String Son() {
        return "abc";
    }
}
