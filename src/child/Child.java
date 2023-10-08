package child;

import access.ClassA;
import parent.Parent;

public class Child extends Parent {

    public Child() {
    }

    public Child(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.name);
        Parent parent = new Parent();
        System.out.println(parent);

        ClassA classA = new ClassA();
        System.out.println(classA);
    }

    String getName() {
        return super.name;
    }
}
