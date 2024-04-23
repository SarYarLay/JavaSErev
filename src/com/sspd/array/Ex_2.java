package com.sspd.array;

public class Ex_2 {


    public static void main(String[] args) {


        int[][] number = {


                {3, 4, 7},
                {5, 7},
                {6, 8}

        };



        for (int y = 0; y <= number.length - 1; y++) {

            for (int yy = 0; yy <= 1; yy++) {

                System.out.println("Row : " + y + " Column :  " + number[y][yy]);
            }


        }


    }
}