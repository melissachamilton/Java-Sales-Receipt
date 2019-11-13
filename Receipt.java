import java.util.Scanner;
import java.util.*;

// import java.io.FileNotFoundException;
// import java.io.File;
// import java.io.PrintWriter;

/**
 * Receipt
 */
public class Receipt {

public static void main(String[] args) {
  
  // throws FileNotFoundException 


    double SalesTaxPercentage = 0.10;
    double ImportDutyPercentage = 0.05;
    double decimalNumber;
    double SalesTax;
    double NetCost;
    double ImportDuty;
    double Total;
    double RoundupTotal;

  
    // File file = new File (args [0]);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Item Purchased");
    String item = scanner.nextLine();

    System.out.println("Quantity Purchased");
    int quantity = scanner.nextInt();

    System.out.println("Cost");
    double cost = scanner.nextDouble();

    // PrintWriter writer = new PrintWriter(args [1]);
  
    // decimalNumber = scanner.nextDouble();

    NetCost = cost * quantity;
    SalesTax = SalesTaxPercentage * NetCost;
    ImportDuty = ImportDutyPercentage * NetCost;
    Total = NetCost + SalesTax + ImportDuty;
    RoundupTotal = Math.round(Total * 100.0) / 100.0;


    System.out.println("Subtotal:" + NetCost + "\nSales Tax:" + SalesTax + "\nImport Duty:" + ImportDuty + "\nTotal $:" + RoundupTotal);


    


  }
}