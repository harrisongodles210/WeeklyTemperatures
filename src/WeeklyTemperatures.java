import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Add days of the week
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Get temperatures for each day
        for (String day : weekDays) {
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            days.add(day);
            temperatures.add(temp);
        }

        // User input loop
        while (true) {
            System.out.print("Enter a day to see its temperature (or type 'week' to see all data): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("week")) {
                double total = 0;
                System.out.println("\nWeekly Temperatures:");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                    total += temperatures.get(i);
                }
                double average = total / days.size();
                System.out.println("Weekly Average Temperature: " + average + "°C");
                break; // Exit loop
            } else {
                int index = days.indexOf(input);
                if (index != -1) {
                    System.out.println(input + "'s Temperature: " + temperatures.get(index) + "°C");
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }
        }

        scanner.close();
    }
}