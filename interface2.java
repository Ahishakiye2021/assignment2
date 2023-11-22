
public class interface2 {
    public static void main(String[] args) {
        // Create an instance of the class implementing the interface
        Printable myPrinter = new Printer();

        // Call the method defined in the interface
        myPrinter.print();
    }
}

interface Printable {
    void print();
}

// Class implementing the interface
class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a document");
    }
}

