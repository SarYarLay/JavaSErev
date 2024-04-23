package com.sspd.switchcase;

import javax.swing.*;

public class Ex_2 {

    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Enter Your Name");
        String pass = JOptionPane.showInputDialog("Enter Your Passwor");

        String result  = (name.equals("Terry") && pass.equals("800"))? "Correct" : "Try Again";

        JOptionPane.showMessageDialog(null,result);



    }

}
