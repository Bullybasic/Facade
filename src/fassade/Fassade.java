/**
 * Diese Klasse ist die Main-Klasse. 
 */
package fassade;
import java.util.Scanner;

/**
 * Es wird ein Objekt der Klasse Master, Lehrling und Ritter instanziert. 
 * Eine Textausgabe mit den jeweiligen hergestellten Waffen wird ausgegeben.
 * @author marino
 */
public class Fassade {
   public static void main(String[] args) {
     
      Scanner scanner = new Scanner(System.in);
       
      Master master = new Master();
      Trainee trainee = new Trainee(master);
      Knight knight = new Knight(master);

      System.out.println("Master");
      
      master.createSword();
      master.createAxe();
      master.createDagger();		
      
      System.out.println("");
      System.out.println("Trainee");
      trainee.getMaster().createSword();
      trainee.getMaster().createAxe();
      trainee.getMaster().createDagger();
      
      System.out.println("");
      System.out.println("Knight");
      knight.getMaster().createSword();
      
      System.out.println("");
      System.out.println("Weapons");
      System.out.println(master.getSizeArray());
      
      System.out.println("");
      master.checkArrayList();
      
      System.out.println("");
      master.sellItem("Sword");
      
      System.out.println("");
      master.checkArrayList();
      
      System.out.print("Enter the name of the Item you want to buy:");
      String name = scanner.nextLine();
      master.sellItem(name);
      System.out.println("End");
   }
}
