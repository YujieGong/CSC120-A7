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
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 250;
        this.nSugarPackets = 25;
        this.nCreams = 25;
        this.nCups = 25;
        System.out.println("You have built a cafe: ☕");
    }
  /**
   * deducted the number from existing ingredients and call the private method when run out of the ingredients
   */
    public void sellCoffee(int size, int numberSugarPackets, int numberCreams){
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
   * restock the ingredients when the ingredients run out
   */
    
    private void restock (int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = 250;
        this.nSugarPackets = 25;
        this.nCreams = 25;
        this.nCups = 25;
        }

    public void showOptions(){
      super.showOptions();
      System.out.println(" + sellCoffee() \n + restock()");
    }
    
    public static void main(String[] args) {
        Cafe CampusCafe = new Cafe("CampusCafe", "78 Green Street, MA 01063", 1);
        System.out.println(CampusCafe);
        CampusCafe.sellCoffee(34,12,56);
        
        System.out.println("------------------------------------");
        System.out.println("Test of Building constructor/methods");
        System.out.println("------------------------------------");
        
        Cafe campuscafe = new Cafe("Campus Cafe", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(campuscafe);
        campuscafe.showOptions();

        System.out.println("-----------------------------------");
        System.out.println("Demonstrating enter/exit/navigation");
        System.out.println("-----------------------------------");
        campuscafe.enter();
        campuscafe.goUp();
        campuscafe.goDown();
        campuscafe.exit();
    }
    
}
