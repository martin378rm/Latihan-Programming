package data;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budgetSmiths = Double.parseDouble(scan.nextLine());
        int berapaMalam = Integer.parseInt(scan.nextLine());
        double hargaPerMalam = Double.parseDouble(scan.nextLine());
        int percentForAddCost = Integer.parseInt(scan.nextLine());

        double biaya;
        double biayaTambahan;
        double persen;
        double priceReal;

        persen = (double) percentForAddCost / 100;
        // jika lebih dari 7 malam harga permalam diskon 5%

        if (berapaMalam > 7){
            priceReal = hargaPerMalam - (hargaPerMalam * 0.05);
        } else {
            priceReal = hargaPerMalam;
        }

        biaya = priceReal * berapaMalam;

        biayaTambahan = budgetSmiths * persen;

        biaya += biayaTambahan;


        if (biaya <= budgetSmiths){
            System.out.printf("Smiths will be left with %.2f USD after vacation.",budgetSmiths-biaya);
        } else {
            System.out.printf("%.2f USD needed.",biaya - budgetSmiths);
        }
    }
}
