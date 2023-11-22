public class single2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.talk(); // Inherited from Person class
        student.study();
    }
}


class Person {
    void talk() {
        System.out.println("Person is talking");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

