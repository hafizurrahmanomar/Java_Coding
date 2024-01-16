package dataType_03;

public class numbers {

   

        public static void main(String[] args) {
            //The byte data type can store whole numbers from (3digit)-126 to 129.
            byte myNum = 100;
            System.out.println(myNum);
            
            //The short data type can store whole numbers from (5digit) -12348 to 23569
            short Num = 23568;
            System.out.println(Num);
            //The int data type can store whole numbers from(10digit) -2147483648 to 2147483647
            int mynum = 1000000000;
            System.out.println(mynum);
            
            /*The long data type can store whole numbers from(18digit) -9223372036854775808 to 9223372036854775807. 
            This is used when int is not large enough to store the value.
            Note that you should end the value with an "L":*/
            
            long num = 150000000000000000L;
            System.out.println(num);
            
            //The float and double data types can store fractional numbers. 
            //Note that you should end the value with an "f" for floats and "d" for doubles:
            
            //float variables have a precision of about 7 digits.
            float myflot = 5.75254785f;
            System.out.println(myflot);
            
            //double variables have a precision of about 16 digits.
            double mydouble = 2.9954213654123454578d;
            System.out.println(mydouble);
            
            //A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10
            float floatPower = 35e3f;
            double doublePower = 12E5d;
            System.out.println(floatPower);
            System.out.println(doublePower);
            
    
        }
    
    }
    
    
    // Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
    // Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
