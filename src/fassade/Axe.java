/**
 * Diese Axtklasse ist innerhalb des Subsystems.
 * Sie wird nur über die Fassadenklasse Master gesteuert.
 * Sie implemiert die create Methoden vom Interface Item.
 */

package fassade;

import java.lang.Override;

public class Axe implements Item {

   public Axe(){
        
   } 
    
   /**
    * Einfache Textausgabe von "Axt".
    */
   @Override
   public void create() {
      System.out.println("Axe");
   }
   
   @Override
    public String toString() {
        return "Axe";
    }
}