package visitor;

import java.util.Scanner;

public class VisitorMain {
	// Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Visitor details
        int id = Integer.parseInt(Visitor.readInput("Enter Visitor ID: ", scanner));
        String name = Visitor.readInput("Enter Visitor Name: ", scanner);
        String phoneNumber = Visitor.readInput("Enter Phone Number: ", scanner);
        String visitPurpose = Visitor.readInput("Enter Visit Purpose: ", scanner);
        String checkInTime = Visitor.readInput("Enter Check-In Time: ", scanner);
        String checkOutTime = Visitor.readInput("Enter Check-Out Time: ", scanner);

        // Create Visitor object
        Visitor visitor = new Visitor(id, name, phoneNumber, visitPurpose, checkInTime, checkOutTime);

        // Display the Visitor details
        System.out.println("\n" + visitor);

        // Register the Visitor
        visitor.registerVisitor();

        // Optionally update the Check-Out Time
        if (Visitor.readInput("\nDo you want to update the Check-Out Time? (yes/no): ", scanner).equalsIgnoreCase("yes")) {
            String newCheckOutTime = Visitor.readInput("Enter new Check-Out Time: ", scanner);
            visitor.updateVisitInfo(newCheckOutTime);

            // Display updated Visitor details
            System.out.println("\nUpdated Visitor Details:");
            System.out.println(visitor);
        }
        scanner.close();
    }

}
