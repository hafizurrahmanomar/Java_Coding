
package javaControlFlow;


public class Loop {
    
    //====do loop====
        public static void main(String[] args) {

        int counter =2;

        do{
        System.out.println(counter);
        counter+=2;

        }while(counter<10);
        
        System.out.println("do loop end");
        
        
//==== for Loop======
// Statement 1 sets a variable before the loop starts (int i = 0).

// Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.

// Statement 3 increases a value (i++) each time the code block in the loop has been executed.
     
        for(int i=0;i<10;i++){
            System.out.println(i);
       

    }

   System.out.println("do loop end");
   
   //===while loop======

//    int count=1;  
//    while (counter<20) {
//    System.out.println(count);
//    count++;
//    }  
      
          
    }             
}
