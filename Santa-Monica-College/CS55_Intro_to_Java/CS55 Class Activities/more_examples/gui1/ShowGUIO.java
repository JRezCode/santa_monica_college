package gui1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jon
 */
public class ShowGUIO 
{
    public static void main(String [] args)
    {   
        String name = JOptionPane.showInputDialog("What is your name?");
        String strNum = JOptionPane.showInputDialog(name+ " How old are you?");
        int age = Integer.parseInt(strNum);
        //String out = "";
        //out+=name+" I know you are\n"+age+" old";
        JOptionPane.showMessageDialog(null,name+" I know you are\n" + age + " old");
        display("test");
        System.exit(0);
    }        
    //New Method - pass the string (from main?) to this method
    
    public static void display(String str)
    {
        JTextArea jt = new JTextArea(20,25);
        jt.setBackground(Color.CYAN);
        jt.setForeground(Color.BLACK);
        Font f = new Font("times new roman",Font.BOLD+Font.ITALIC,30);
        jt.setFont(f);
        jt.setText(str);
        JOptionPane.showMessageDialog(null,jt);
    }
    
/*    public static void display(String str,Color fg, Color bg, int size)
    {
        JTextArea jt = new JTextArea(20,25);
        jt.setBackground(bg);
        jt.setForeground(fg);
        Font f = new Font("times new roman",Font.BOLD+Font.ITALIC,33);
        jt.setFont(f);
        jt.setText(str);
        JOptionPane.showMessageDialog(null,jt,size);
    }
    } */
}
