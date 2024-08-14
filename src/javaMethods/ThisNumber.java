
package javaMethods;

// Define a class
public class ThisNumber {
    
   // Define instance variables
    private int number ;
    private String name;
  
    // Define accessor (getter) methods
    public int getNumber(){ 
        return number;
    }
  
    public String getName(){
        return name; 
    }
 
    // Define mutator (setter) methods
    public void setNumber(int number)
    {
        this.number = number;
    }
  
    public void setName(String name) { 
        this.name = name; 
    }
  
    // Define other methods
    public void printDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        
    }  
    
}

     



    