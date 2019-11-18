import java.util.Scanner;
import java.util.*;
import java.io.PrintWriter;

public class SalesReceipt {

  public static void main(String[] args) { 
    
    ArrayList <Integer> QuantityArray = new ArrayList<>();
    ArrayList <String> ItemArray = new ArrayList<>();
    ArrayList <Double> CostArray = new ArrayList<>();

    Scanner scanner = new Scanner("inventory.txt");
    while(scanner.hasNextLine()){
     String input = scanner.nextLine();
     String [] Split = input.split(",");
     int Quantity = Integer.parseInt(Split[0]);
     String Item = Split[1];
     double Price = Double.parseDouble(Split[2]);
     QuantityArray.add(Quantity);
     ItemArray.add(Item);
     CostArray.add(Price);
    }
  
    Scanner inputScanner = new Scanner(System.in);
    while(true) {
      String Purchase = inputScanner.nextLine();

      if(Purchase.equals("Total")){
         break;
      }
      if(!ItemArray.contains(Purchase)){
        continue;  
      }
      int Quant = inputScanner.nextInt();

      PrintWriter output = new PrintWriter("inventory.txt");
    while(inputScanner.hasNextLine()) {
      output.println(Purchase + inputScanner.nextLine()); 

    }
  }  
  output.close ();

  }

}