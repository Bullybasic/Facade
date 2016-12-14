/**
 * Diese Schwertklasse ist innerhalb des Subsystems.
 * Sie wird nur über die Fassadenklasse Master gesteuert.
 * Sie implemiert die create Methoden vom Interface Item.
 */

package fassade;

public class Sword implements Item {
    
   public Sword(){
        
   }  
   
   /**
    * Einfache Textausgabe von "Schwert".
    */
   @Override
   public void create() {
      System.out.println("Sword");
   }

    @Override
    public String toString() {
        return "Sword";
    }
    
}