package data;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Fruit market
        Scanner scan = new Scanner(System.in);

        // input user
        double priceStrawberry = Double.parseDouble(scan.nextLine());
        double bananaKg = Double.parseDouble(scan.nextLine());
        double orangeKg = Double.parseDouble(scan.nextLine());
        double raspBerriesKg = Double.parseDouble(scan.nextLine());
        double strawBerryKg = Double.parseDouble(scan.nextLine());

        // calculate
        double sumRaspberry = priceStrawberry * 0.50;
        double jeruk = sumRaspberry - (0.4 * sumRaspberry);
        double pisang = sumRaspberry - (0.8 * sumRaspberry);

        // total
        double totalRaspberry = sumRaspberry * raspBerriesKg;
        double totalJeruk = jeruk * orangeKg;
        double totalPisang = pisang * bananaKg;
        double totalStrawberry = priceStrawberry * strawBerryKg;
        double totalSemua = totalRaspberry + totalJeruk + totalPisang + totalStrawberry;
        System.out.printf("%.2f",totalSemua);
    }
}
