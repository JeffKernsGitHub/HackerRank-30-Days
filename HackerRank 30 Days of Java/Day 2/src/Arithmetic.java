import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price       
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        //double tip = mealCost * (double)(tipPercent/100) ;
        double tip = mealCost * (((double)tipPercent)/100.0) ;
        double tax = mealCost * (((double)taxPercent)/100.0) ; 
      
        // Write your calculation code here.
        mealCost = mealCost + tip + tax ;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost);      
        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}