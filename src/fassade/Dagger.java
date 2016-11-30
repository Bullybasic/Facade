/**
 * Diese Dolchklasse ist innerhalb des Subsystems.
 * Sie wird nur über die Fassadenklasse Master gesteuert.
 * Sie implemiert die create Methoden vom Interface Item.
 */

package fassade;

public class Dagger implements Item {

    public Dagger(){
        
   }   
    
   /**
    * Einfache Textausgabe von "Dolch".
    */ 
   @Override
   public void create() {
      System.out.println("Dagger");
   }
}