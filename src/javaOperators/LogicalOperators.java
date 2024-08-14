// Java Logical Operators

package javaOperators;

public class LogicalOperators {
    public static void main(String[] args) {      	
        
 //==== AND Operator(&&)====
 // && 	Logical and Returns true if both statements are true		   
int x = 15;
System.out.println(x < 5 &&  x < 10);

System.out.println(true && true); // Prints: true
System.out.println(true && false); // Prints: false
System.out.println(false && true); // Prints: false
System.out.println(false && false); // Prints: false



//===The OR Operator===
//  || 	Logical or Returns true if one of the statements is true

System.out.println(true || true); // Prints: true
System.out.println(true || false); // Prints: true
System.out.println(false || true); // Prints: true
System.out.println(false || false); // Prints: false
System.out.println(x < 5 || x < 16);

//=====NOT Operator=====
// ! Logical not Reverse the result, returns false if the result is true
boolean a = true;
System.out.println(!a); // Prints: false;

System.out.println(!false); // Prints: true;


        

    
}

}
