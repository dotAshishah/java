class OuterClass {
    public void display() {
        System.out.println("OuterClass display method");
    }
    class Inner {
        public void display() {
            System.out.println("InnerClass display method");
        }
    }
}

public class P8OuterClass {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        outerObject.display();
        OuterClass.Inner innerObject = outerObject.new Inner();
        innerObject.display();
    }
}