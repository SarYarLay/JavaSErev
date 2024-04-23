package com.sspd.array;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {


        int[] i = new int[5];

        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        i[4] = 5;

        for (int a : i) {
            System.out.println(a);

        }

        System.out.println("////////////////////");


        int[] z = {2, 54, 1, 5, 6,};

        System.out.println(z[1]);

        System.out.println("////////////////////");

        try {

            int[][] t = {{2, 34, 45, 6}, {22, 87, 6, 7},
                    {76, 9, 4, 7}, {0, 1, 2, 3}};//0 1 2 3 {1,2,31}

            Scanner input = new Scanner(System.in);


            System.out.print("Enter the role[0 1 2 3 ] =");
            int num = input.nextInt();


            System.out.print("Enter the colum[0,1,2,3] =");
            int numm = input.nextInt();


            System.out.println("This room is = " + t[num][numm]); //role[] //column[]

        }catch(Exception e){

            System.out.println("That is no Found");

          //  JOptionPane.showMessageDialog(null,"Not Found");
        }





        }







}
