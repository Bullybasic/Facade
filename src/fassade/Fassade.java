/**
 * Diese Klasse ist die Main-Klasse. 
 */
package fassade;

/**
 * Es wird ein Objekt der Klasse Master, Lehrling und Ritter instanziert. 
 * Eine Textausgabe mit den jeweiligen hergestellten Waffen wird ausgegeben.
 * @author marino
 */
public class Fassade {
   public static void main(String[] args) {
     
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
   }
}
