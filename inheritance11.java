 class inheritance11{
    public static void main(String[] args) {
        // Create an instance of the derived class
        Lion kingOfJungle = new Lion();

        // Access methods from both the base and derived classes
        kingOfJungle.eat();
        kingOfJungle.roar();
    }
}

class Animal {
    String species;

    // Constructor for the base class
    Animal(String species) {
        this.species = species;
    }

    void eat() {
        System.out.println(species + " is eating");
    }
}

// Derived class
class Lion extends Animal {
    // Constructor for the derived class
    Lion() {
        super("Lion"); // Call the constructor of the base class with a specific species
    }

    void roar() {
        System.out.println("Lion is roaring");
    }
}

