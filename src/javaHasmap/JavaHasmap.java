package javaHasmap;

import java.util.HashMap;

public class JavaHasmap {

    public static void main(String[] args) {
        // TODO code application logic here

        //The HashMap class has many useful methods. For example, to add items to it, use the put() method:
        HashMap<Integer, String> distName = new HashMap<>();

        distName.put(14, "Pabna");
        distName.put(24, "Dhaka");
        distName.put(4, "Bogura");
        distName.put(1, "Gazipur");

        for (Integer key : distName.keySet()) {
            System.out.println("My dist Name is:" + distName.get(key));

        }
// Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        
        for (String key : capitalCities.keySet()) {
            System.out.println("My dist Name is:" + capitalCities.get(key));

        }

    }
}
