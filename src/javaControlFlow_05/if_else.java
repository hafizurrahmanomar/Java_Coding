
package javaControlFlow_05;

public class if_else {
    
    public static void main(String[] args) {
        
    //defining a variable  
    int number=13;  
    //Check if the number is divisible by 2 or not  
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    } 
    
    
    
//    Leap Year Check
   System.out.println("//Leap Year Check");
    int year=2020;    
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
        System.out.println("LEAP YEAR");  
    }  
    else{  
        System.out.println("COMMON YEAR");  
    } 
    
    
    //====Using Ternary Operator====
    
    System.out.println("Ternary Operator start");
    
    int num=13;    
    //Using ternary operator  
    String output=(num%2==0)?"even num":"odd num";    
    System.out.println(output);
    
    
    
// ===//It is a program of grading system====   

  System.out.println("It is a program of grading system chcek");
  
   int marks=90;  
      
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){  
        System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){  
        System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){  
        System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){  
        System.out.println("A grade");  
    }else if(marks>=90 && marks<100){  
        System.out.println("A+ grade");  
    }else{  
        System.out.println("Invalid!");  
    
    }
    
    //===Java Nested if statement====
    
    //Creating two variables for age,donateMonth and weight    
    int age=25;    
    int weight=50; 
    int donateMonth = 3;
    //applying condition on age,donateMonth and weight    
    if(age>=18){      
        if(weight>50){
            if(donateMonth>=4){
                System.out.println("You are eligible to donate blood"); 
        }else{
              System.out.println("You are not eligible to donate blood cause early blood donate");  
            }    
              
        } else{  
            System.out.println("You are not eligible to donate blood cause weight less than 50 kg");    
        }  
    } else{  
      System.out.println("Age must be greater than 18");  
    }  
    
    
    }
}
