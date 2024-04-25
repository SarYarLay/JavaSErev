package com.sspd.oop;


import java.util.Scanner;

class Work{

 String name;

 String useful;


void getInfo(String name,String useful){

    this.name = name;
    this.useful= useful;
    System.out.println( name+" "+useful);

}
//void gatInfo(String name,String useful){
 ////   this.name = name;
//    this.useful = useful;



//}




}


public class Machine {

    public static void main(String[] args) {


        Work wk = new Work();

        Scanner input = new Scanner(System.in);
        System.out.print("Matchine name = ");
         String num = input.nextLine();

        System.out.print("What you can Use =");
        String numm =input.nextLine();

        wk.getInfo(num,numm);









    }



}
