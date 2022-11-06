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

    public void showOptions(){
      super.showOptions();
      System.out.println(" + addTitle() \n + removeTitle() \n + CheckOut() \n + Return() \n + containsTitle() \n + isAvailable() \n + printCollection()" );
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Test of Building constructor/methods");
        System.out.println("------------------------------------");
        
        Library neilson = new Library("Neilson Library", "100 Green Street Northampton, MA 01063", 5);
        System.out.println(neilson);
        neilson.showOptions();

        System.out.println("-----------------------------------");
        System.out.println("Demonstrating enter/exit/navigation");
        System.out.println("-----------------------------------");
        neilson.enter();
        neilson.goUp();
        neilson.goDown();
        neilson.exit();
        neilson.addTitle("abcde");
        neilson.removeTitle("abcde");
        neilson.checkOut("abcde");
        neilson.Return("abcde");
        neilson.containsTitle("abcde");
        neilson.isAvailable("abcde");
        neilson.printCollection();

    }
  
  }