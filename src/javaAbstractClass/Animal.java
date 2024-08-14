
package javaAbstractClass;

//parent and abstract class.
public abstract class Animal {


   //Non-abstract methods
    public void eat(){
        System.out.println(" Cow eat grass");
    }
    
    //Non-abstract methods
     public void color(){
        System.out.println("The Cow is red color");
    }
   
     
     
     //abstract methods declear
     public abstract void milk();
     public abstract void makeSound();
     
     
     
}
