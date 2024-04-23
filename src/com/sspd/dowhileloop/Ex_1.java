package com.sspd.dowhileloop;

import javax.swing.*;

public class Ex_1 {
    public static void main(String[] args) {

        int pass = 007;

        int result;
        String name;

        try {

            do {

                name = JOptionPane.showInputDialog("Insert Your Name");

                result = Integer.parseInt(JOptionPane.showInputDialog("Insert Your Password"));

                if (!(result == pass && name.equals("JaneSpoon"))) {

                    JOptionPane.showMessageDialog(null, "That is not Found");

                }

            } while (result != pass || !(name.equals("JaneSpoon")));

            JOptionPane.showMessageDialog(null, "Correct Done");

        }catch (Exception e){
          JOptionPane.showMessageDialog(null,"Error");
        }
        }







}
