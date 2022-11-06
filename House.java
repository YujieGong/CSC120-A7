/* This is a stub for the House class */
import java.util.ArrayList;

/**
  * extend the building class and add attributes
  */
public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

 /**
   * initialize the attributes of the Cafe object
   */
  
  public House (String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = true;
    System.out.println("You have built a house: 🏠");
  }

 /**
   * check if the home has dining room
   * @return boolean expression of whether it has dining room
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
 /**
   * get the current arraylist
   * @return arraylist of current residents
   */
  public ArrayList<String> nResidents(){
    return this.residents;
  }
 /**
   * add the name of residents that move in to the arraylist
   */
  public void moveIn(String name){
    this.residents.add(name);
  }
 /**
   * remove the name if the residents move out from the arraylist
   * @return the name of the resident that moves out
   */
  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  }
/**
   * check if the arraylist contains the name
   * @return the boolean expressioin of whether the arraylist contains the name
   */

  public boolean isResident(String name){
    return (this.residents.contains(name));
  }



  public void showOptions(){
    super.showOptions();
    System.out.println(" + moveIn() \n + moveOut() \n + CheckResidents()");
  }

  public void goToFloor(int floorNum){
    super.goToFloor(floorNum);
    
  }

  public static void main(String[] args) {

    System.out.println("------------------------------------");
    System.out.println("Test of Building constructor/methods");
    System.out.println("------------------------------------");
    
    House lawrence = new House("Lawrence", "100 Green Street Northampton, MA 01063", 3);
    System.out.println(lawrence);
    lawrence.showOptions();

    System.out.println("-----------------------------------");
    System.out.println("Demonstrating enter/exit/navigation");
    System.out.println("-----------------------------------");
    lawrence.enter();
    lawrence.goUp();
    lawrence.goDown();
    lawrence.exit();
  //  House Lawrence = new House("Lawrence", "78 Green Street, MA 01063", 3);
  //  System.out.println(Lawrence);
  // }

}
}