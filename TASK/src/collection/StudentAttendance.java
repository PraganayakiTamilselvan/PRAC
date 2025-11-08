package collection;
//uses a HashSet to manage student attendance by storing names, checking presence, and updating the list without duplicates.
import java.util.HashSet;
import java.util.Scanner;
public class StudentAttendance {
	    public static void main(String[] args) {
	        HashSet<String> attendance = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);
	        // Add student names to attendance
	        attendance.add("Alice");
	        attendance.add("Bob");
	        attendance.add("Charlie");
	        // Display all present students
	        System.out.println("Present students:");
	        for (String name : attendance) {
	            System.out.println(name);
	        }
	        // Check if a student is present
	        System.out.print("\nEnter student name to check attendance: ");
	        String checkName = scanner.nextLine();

	        if (attendance.contains(checkName)) {
	            System.out.println(checkName + " is present.");
	        } else {
	            System.out.println(checkName + " is absent.");
	        }

	        // Add a new student
	        System.out.print("\nEnter new student name to mark present: ");
	        String newName = scanner.nextLine();
	        attendance.add(newName);
	        System.out.println(newName + " marked as present.");

	        // Final attendance list
	        System.out.println("\nUpdated attendance list:");
	        for (String name : attendance) {
	            System.out.println(name);
	        }

	        scanner.close();
	    }
	    }

