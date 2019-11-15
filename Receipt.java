import java.util.Scanner;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

/**
 * Receipt
 */
public class Receipt {

public static void main(String[] args) { 
// throws FileNotFoundException {
//   int Purchases = 1; 
//   File input = new File("inventory.txt");
//   PrintWriter output = new PrintWriter("output.txt");
//   Scanner sc = new Scanner(input);

//   while(sc.hasNextLine()) {
//     output.println(Purchases++ + ")" + sc.nextLine()); 
//   }

//   sc.close();
//   ouput.close ();
// }

  


    double SalesTaxPercentage = 0.10;
    double ImportDutyPercentage = 0.05;
    double decimalNumber;
    String [] NoTax = {"import chocolate", "chocolate bar", "pills", "book"};
    double SalesTax;
    double NetCost;
    double ImportDuty;
    double TotalBoth;
    double TotalID;
    double Total;
    double RoundupTotal;
  
    // File file = new File (args [0]);

    // for (Scanner i = 0; i = 100; i = i) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Item Purchased");
      String [] item = {scanner.nextLine()};
    
      // String [] InputItem = {item};

      // System.out.println(InputItem);
    

    System.out.println("Quantity Purchased");
    int quantity = scanner.nextInt();

    System.out.println("Cost");
    double cost = scanner.nextDouble();
    
    
  //   for (ListIterator<E> iter = list.listIterator("Item Purchased"); iter.hasNext("Quantity Purchased"); ) {
  //     E element = iter.next();
  // }

    // PrintWriter writer = new PrintWriter(args [1]);
  
    // decimalNumber = scanner.nextDouble();
    
    System.out.println(quantity + " " + item[0] + ":" + cost);
    
    NetCost = cost * quantity;
    SalesTax = SalesTaxPercentage * NetCost;
    ImportDuty = ImportDutyPercentage * NetCost;
    Total = NetCost + SalesTax + ImportDuty;
    TotalID = NetCost + ImportDuty;
    RoundupTotal = Math.round(Total * 100.0) / 100.0;

 
 for (int i = 0; i <= NoTax.length - 1; i++)
 { if (item[0] == NoTax[i])
     
      {System.out.println("\nSubtotal:" + NetCost + "\nImport Duty:" + ImportDuty);

    } 
    else {
      System.out.println("It WORKS!!!");}

    
    //  (for (int i = 0; i < NoTax.length - 1; i++)
    // item[0] != NoTax[i]; {
    // System.out.println("\nSubtotal:" + NetCost + "\nSales Tax" + SalesTax + "\nImport Duty:" + ImportDuty + "\nTotal $:" + RoundupTotal);
    
    // }
    
    
    }
  }

}