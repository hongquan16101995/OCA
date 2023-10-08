package demo;

public class SubManager {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addString("HelloWorld");
        System.out.println(manager.strings);
    }
}
