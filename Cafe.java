/* This is a stub for the Cafe class */
/**
  * extend the building class and add attributes
  */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets; 
    private int nCreams;
    private int nCups; 
  /**
   * initialize the attributes of the Cafe object
   */
    public Cafe(String name, String address) {
        super(name, address);
        nFloors = 1;
        this.nCoffeeOunces = 250;
        this.nSugarPackets = 25;
        this.nCreams = 25;
        this.nCups = 25;
        System.out.println("You have built a cafe: ☕");
    }

  /**
   * overload the Cafe constructer to allow user to input the number of coffeeounces, sugarpackets, creams and cups. 
   */

    public Cafe(String name, String address, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
      super(name, address);
      nFloors = 1;
      this.nCoffeeOunces = nCoffeeOunces;
      this.nSugarPackets = nSugarPackets;
      this.nCreams = nCreams;
      this.nCups = nCups;

    }


  

  /**
   * deducted the number from existing ingredients and call the private method when run out of the ingredients
   */
    public void sellCoffee(int size, int numberSugarPackets, int numberCreams){
        // float nCoffeeOunces2 = this.nCoffeeOunces
        this.nCoffeeOunces = this.nCoffeeOunces - size;
        this.nSugarPackets = this.nSugarPackets - numberSugarPackets;
        this.nCreams = this.nCreams - numberCreams;
        this.nCups = this.nCups-1;
        System.out.println("The remaining ingrediants are: " + nCoffeeOunces + " "+nSugarPackets + " " +nCreams + " "+nCups);
        if (this.nCoffeeOunces<0 || this.nSugarPackets<0 || this.nCreams<0 || this.nCups<0){
        restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        System.out.println("The amount of ingrediants after restock are: " + nCoffeeOunces + " "+nSugarPackets + " " +nCreams + " "+nCups);
        }
    }

    /**
     * oveload the sellCoffee method to also accept float input from user
     * @param size
     * @param numberSugarPackets
     * @param numberCreams
     */
    public void sellCoffee(float size, float numberSugarPackets, float numberCreams){
      float nCoffeeOunces2 = this.nCoffeeOunces;
      float nSugarPackets2 = this.nSugarPackets;
      float nCreams2 = this.nCreams;
      float nCups2 = this.nCups;
      nCoffeeOunces2 = nCoffeeOunces2 - size;
      nSugarPackets2 = nSugarPackets2 - numberSugarPackets;
      nCreams2 = nCreams2 - numberCreams;
      nCups2 = nCups2-1;
      System.out.println("The remaining ingrediants are: " + nCoffeeOunces2 + " "+nSugarPackets2 + " " +nCreams2 + " "+nCups2);
      if (nCoffeeOunces2<0 || nSugarPackets2<0 || nCreams2<0 || nCups2<0){
      restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
      System.out.println("The amount of ingrediants after restock are: " + nCoffeeOunces + " "+nSugarPackets + " " +nCreams + " "+nCups);
      }
  }

 /**
   * restock the ingredients when the ingredients run out
   */
    
    private void restock (int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = 250;
        this.nSugarPackets = 25;
        this.nCreams = 25;
        this.nCups = 25;
        }


  /**
   * the gotoFloor method keeps users only one the first floor
   * @param floorNum
   */

    public void goToFloor(int floorNum) {
      if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
      }
      if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. This builing only has floor " + this.nFloors +".");
      }
      System.out.println("You are now on floor #" + floorNum + " of " + this.name);
      this.activeFloor = floorNum;
      }

  /**
   * the showOptions method shows the available options of cafe class
   */
    

    public void showOptions(){
      super.showOptions();
      System.out.println(" + sellCoffee() \n ");
    }

  //   public boolean checkElevator(String Elevator){
  //     super.checkElevator(Elevator);
  //     boolean elevator = false;
  //     if (Elevator == "Yes"){
  //         elevator = true;
  //         goToFloor(ac);
  //     } else if (Elevator == "No"){
  //         elevator = false;
  //         throw new RuntimeException("No elevator here!");
  //     }
  //     return elevator;
  
  // }

    
    
    // public void goToFloor(int floorNum){
    //   super.goToFloor(floorNum);
    // }

    public static void main(String[] args) {
       
        
        System.out.println("------------------------------------");
        System.out.println("Test of Building constructor/methods");
        System.out.println("------------------------------------");
        Cafe CampusCafe = new Cafe("CampusCafe", "78 Green Street, MA 01063", 250, 25,25, 25);
        System.out.println(CampusCafe);
        CampusCafe.sellCoffee(34.2f,12.5f,56.7f);

        System.out.println("-----------------------------------");
        System.out.println("Demonstrating enter/exit/navigation");
        System.out.println("-----------------------------------");
        CampusCafe.enter();
        CampusCafe.goUp();
        CampusCafe.goDown();
        CampusCafe.exit();
        
        
    }
    
}
