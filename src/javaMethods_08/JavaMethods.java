
package javaMethods_08;


public class JavaMethods {


    public static void main(String[] args) {
        
  
         // create an object of javaNonVoid
        javaNonVoid add = new javaNonVoid();
        
        int sum1 = add.addNumbers(5, 10);
        int sum2 = add.addNumbers(25, 10);
        System.out.println("Total count: " +sum1);
        System.out.println("Total count: " +sum2);

        int result1 = add.result(50, 90);
        int result2 = add.result(60, 90);
        //System.out.println("Sum1 is: " + result1);
        //System.out.println("Sum2 is: " + result2);
        
        // Define mutator (setter => this) methods
       thisNumber addMe = new thisNumber();
       addMe.setName("Hafizur Rahman Omar");
       addMe.setNumber(124);
       addMe.printDetails();
       
       // java void method
       javaVoid vAdd = new javaVoid();
       
       vAdd.getName();
       vAdd.getNumber();
 
    }
    
}
