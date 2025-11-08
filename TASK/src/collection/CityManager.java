package collection;
	import java.util.Scanner;
	import java.util.TreeSet;
//This program uses a TreeSet to store city names in sorted order, allowing users to add and search cities while automatically avoiding duplicates.
	public class CityManager {
	    public static void main(String[] args) {
	        TreeSet<String> cities = new TreeSet<>();
	        Scanner scanner = new Scanner(System.in);

	        // Add some cities
	        cities.add("Mumbai");
	        cities.add("Delhi");
	        cities.add("Chennai");
	        cities.add("Kolkata");

	        // Display cities in sorted order
	        System.out.println("Cities in sorted order:");
	        for (String city : cities) {
	            System.out.println(city);
	        }

	        // Add a new city
	        System.out.print("\nEnter a city to add: ");
	        String newCity = scanner.nextLine();
	        if (cities.add(newCity)) {
	            System.out.println(newCity + " added successfully.");
	        } else {
	            System.out.println(newCity + " already exists.");
	        }

	        // Search for a city
	        System.out.print("\nEnter a city to search: ");
	        String searchCity = scanner.nextLine();
	        if (cities.contains(searchCity)) {
	            System.out.println(searchCity + " is in the list.");
	        } else {
	            System.out.println(searchCity + " is not in the list.");
	        }

	        // Final sorted list
	        System.out.println("\nUpdated city list:");
	        for (String city : cities) {
	            System.out.println(city);
	        }
	        scanner.close();
	    }
}
