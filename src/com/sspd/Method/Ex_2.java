package com.sspd.Method;

public class Ex_2 {

    public static void main(String[] args) {


        System.out.println(new Ex_2().getMoon());
        System.out.println(getMoon(8,8));

        System.out.println(getMoon(2.3,23.5));
        System.out.println(getMoon("Nar Sayar ","Gyi"));

        System.out.println(getNarrowcase('N'));
        System.out.println(getWidingcase(9));


    }

    int getMoon(){

        int y = 12+12;


        return y;

    }
    static int getMoon(int a,int b){

      return a+b;

    };


    static double getMoon(double x,double y){

        return x+y;

    }
    static String getMoon(String stra,String strb){

        return  stra+strb;


    }

static  int getNarrowcase(char  ch){

        int x  = ch;
        return x;


}
static char getWidingcase(int i){
        char y = (char)i;
        return y;

}


}
