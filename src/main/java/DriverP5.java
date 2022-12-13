/*
Name: James Zachary Luci
Current Date: 11/17/2022
Sources Consulted: Referenced lecture notes and labs

By submitting this work, I attest that it is my original work and that I did
not violate the University of Mississippi academic policies set forth in the
M book.
*/

import java.io.*;
import java.util.Scanner;

public class DriverP5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File promoters = new File("Promotors.txt");
        File nonprofits = new File("Nonprofits.txt");

        FileWriter file = new FileWriter("data.txt", true);
        PrintWriter pw = new PrintWriter(file);

        Scanner scan1 = new Scanner(promoters);
        Scanner scan2 = new Scanner(nonprofits);

        Commission commission = new Commission(2022);

        int counter = -1;

        while (scan2.hasNextLine()){
            String line  = scan2.nextLine();
            String[] tokens = line.trim().split(",");

            commission.addNonProfit(tokens[0], tokens[1]);


        }
        while (scan1.hasNextLine()){
            String line2 = scan1.nextLine();
            String[] tokens2 = line2.trim().split(",");

           commission.getNonprofit(tokens2[0]).addPromotor(tokens2[1],tokens2[2],Double.parseDouble(tokens2[3]));
        }
        scan2.close();
        scan1.close();

        System.out.println("Welcome");
        pw.println("Welcome");

        commission.printNonprofit();
        for (int i = 0; i < commission.getTotalNumberNonprofits(); i++){
          commission.getNonprofit(i).printPromotors();
        }
        System.out.println();
        pw.println();
        System.out.println("Sorted");
        pw.println("Sorted");




        commission.sort();
        for (int i = 0; i < commission.getTotalNumberNonprofits(); i++){
            commission.getNonprofit(i).printPromotors();
        }

        System.out.println();
        pw.println();


        commission.awards();

        System.out.println("Goodbye");
        pw.println("Goodbye");

        commission.close();

        for (int i = 0; i < commission.getTotalNumberNonprofits(); i++){
            commission.getNonprofit(i).close();
        }


        pw.close();








    }
}
