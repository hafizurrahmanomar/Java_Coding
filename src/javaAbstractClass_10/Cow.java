
package javaAbstractClass_10;


//Child Class but extends Animal class
public class Cow extends Animal implements OwnerDetails,cowCount{

    @Override
    public void milk() {
        //abstract methods
         System.out.println("The cow give me five litter milk");
    }

 
    @Override
    public void makeSound() {
         System.out.println("Hamba Hamba");
       
    }
    
    //interface class add
    @Override
    public void ownerName() {
        System.out.println("Hafgizur Rahman Omar");
    }

    @Override
    public void ownerAdress() {
        
        System.out.println("Ruppur,Pabna");
        
    }

    @Override
    public void totalCow() {
        
        System.out.println("Total Cow = 20");
    }
        
}
   
    
    
    
    

