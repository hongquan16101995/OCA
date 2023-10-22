package relation;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.m1();
        child.m2();
        System.out.println("---------");
        Parent parent = new Child();
        parent.m1();
//        parent.mChild(); => lỗi compile do Parent không tồn tại phương thức mChild()
        // parent is a Parent

        System.out.println("---------");
        // để dùng được mChild => ép kiểu xuống từ Parent về Child
        Child child1 = (Child) parent;
        child1.mChild();

        System.out.println("---------");
        Parent parent1 = new Parent();
        Child child2 = (Child) parent1;
        child2.mChild();
    }
}
