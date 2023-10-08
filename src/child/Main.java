package child;

import parent.Parent;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child("Bob");
//        System.out.println(parent.name);
        Child child = (Child) parent;
//        System.out.println(child.name);
        System.out.println(child.getName());
    }
}
