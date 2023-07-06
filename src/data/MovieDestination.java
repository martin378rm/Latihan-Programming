package data;

import java.util.Scanner;

public class MovieDestination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        double disc = 0.0;
        int price = 0;
        double total =0.0;
        if (destination.equals("Dubai")) {
            disc = 0.3;
            if (season.equals("Winter")){
                price = 45000;
                total = (price * numberOfDays);
                total = total - (total * disc);

            } else {
                price = 40000;
                total = (price * numberOfDays);
                total = total - (total * disc);
            }
        } else if (destination.equals("Washington")){
            disc = 0.25;
            if (season.equals("Winter")){
                price = 17000;
                total = (price * numberOfDays);
                total = total + (total * disc);
            } else {
                price = 12500;
                total = (price * numberOfDays);
                total = total + (total * disc);
            }
        } else {
            if (season.equals("Winter")){
                price = 24000;
                total = (price * numberOfDays);
            } else {
                price = 20250;
                total = (price * numberOfDays);
            }
        }

        System.out.println(movieBudget - total);

    }



}
