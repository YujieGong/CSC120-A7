/* This is a stub for the Library class */
import java.util.Hashtable;
/**
  * extend the building class and add attributes
  */
public class Library extends Building{
  private Hashtable<String, Boolean> collection;
  /**
   * initialize the attributes of the Cafe object
   */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }

  /**
   * an overload class is created so that if the user does not know the number of floor of the building, they can choose not to input it
   * @param name
   * @param address
   */

    public Library(String name, String address) {
      super(name, address);
      nFloors = 3;
      this.collection = new Hashtable<>();
      System.out.println("You have built a library: 📖");
    }
   

 /**
   * add book to the object
   */
    public void addTitle(String title){
      this.collection.put(title, true);
      System.out.println("The book that is added is" + title);
    }


  /**
   * remove book from the object collection
   * @return title of the book
   */
    public String removeTitle(String title){
      this.collection.remove(title, true);
      return title;
    }


  /**
   * use the class overload to remove multiple books from the object collection
   * @return titles of the book
   */

    public String removeTitle(String title1, String title2){
      this.collection.remove(title1, true);
      this.collection.remove(title2, true);
      return title1 + title2;
    }


  /**
   * change the value to the false when check out
   */ 
    public void checkOut(String title){
      this.collection.replace(title, false);
    }
  /**
   * change the value to the true when return the book
   */ 
    public void Return(String title){
      this.collection.replace(title, true);
    }
  /**
   * returns true if the title appears as a key in the Libary's collection, false otherwise
   * @return true/false
   */ 

    public boolean containsTitle(String title){
      return this.collection.containsKey(title);
    }
 /**
   * returns true if the title is currently available, false otherwise
   * @return true/false
   */ 

    public boolean isAvailable(String title){
      return this.collection.get(title);
      
    }
  /**
   * print out the entire collection
   */ 

    public void printCollection(){
      System.out.println(this.collection);
    }

  /**
   * show the available options for the library
   */

    public void showOptions(){
      super.showOptions();
      System.out.println(" + addTitle() \n + removeTitle() \n + CheckOut() \n + Return() \n + containsTitle() \n + isAvailable() \n + printCollection()" );
    }



    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Test of Building constructor/methods");
        System.out.println("------------------------------------");
        
        Library neilson = new Library("Neilson Library", "100 Green Street Northampton, MA 01063");
        System.out.println(neilson);
        neilson.showOptions();
        neilson.addTitle("abcde");
        neilson.addTitle("fhgj");
        neilson.addTitle("ajshdgak");
        neilson.addTitle("alsidijlaksdj");
        neilson.removeTitle("alsidijlaksdj", "fhgj");
        neilson.checkOut("ajshdgak");
        neilson.Return("asdhaksdjh");
        neilson.printCollection();

        System.out.println("-----------------------------------");
        System.out.println("Demonstrating enter/exit/navigation");
        System.out.println("-----------------------------------");
        neilson.enter();
        neilson.goUp();
        neilson.goDown();
        neilson.exit();

    }
  
  }