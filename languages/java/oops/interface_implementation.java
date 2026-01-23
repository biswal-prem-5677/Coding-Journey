interface I1 {
    final int a = 100;

    void show();

    static void demo() {
        System.out.println("I am static demo I1");
    }

    default void ddemo() {
        System.out.println("I am default demo from I1");
    }
}

interface I2 {
    static void demo() {
        System.out.println("I am static demo I2");
    }

    void show();
    void display();

    default void ddemo() {
        System.out.println("I am default demo from I2");
    }
}

//  Override the conflicting default in I3 itself
interface I3 extends I1, I2 {
  
    default void ddemo() {
        // Choose which one to keep or create new behavior
        I1.super.ddemo();  
        I2.super.ddemo();
    }
}

class TestInterface implements I3 {
    public void display() {
        System.out.println("I am display");
    }

    public void show() {
        System.out.println("I am Show " + a);
    }

    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        I1.demo();   // Static method call
        t.ddemo();   // Uses both ddemo via I3
    }
}

