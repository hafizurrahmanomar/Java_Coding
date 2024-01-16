package javaArryList_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class JavaArryList {

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Hafiz");
        namesList.add("nayeem");
        namesList.add("Toha");

        // System.out.println("My name is:"+namesList.get(0));
        for (String name : namesList) {
            System.out.println("My name is:" + name);
        }

        ArrayList<String> fruitsList = new ArrayList<String>();

        // Arraylist add an item
        fruitsList.add("Mango");
        fruitsList.add("Banana");
        System.out.println("Fruit Name:" + fruitsList.get(0));

        // Change an Item
        fruitsList.set(0, "Apple");
        System.out.println("Fruit Name:" + fruitsList.get(0));
        fruitsList.add("Rose Apple");
        System.out.println("Fruit Name:" + fruitsList.get(0));

        for (String fruit : fruitsList) {
            System.out.println("Fruit Name:" + fruit);
        }

        // 0 number index remove
        fruitsList.remove(0);
        System.out.println("Fruit Name:" + fruitsList.get(0));

        // All ArrayList clear
        fruitsList.clear();
        System.out.println("Fruit Name:" + fruitsList);

        // Integer item
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(3);
        myNumbers.add(5);

        // Collections.sort(myNumbers);

        for (int i : myNumbers) {
            System.out.println(i);
        }

    }

}
