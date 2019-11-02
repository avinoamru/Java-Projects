package notepad.gui;

import javax.swing.*;

public class Screen extends JFrame {

   public void Screen() {
         int screenHeight = 600;
         int screenWidth = 800;



        this.setTitle("Notepad");




        this.setVisible(true);
        this.setLayout(null);
        this.setSize(screenWidth, screenHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }





}
