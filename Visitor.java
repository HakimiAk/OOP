package visitor;

import java.util.Scanner;

public class Visitor {
    private int id;
    private String name, visitPurpose, phoneNumber, checkInTime, checkOutTime;

    // Constructor
    public Visitor(int id, String name, String phoneNumber, String visitPurpose, String checkInTime, String checkOutTime) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.visitPurpose = visitPurpose;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    // Simplified Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getVisitPurpose() { return visitPurpose; }
    public void setVisitPurpose(String visitPurpose) { this.visitPurpose = visitPurpose; }
    public String getCheckInTime() { return checkInTime; }
    public void setCheckInTime(String checkInTime) { this.checkInTime = checkInTime; }
    public String getCheckOutTime() { return checkOutTime; }
    public void setCheckOutTime(String checkOutTime) { this.checkOutTime = checkOutTime; }

    // Register Visitor
    public void registerVisitor() {
        System.out.println("\nVisitor " + name + " has been successfully registered!");
    }

    // Update Visit Info
    public void updateVisitInfo(String newCheckOutTime) {
        this.checkOutTime = newCheckOutTime;
        System.out.println("Check-Out Time for " + name + " has been updated.");
    }

    // toString method for table-like display
    @Override
    public String toString() {
        return "+------------------+--------------------------------+\n" +
               "| Field            | Value                          |\n" +
               "+------------------+--------------------------------+\n" +
               String.format("| %-16s | %-30s |\n", "ID", id) +
               String.format("| %-16s | %-30s |\n", "Name", name) +
               String.format("| %-16s | %-30s |\n", "Phone Number", phoneNumber) +
               String.format("| %-16s | %-30s |\n", "Visit Purpose", visitPurpose) +
               String.format("| %-16s | %-30s |\n", "Check-In Time", checkInTime) +
               String.format("| %-16s | %-30s |\n", "Check-Out Time", checkOutTime) +
               "+------------------+--------------------------------+";
    }

    // Utility method to read user input
    public static String readInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    
}
