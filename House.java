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
  * an overload house constructor is added to get information from users about whether the dining option changes in the house.
  * @param name
  * @param address
  * @param nFloors
  * @param checkdining
  */
  public House (String name, String address, int nFloors, String checkdining) {
    super(name, address, nFloors);
    System.out.println("please let us know if the availability of the dining changes here.");
    this.residents = new ArrayList<String>();
    if (checkdining == "Yes"){
      this.hasDiningRoom = true;
    }else if (checkdining == "false"){
      this.hasDiningRoom = false;
    }
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
 * remove the name if the user inputs the index of the name instead of the string
 * @param index
 * @return name;
 */

  public String moveOut(int index){
    index = index - 1;
    name = this.residents.get(index);
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


  /**
   * check if the house has elevator
   * @param Elevator
   * @param floor_Num
   * @return elevator if the house has elevator
   */

  public boolean checkElevator(String Elevator, int floor_Num){
    boolean elevator = false;
    if (Elevator == "Yes"){
        elevator = true;
        goToFloor(floor_Num);
    } else if (Elevator == "No"){
        elevator = false;
        throw new RuntimeException("No elevator here!");
    }
    return elevator;
    
}


  /**
   * show the options available for house
   */

  public void showOptions(){
    super.showOptions();
    System.out.println(" + moveIn() \n + moveOut() \n + CheckResidents() \n + hasDiningroom()");
  }

//   public boolean checkElevator(String Elevator){
//     boolean elevator = false;
//     if (Elevator == "Yes"){
//         elevator = true;
//         goToFloor(activeFloor);
//     } else if (Elevator == "No"){
//         elevator = false;
//     }
//     return elevator;
    
// }


  public static void main(String[] args) {

    System.out.println("------------------------------------");
    System.out.println("Test of Building constructor/methods");
    System.out.println("------------------------------------");
    
    House lawrence = new House("Lawrence", "100 Green Street Northampton, MA 01063", 5, "No");
    System.out.println(lawrence);
    lawrence.showOptions();
    if (lawrence.hasDiningRoom()){
    System.out.println("Has dining room");
  }else {
    System.out.println("no dining room");
  }

  lawrence.moveIn("Jenny");
  lawrence.moveIn("Laura");
  lawrence.moveIn("Sophie");
  System.out.println(lawrence.nResidents());
  lawrence.moveOut(2);
  System.out.println(lawrence.nResidents());

    

    System.out.println("-----------------------------------");
    System.out.println("Demonstrating enter/exit/navigation");
    System.out.println("-----------------------------------");
   
    lawrence.enter();
    lawrence.checkElevator("No", 3);
    lawrence.goUp();
    lawrence.goUp();
    lawrence.goDown();
    lawrence.exit();
 
  //  House Lawrence = new House("Lawrence", "78 Green Street, MA 01063", 3);
  //  System.out.println(Lawrence);
  // }

}
}