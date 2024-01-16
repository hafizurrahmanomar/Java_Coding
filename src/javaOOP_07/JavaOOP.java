
package javaOOP_07;


public class JavaOOP {

    public static void main(String[] args) {
        //myInfo -> info object create
        
        myInfo info = new myInfo();
        
        String myName = info.name;
        int myAge = info.age;
       
        String myVillage = info.Village;
        String myDist = info.Dist;
        
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myVillage);
        System.out.println(myDist);
       
        costs myCost = new costs();
        myCost.totalcosts();
        
        //Non void method
        int b_cost = myCost.mybazarcost();
      
        
        
    }
    
}
