class VirtualPet {
    // Member variables
    String name;
    int energy;
    int happiness;

    // Constructor
    VirtualPet(String petName) {
        name = petName;
        energy = 50;
        happiness = 50;
    }

    // Member functions (methods)
    void feed() {
        energy += 10;
        System.out.println(name + " has been fed. Energy is now " + energy);
    }

    void play() {
        if (energy >= 10) {
            happiness += 15;
            energy -= 10;
            System.out.println(name + " played and is happy! Happiness: " + happiness + ", Energy: " + energy);
        } else {
            System.out.println(name + " is too tired to play.");
        }
    }

    void sleep() {
        energy += 20;
        System.out.println(name + " is sleeping... Energy restored to " + energy);
    }

    void showStatus() {
        System.out.println("\n--- " + name + "'s Status ---");
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
    }
}
