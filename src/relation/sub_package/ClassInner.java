package relation.sub_package;

public class ClassInner {

    public String name;

    public ClassInner(String name) {
        this.name = name;
    }

    class Inner {
        public int a;

        public Inner(int a) {
            this.a = a;
        }
    }

    static class Inner2 {
        public long b;

        public Inner2(long b) {
            this.b = b;
        }
    }

    public static void main(String[] args) {
        ClassInner classInner = new ClassInner("abc");
        Inner inner = classInner.new Inner(1);
        Inner2 inner2 = new ClassInner.Inner2(1l);
    }
}
