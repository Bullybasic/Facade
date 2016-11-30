/**
* Diese Klasse ist die Fassadenklasse. 
* Sie stellt die Schnittstelle zwischen Akteure und dem Subsystem.
*/

package fassade;
import java.util.ArrayList;

public class Master {
   private Item sword;
   private Item axe;
   private Item dagger;
   private ArrayList<Item> items;

   /**
   * Eine ArrayList mit Items wird instanziert.
   * TODO: Die Items unterscheiden können welche Waffen drinnen sind.
   */
   public Master() {
      items = new ArrayList<Item>();
   }

   /**
    * Ein Sowrd Objekt wird instanziert.
    * Das Objekt wird in die Arraylist gespeichert.
    */
   public void createSword(){
      this.sword = new Sword();
      addItem(this.sword);
      sword.create();
   }
   
   /**
    * Ein Axt Objekt wird instanziert.
    * Das Objekt wird in die Arraylist gespeichert.
    */
   public void createAxe(){
       this.axe = new Axe();
        addItem(this.axe);
        axe.create();
   }
   
   /**
    * Ein Dolch Objekt wird instanziert.
    * Das Objekt wird in die Arraylist gespeichert.
    */
   public void createDagger(){
      this.dagger = new Dagger();
      addItem(this.dagger);
      dagger.create();
   }
   
   /**
    * Methode für Items in die Arraylist speichern.
    */
   public void addItem(Item i){
       items.add(i);
   }
   
   /**
    * Liefert die Größe des Arrays.
    * @return int Größe des Arrays
    */
   public int getSizeArray(){
       return items.size();
   }
}

