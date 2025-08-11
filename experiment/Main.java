// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Virtual Pet Simulator!");
        System.out.print("Enter your pet's name: ");
        String petName = scanner.nextLine();

        // Object creation
        VirtualPet pet = new VirtualPet(petName);

        int choice;
        do {
            System.out.println("\nWhat would you like to do with " + petName + "?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Show Status");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: pet.feed(); break;
                case 2: pet.play(); break;
                case 3: pet.sleep(); break;
                case 4: pet.showStatus(); break;
                case 5: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
