
package javaOOP_Inheritance_09;

//Parent class
public class Student {
    
    //Constructors create
    String address = "Pabna";
    public Student(){
        this.address = address;
    
    }
    
    
    
    
    
    public void Name(String name){
        System.out.println("Student name: " + name);
       
     }
    
    
     public void Age(int age){
         System.out.println("Student age: " + age);
    }
     
     public void Roll(int roll){
         System.out.println("Student roll No : " + roll);
    
    }
     
       public void ClassName(String className){
           System.out.println("Class name: " + className);
    
    }
    
       public void Thana(){
       System.out.println("Thana name: " + address);
       }
       
        public void Dist(){
       System.out.println("District name: " + address);
       }
}
