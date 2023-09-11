package multiplicationtable;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class multiplicationtable {
  public static void main(String[] args){
    JFrame frame = new JFrame();    //creates a frame
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of the app
    frame.setTitle("MultiplicationTable");
    frame.setResizable(false);
    frame.setSize(420, 400);     //set the x and y dimension of plane
    ImageIcon image = new ImageIcon("calculatoricon.png"); 
    frame.setIconImage(image.getImage());     //set icon
    frame.getContentPane().setBackground(Color.GRAY); //set colour


  }

  
}
