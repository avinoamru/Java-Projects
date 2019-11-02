package notepad.gui;

import javax.swing.*;
import java.awt.*;

public class NotepadFrame extends JFrame {

     private int frameHeight = 600;
     private int frameWidth = 800;


    JTextArea textBox() {
        JTextArea text = new JTextArea();

        text.setBackground(Color.WHITE);
        text.setBounds(0,0,frameWidth,frameHeight);
        text.setFont(new Font("Ariel", Font.PLAIN,24));
        text.setSelectedTextColor(Color.cyan);

        this.add(text);

        return text;
    }

    JMenuBar menuBar(){
        JMenuBar mBar = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenuItem fileNew, fileOpen, fileSave, fileSaveAs;

        fileNew = new JMenuItem("New");
        fileOpen = new JMenuItem("Open");
        fileSave = new JMenuItem("Save");
        fileSaveAs = new JMenuItem("Save as..");

        mFile.add(fileNew); mFile.add(fileOpen);
        mFile.add(fileSave); mFile.add(fileSaveAs);

        mBar.add(mFile);
        mBar.add(mEdit);


        return mBar;
    }



     void Screen() {
        textBox();
        this.textBox();

        menuBar();
        this.setJMenuBar(menuBar());


        this.setTitle("Notepad");
        this.setVisible(true);
        this.setLayout(null);
        this.setSize(frameWidth, frameHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }





}
