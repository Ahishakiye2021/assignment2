
public class multiple2 {
    public static void main(String[] args) {
        AnotherClass anotherObject = new AnotherClass();
        anotherObject.methodX();
        anotherObject.methodY();
    }
}

interface X {
    void methodX();
}

// Second Interface
interface Y {
    void methodY();
}

// Class implementing both interfaces
class AnotherClass implements X, Y {
    public void methodX() {
        System.out.println("Executing methodX");
    }

    public void methodY() {
        System.out.println("Executing methodY");
    }
}
