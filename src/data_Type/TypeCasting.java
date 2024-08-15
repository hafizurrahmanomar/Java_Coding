package data_Type;

public class TypeCasting {

    public static void main(String[] args) {

        int a = 8;
        double b = a;// Automatic casting: int to double
        // int to double,float to double type casting possible but reverse (double to int)cysting not possible
        // int c = b;
        //manual cating
        int c = (int) b;
        System.out.println(c);
        // float must be declaring with-'f'
        float height = 70.0f;
        double height1 = height;
        System.out.println(height1);
        System.out.println(b);
        System.out.println(a);
        

    }

}
