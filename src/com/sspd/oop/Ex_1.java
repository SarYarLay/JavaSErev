package com.sspd.oop;

public class Ex_1 {

    public static void main(String[] args) {

        Animals an = new Animals();
        an.getInfo("Tiger","Asia",5);
      //  System.out.println(an);


        an.makesound();


    }



}


class Animals{

   String name;

   String type;

   int age;


   void getInfo(String name,String type,int age){

       System.out.println(name);
       System.out.println(type);
       System.out.println(age);

   }
   void makesound(){
       System.out.println("Woofff.........");

   }


}
