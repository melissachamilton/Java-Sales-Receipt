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
    // Array Food[] = {chocolate bar, imported box of chocolates, pasta, box };
    // Array Medical [] = {'headache pills'}
    // Array Books [] = {book, Bible, Yearbook}
    // Array Everything [] = {music CD, imported bottle of perfume, bottle of perfume }
    // String item = "imported box of chocolates";
    
    
    
    double SalesTax;
    double NetCost;
    double ImportDuty;
    double Total;
    double RoundupTotal;

  
    // File file = new File (args [0]);

    // for (Scanner i = 0; i = 100; i = i) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Item Purchased");
    String item = scanner.nextLine();

    System.out.println("Quantity Purchased");
    int quantity = scanner.nextInt();

    System.out.println("Cost");
    double cost = scanner.nextDouble();
    
    
  //   for (ListIterator<E> iter = list.listIterator("Item Purchased"); iter.hasNext("Quantity Purchased"); ) {
  //     E element = iter.next();
  // }

    // PrintWriter writer = new PrintWriter(args [1]);
  
    // decimalNumber = scanner.nextDouble();
    System.out.println(quantity + " " + item + ":" + cost);

    NetCost = cost * quantity;
    SalesTax = SalesTaxPercentage * NetCost;
    ImportDuty = ImportDutyPercentage * NetCost;
    Total = NetCost + SalesTax + ImportDuty;
    RoundupTotal = Math.round(Total * 100.0) / 100.0;

    
    System.out.println("\nSubtotal:" + NetCost + "\nSales Tax:" + SalesTax + "\nImport Duty:" + ImportDuty + "\nTotal $:" + RoundupTotal);


    
  // }
  
  }
}