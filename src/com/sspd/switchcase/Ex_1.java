package com.sspd.switchcase;

import javax.swing.*;

public class Ex_1 {
    public static void main(String[] args) {


   String name = JOptionPane.showInputDialog("Enter Your name");
   String pass = JOptionPane.showInputDialog("Enter Your password");

   if(name.equals("MgNaing")&&pass.equals("898")){

     JOptionPane.showMessageDialog(null,"Correct");

        }
        else
            JOptionPane.showMessageDialog(null,"Trying Again");

    }



}
