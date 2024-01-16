package javaOOP_07;

public class costs {
     int bazar = 480;
     int cloth = 1400;
     int totalbazarCost = 0;

     public void totalcosts() {

          totalbazarCost = bazar + cloth;
          System.out.println("Total bazar costs is : " + totalbazarCost);
     }

     // non void mathod
     public int mybazarcost() {

          totalbazarCost = bazar + cloth;
          System.out.println("Total bazar costs is : " + totalbazarCost);
          return totalbazarCost;
     }

}
