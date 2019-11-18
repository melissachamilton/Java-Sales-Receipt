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

    Scanner scanner = new Scanner(System.in);

    
    System.out.println("Item Purchased");
      String [] item = {scanner.nextLine()};
      
    System.out.println("Quantity Purchased");
    int quantity = scanner.nextInt();

    System.out.println("Cost");
    double cost = scanner.nextDouble();
    
    
  //   for (ListIterator<E> iter = list.listIterator("Item Purchased"); iter.hasNext("Quantity Purchased"); ) {
  //     E element = iter.next();
  // }

    
    System.out.println(quantity + " " + item[0] + ":" + cost);
    
    NetCost = cost * quantity;
    SalesTax = SalesTaxPercentage * NetCost;
    ImportDuty = ImportDutyPercentage * NetCost;
    Total = NetCost + SalesTax + ImportDuty;
    TotalID = NetCost + ImportDuty;
    RoundupTotal = Math.round(Total * 100.0) / 100.0;


System.out.println(item[0]);
String A = new String(item[0]); 

{ 
for (int i=0; i < NoTax.length; i++);
String B = new String(NoTax[i]);
if(A.equals (B));


  
  // System.out.println(NoTax);
  
  // item[0] = NoTax[i];
     
      {System.out.println("\nSubtotal:" + NetCost + "\nImport Duty:" + ImportDuty);

    } 
 
  // else {

  
  //   System.out.println("IT WORKS!!!!");
  // }

    
    //  (for (int i = 0; i < NoTax.length - 1; i++)
    // item[0] != NoTax[i]; {
    // System.out.println("\nSubtotal:" + NetCost + "\nSales Tax" + SalesTax + "\nImport Duty:" + ImportDuty + "\nTotal $:" + RoundupTotal);
    
    // }
 }
 
    }
  }

  

