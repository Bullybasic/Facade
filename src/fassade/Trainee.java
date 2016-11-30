/**
* Diese Lehrlings-Klasse ist ein Akteur. 
* Die Klasse befindet sich ausserhalb des Subsystem.
* Es greift nur über die Masterklasse(Fassadenklasse) ins Subsystem.
*/

package fassade;

public class Trainee {
   
   private Master m;  

   /**
   * Parameter Master m wird mitgeliefert und
   * dann in das Datenfeld m gespeichert.
   */ 
   public Trainee(Master m) {
      this.m = m;
   }
   
   /**
   * Die Methode ist dazu da das man die Methoden von Master verwenden kann.
   * @return Master liefert Master Objekt
   */
   public Master getMaster(){
       return m;
   }
}