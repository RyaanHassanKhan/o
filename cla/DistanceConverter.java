package cla;

import java.util.Scanner;

public class DistanceConverter {
    // Method to convert kilometers to miles
    public double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    // Method to convert miles to kilometers
    public double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    // Method to convert meters to feet
    public double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    // Method to convert feet to meters
    public double feetToMeters(double feet) {
        return feet / 3.28084;
    }

    // Method to display conversion results
    public void displayConversion(String conversionType, double originalValue, double convertedValue) {
        System.out.printf("%f %s is equal to %f\n", originalValue, conversionType, convertedValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DistanceConverter converter = new DistanceConverter();

        while (true) {
            System.out.println("\nChoose a conversion type:");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Meters to Feet");
            System.out.println("4. Feet to Meters");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            double originalValue, convertedValue;
            switch (choice) {
                case 1:
                    System.out.print("Enter the distance in kilometers: ");
                    originalValue = sc.nextDouble();
                    convertedValue = converter.kilometersToMiles(originalValue);
                    converter.displayConversion("kilometers", originalValue, convertedValue);
                    break;
                case 2:
                    System.out.print("Enter the distance in miles: ");
                    originalValue = sc.nextDouble();
                    convertedValue = converter.milesToKilometers(originalValue);
                    converter.displayConversion("miles", originalValue, convertedValue);
                    break;
                case 3:
                    System.out.print("Enter the distance in meters: ");
                    originalValue = sc.nextDouble();
                    convertedValue = converter.metersToFeet(originalValue);
                    converter.displayConversion("meters", originalValue, convertedValue);
                    break;
                case 4:
                    System.out.print("Enter the distance in feet: ");
                    originalValue = sc.nextDouble();
                    convertedValue = converter.feetToMeters(originalValue);
                    converter.displayConversion("feet", originalValue, convertedValue);
                    break;
                case 5:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
