
package javaAbstractClass;


public class JavaAbstractClass {


 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animal = new Animal() {
            //Java Anonymous Class Create but Abstract class no object create
            @Override
            public void milk() {
                System.out.println("5 litter milk");
            }

            @Override
            public void makeSound() {
                System.out.println("Hamba");
            }
        };
        
        //abstract call by Java Anonymous
        animal.makeSound();
        animal.milk();
       
        //Abstract and Non-abstract call by "Cow" object create
        Cow myCow = new Cow();
        myCow.eat();
        myCow.color();
        myCow.makeSound();
        myCow.milk();
        
        
        //interface class call
       myCow.ownerName();
       myCow.ownerAdress();
       myCow.totalCow();
       
    }
    
}
