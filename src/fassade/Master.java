/**
* Diese Klasse ist die Fassadenklasse. 
* Sie stellt die Schnittstelle zwischen Akteure und dem Subsystem.
*/

package fassade;
import java.util.ArrayList;
import java.util.Iterator;

public class Master {
   //private Item sword;
   //private Item axe;
   //private Item dagger;
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
      Item sword = new Sword();
      addItem(sword);
      sword.create();
   }
   
   
   /**
    * Ein Axt Objekt wird instanziert.
    * Das Objekt wird in die Arraylist gespeichert.
    */
   public void createAxe(){
       Item axe = new Axe();
        addItem(axe);
        axe.create();
   }
   
   /**
    * Ein Dolch Objekt wird instanziert.
    * Das Objekt wird in die Arraylist gespeichert.
    */
   public void createDagger(){
      Item dagger = new Dagger();
      addItem(dagger);
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
   
   public void checkArrayList(){
        System.out.println("Inventory:");
        Iterator<Item> itr = items.iterator();
        while (itr.hasNext()) {
            Item element = itr.next();
            System.out.print(element.toString() + "\n" );
        }
        System.out.println();
   }
   
   public void sellItem(String s){
       
       boolean match = false;
       System.out.println("Sell " + s );
       Iterator<Item> it = items.iterator();
        while (it.hasNext()) {
            Item element = it.next();
            String StringElement = element.toString();
            if(StringElement.equals(s)){
                items.remove(element);
                System.out.println(s + " item sold.");
                match = true;
                break;
            }
        }
        if(!match){
            System.out.println("Item not found!");
        }
        
        
   
   }
   
   
   
   
}

