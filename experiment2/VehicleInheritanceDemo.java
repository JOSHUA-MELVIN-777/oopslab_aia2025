// Base class (Level 1)
class Vehicle {
    String brand;
    String fuelType;
    
    public Vehicle(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }
    
    void start() {
        System.out.println(brand + " vehicle is starting...");
    }
    
    void stop() {
        System.out.println(brand + " vehicle has stopped.");
    }
    
    void displayBasicInfo() {
        System.out.println("Brand: " + brand + ", Fuel: " + fuelType);
    }
}

// Single-level inheritance: Car directly inherits from Vehicle
class Car extends Vehicle {
    int numberOfDoors;
    
    public Car(String brand, String fuelType, int doors) {
        super(brand, fuelType);
        this.numberOfDoors = doors;
    }
    
    void honk() {
        System.out.println(brand + " car is honking: Beep! Beep!");
    }
    
    void openTrunk() {
        System.out.println("Car trunk is opened.");
    }
    
    void displayCarInfo() {
        displayBasicInfo(); // Inherited method
        System.out.println("Doors: " + numberOfDoors);
    }
}

// Multi-level inheritance Level 2: MotorVehicle inherits from Vehicle
class MotorVehicle extends Vehicle {
    String engineType;
    int engineCapacity;
    
    public MotorVehicle(String brand, String fuelType, String engineType, int capacity) {
        super(brand, fuelType);
        this.engineType = engineType;
        this.engineCapacity = capacity;
    }
    
    void accelerate() {
        System.out.println(brand + " is accelerating with " + engineType + " engine.");
    }
    
    void brake() {
        System.out.println(brand + " is braking.");
    }
    
    void displayMotorInfo() {
        displayBasicInfo(); // Inherited from Vehicle
        System.out.println("Engine: " + engineType + ", Capacity: " + engineCapacity + "cc");
    }
}

// Multi-level inheritance Level 3: Motorcycle inherits from MotorVehicle
class Motorcycle extends MotorVehicle {
    boolean hasSidecar;
    String bikeType;
    
    public Motorcycle(String brand, String fuelType, String engineType, 
                     int capacity, boolean sidecar, String type) {
        super(brand, fuelType, engineType, capacity);
        this.hasSidecar = sidecar;
        this.bikeType = type;
    }
    
    void wheelie() {
        System.out.println(brand + " motorcycle is doing a wheelie!");
    }
    
    void kickStart() {
        System.out.println("Kick starting the " + brand + " motorcycle.");
    }
    
    void displayMotorcycleInfo() {
        displayMotorInfo(); // Inherited from MotorVehicle
        System.out.println("Type: " + bikeType + ", Has Sidecar: " + hasSidecar);
    }
}

public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("========== SINGLE-LEVEL INHERITANCE ==========");
        System.out.println("Vehicle -> Car");
        
        // Single-level inheritance example
        Car myCar = new Car("Honda", "Petrol", 4);
        myCar.start();           // Inherited from Vehicle
        myCar.honk();            // Car's own method
        myCar.openTrunk();       // Car's own method
        myCar.displayCarInfo();  // Uses inherited method inside
        myCar.stop();            // Inherited from Vehicle
        
        System.out.println("\n========== MULTI-LEVEL INHERITANCE ==========");
        System.out.println("Vehicle -> MotorVehicle -> Motorcycle");
        
        // Multi-level inheritance example
        Motorcycle myBike = new Motorcycle("Yamaha", "Petrol", "V-Twin", 
                                          1000, false, "Sport Bike");
        
        myBike.start();                    // Inherited from Vehicle (Level 1)
        myBike.accelerate();               // Inherited from MotorVehicle (Level 2)
        myBike.kickStart();                // Motorcycle's own method (Level 3)
        myBike.wheelie();                  // Motorcycle's own method (Level 3)
        myBike.brake();                    // Inherited from MotorVehicle (Level 2)
        myBike.displayMotorcycleInfo();    // Uses methods from all levels
        myBike.stop();                     // Inherited from Vehicle (Level 1)
        
        System.out.println("\n========== INHERITANCE CHAIN SUMMARY ==========");
        System.out.println("Single-level: Vehicle -> Car");
        System.out.println("Multi-level:  Vehicle -> MotorVehicle -> Motorcycle");
    }
}
