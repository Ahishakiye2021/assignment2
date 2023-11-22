public class interface1{
    public static void main(String[] args) {
        // Create an instance of the class implementing the interface
        Shape myCircle = new Circle(5.0);

        // Call the methods defined in the interface
        myCircle.draw();
        System.out.println("Area of the circle: " + myCircle.calculateArea());
    }
}

interface Shape {
    void draw();         // Method to draw the shape
    double calculateArea();  // Method to calculate the area of the shape
}

// Class implementing the interface
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}


