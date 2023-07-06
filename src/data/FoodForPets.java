package data;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDog = 0;
        int totalCat = 0;
        double totalBiskuit = 0;

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double totalAmountFood = Double.parseDouble(scanner.nextLine());


        for (int i = 1; i <= numberOfDays; i++) {
            int amountFoodDog = Integer.parseInt(scanner.nextLine());
            int amountFoodCat = Integer.parseInt(scanner.nextLine());
            totalDog += amountFoodDog;
            totalCat += amountFoodCat;

            if (i == 3) {
               totalBiskuit = Math.round((amountFoodDog + amountFoodCat) * 0.1);
            }
        }


        double hasil = totalDog + totalCat;
        System.out.println((hasil / totalAmountFood) * 100 );

        System.out.printf("Total eaten biscuits: 0.1f \n", totalBiskuit);
        System.out.printf("2f%  the food has been eaten.\n", (hasil / totalAmountFood) * 100);
        System.out.printf(".2f% eaten from the dog.\n", (totalDog / hasil) * 100);
        System.out.printf(".2f% eaten from the cat.\n", (totalCat / hasil) * 100);





    }
}
