package avinoamGUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {



        public static void main(String[] args) {
            Frame f=new Frame("TIc Tac Toe");
            f.setSize(800,600);

            int offset = 10;

            int cols = 3;
            int rows = 3;

            Button[] colArray = new Button[cols];
            Button[] rowArray = new Button[rows];



            Button btnStart=new Button("Start");
            Button btnReset=new Button("Reset");


            f.add(btnStart);

            btnStart.setBounds(0,540,300,60);
          btnStart.setBounds(0,f.getHeight()- btnStart.getHeight() ,f.getWidth() / 2 ,btnStart.getHeight());

            f.add(btnReset);
            btnReset.setBounds(btnStart.getWidth(),540,300,60);
          btnReset.setBounds(f.getWidth()/2, f.getHeight()-btnReset.getHeight(),f.getWidth() / 2,btnReset.getHeight());




            btnStart.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            f.setTitle("Start");
                        }
                    }
            );

            btnReset.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            f.setTitle("Reset");
                        }
                    }
            );





            for (int c = 0; c < cols; c++){
                colArray[c] = new Button("" + c);
                f.add(colArray[c]);
                colArray[c].setBounds(0,offset,60, 60);
//                colArray[c].setBounds(0,;


            }








            f.addWindowListener(new WindowAdapter() {
                                    public void windowClosing(WindowEvent we) {
                                        f.dispose();
                                    }
                                }
            );

            f.setLayout(null);
            f.setVisible(true);
        }
    }



