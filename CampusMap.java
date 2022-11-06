import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;
    ArrayList<House> houses;
    ArrayList<Library> libraries;
    ArrayList<Cafe> cafes;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
        houses = new ArrayList<House>();
        libraries = new ArrayList<Library>();
        cafes = new ArrayList<Cafe>();

    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }
    /**
     * Adds a House to the map
     * @param c the House to add
     */
    public void addHouse(House c) {
        System.out.println("Adding Houses...");
        houses.add(c);
        System.out.println("-->Successfully added " + c.getName() + " to the map.");
    }

    /**
     * Adds a Library to the map
     * @param d the Library to add
     */

    public void addLibrary(Library d) {
        System.out.println("Adding Libraies...");
        libraries.add(d);
        System.out.println("-->Successfully added " + d.getName() + " to the map.");
    }

    /**
     * Adds a cafe to the map
     * @param e the cafe to add
     */

    public void addCafe(Cafe e) {
        System.out.println("Adding Libraies...");
        cafes.add(e);
        System.out.println("-->Successfully added " + e.getName() + " to the map.");
    }


    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    /**
     * Removes a house from the map
     * @param c the House to remove
     * @return the removed House
     */

    public House removeHouse(House c) {
        System.out.println("Removing house...");
        buildings.remove(c);
        System.out.println("-->Successfully removed " + c.getName() + " to the map.");
        return c;
    }

    /**
     * Removes a library from a map
     * @param d the library to remove
     * @return the removed library
     */
    public Library removeLibrary(Library d) {
        System.out.println("Removing library...");
        buildings.remove(d);
        System.out.println("-->Successfully removed " + d.getName() + " to the map.");
        return d;
    }

    /**
     * Removes a cafe from a map
     * @param e the cafe to remove
     * @return the removed cafe
     */
    public Cafe removecCafe(Cafe e) {
        System.out.println("Removing cafe...");
        buildings.remove(e);
        System.out.println("-->Successfully removed " + e.getName() + " to the map.");
        return e;
    }


    /**
     * create the string for the Buildings 
     * @return mapString1 
     */

    public String BuildingString() {
        String mapString1 = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString1 += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString1;
    }

    /**
     * create the string for the house
     * @return mapString2
     */

    public String HouseString() {
        String mapString2 = "\n DIRECTORY of Houses";

        for (int i = 0; i < this.houses.size(); i ++) {
            mapString2 += "\n  " + (i+1) + ". "+ this.houses.get(i).getName() + " (" + this.houses.get(i).getAddress() + ")";
        }
        return mapString2;
    }

    /**
     * create the string for the library
     * @return mapString3
     */
    
    public String LibraryString() {
        String mapString3 = "\n DIRECTORY of Libraries";

        for (int i = 0; i < this.libraries.size(); i ++) {
            mapString3 += "\n  " + (i+1) + ". "+ this.libraries.get(i).getName() + " (" + this.libraries.get(i).getAddress() + ")";
        }
        return mapString3;
    }

    /**
     * create the string for the cafe
     * @return mapString4
     */

    public String CafeString() {
        String mapString4 = "\n DIRECTORY of Cafes";

        for (int i = 0; i < this.cafes.size(); i ++) {
            mapString4 += "\n  " + (i+1) + ". "+ this.cafes.get(i).getName() + " (" + this.cafes.get(i).getAddress() + ")";
        }
        return mapString4;
    }
    

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addLibrary(new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Sage Hall", "144 Green St, Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Campus Center", "1100 Elm St, Northampton, MA 01063", 2));
        myMap.addHouse(new House("Lawrence House", " 78 Green St, Northampton, MA 01060", 4));
        myMap.addBuilding(new Building("Wright Hall", "College Ln, Northampton, MA 01063", 2));
        myMap.addHouse(new House("Cutter House", "10 Prospect St, Northampton, MA 01060", 4));
        myMap.addHouse(new House("Albright House", "7, Bedford Terrace, Northampton, MA 01063", 4));
        myMap.addHouse(new House("Park House", "B5, Smith College, 134 Elm St, Northampton, MA 01063", 4));
        myMap.addLibrary(new Library("Josten Library", "Mendenhall Center, 122 Green St, Northampton, MA 01063", 3));
        myMap.addHouse(new House("Tyler House", "151-199 Green St, Northampton, MA 01060", 4));
        System.out.println(myMap);
        System.out.println(myMap.BuildingString() + myMap.HouseString() + myMap.LibraryString() + myMap.CafeString());
        
    }
    
}
