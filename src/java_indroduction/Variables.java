package java_indroduction;

public class  Variables {
    public static void main(String[] args) {
        //To create a variable, you must specify the type and assign it a value:
                
                String name = "Hafizur Rahman";
                System.out.println(name);
                name = "Toha";
                
                //declare the variable as "final" or "constant", which means unchangeable and read-only
                final int myAge = 35;
                System.out.println(myAge);
                final String Name = "Hafizur Rahman";
                //Name = "Toha";
                System.out.println(Name);
             
                int num = 10;
                System.out.println(num);
                float floatNum = 10;
                System.out.println(floatNum);
                double d_number = 12;
                System.out.println(d_number);
                char myLetter = 'A';
                System.out.println(myLetter);
                boolean myBool = false;
                System.out.println(myBool);
                
                //To combine both text and a variable, use the + character:
                System.out.println("Assslamu alykum "+name);
                
                //You can also use the + character to add a variable to another variable:
        
                String firstName = "Hafizur ";
                String lastName = "Rahman";
                String fullName = firstName + lastName;
                System.out.println(fullName);
                
                //One Value to Multiple Variables
                int a, b, c;
                a = b = c = 10;
                System.out.println(a + b + c);
                
                
            
        
            }
        
        }
        
        
        
        //String - stores text, such as "Hello". String values are surrounded by double quotes
        //int - stores integers (whole numbers), without decimals, such as 123 or -123
        //float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        //char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        //boolean - stores values with two states: true or false
        
        //The general rules for naming Variables are:
        //
        //	Names can contain letters, digits, underscores, and dollar signs
        //	Names must begin with a letter
        //	Names should start with a lowercase letter and it cannot contain whitespace
        //	Names can also begin with $ and _ (but we will not use it in this tutorial)
        //	Names are case sensitive ("myVar" and "Myvar" are different Variables)
        //	Reserved words (like Java keywords, such as int or boolean) cannot be used as names
          



