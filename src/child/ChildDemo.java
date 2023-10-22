package child;

import access.ClassA;
import parent.Parent;

public class ChildDemo extends Parent {

    public ChildDemo() {
    }

    public ChildDemo(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ChildDemo childDemo = new ChildDemo();
        System.out.println(childDemo.name);
        Parent parent = new Parent();
        System.out.println(parent);

        ClassA classA = new ClassA();
        System.out.println(classA);
    }

    String getName() {
        return super.name;
    }
}
