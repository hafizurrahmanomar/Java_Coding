
package javaArrays_06;


public class JavaArrays {

    
    public static void main(String[] args) {
        
       String [] names = {"Hafiz","Nayeem","Toha","Tohura"};
        //index = count-1
        
        System.out.println(names[0]);
        System.out.println("Size of arry is = "+names.length);
        System.out.println("Last index of arry is = "+(names.length-1));
        
        int [] vlues = {5,8,10,12,18,20};
        
        System.out.println(names[3]);
        System.out.println("Size of arry is = "+vlues.length);
        System.out.println("Last index of arry is = "+(vlues.length-1));
        
        //for loop
        for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
        }
        
          //for loop
        for (int i = 0; i < names.length; i++) {
            int value =vlues[i];
        System.out.println("My Value is "+value);
        }
        //Array with For-Each
        
        for (String i : names) {
        System.out.println(i);
        }
        
        
    }
    
}
