public class multiple1{
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.methodA();
        myObject.methodB();
    }
}


interface A {
    void methodA();
}

// Second Interface
interface B {
    void methodB();
}

// Class implementing both interfaces
class MyClass implements A, B {
    public void methodA() {
        System.out.println("Executing methodA");
    }

    public void methodB() {
        System.out.println("Executing methodB");
    }
}

