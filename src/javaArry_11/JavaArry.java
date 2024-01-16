
package javaArry_11;


public class JavaArry {

   
    public static void main(String[] args) {
        //Arrays are used to store multiple values in a single variable, 
        //To declare an array, define the variable type with square brackets:
        
        String []Names ={"Hafiz","Nyeem","Toha"};
        
       //Names[3]="Almas";
       
      System.out.println("My name is : "+Names[2]);
      System.out.println("Array Lenth:" + Names.length);
      
      //outputs all elements in the Names array, using a "for-each" loop
       for(String i:Names){
           System.out.println("My Name is: "+i);
       }
    }
    
}
