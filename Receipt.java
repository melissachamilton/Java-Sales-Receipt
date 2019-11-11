import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

/**
 * Receipt
 */
public class Receipt {

  public static void main(String[] args) throws FileNotFoundException {


    double SalesTaxPercentage = 0.10;
    double ImportDutyPercentage = 0.05;
    double Item;
    double SalesTax;
    double ImportDuty;
    double Total;
    double RoundupTotal;

  
    Scanner scanner = new Scanner( file);
    File file = new File (args [0]);
    PrintWriter writer = new PrintWriter(args [1]);
    

    System.out.println("Item Purchased");
    Item = scanner.nextDouble();

    SalesTax = SalesTaxPercentage * Item;
    ImportDuty = ImportDutyPercentage * Item;
    Total = Item + SalesTax + ImportDuty;
    RoundupTotal = Math.round(Total * 100.0) / 100.0;



    System.out.println("Sales Tax $" +  SalesTax + "\nImport Duty $" + ImportDuty + "\nTotal $" + RoundupTotal);


    


  }
}