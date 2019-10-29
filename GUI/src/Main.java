


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import ticTacToe.TTTBackEnd;


public class Main {

   static TTTBackEnd tttBackEnd = new TTTBackEnd(3);

   static int cols = 3;
  static  int rows = 3;

// static ArrayList<Button> btnArray = new ArrayList<Button>();
 static Button[][] btnArray = new Button[cols][rows];

 static void createBtnListener(Button aBtn){
     aBtn.addActionListener(
             new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent actionEvent) {
                     System.out.println("hello");

                 }
             }
     );
 }


    static void refreshScreen(){
        char[][] board = new char[cols][rows];
        board = tttBackEnd.getGameBoard();


        for (int i = 0; i < btnArray.length;i++){
            for (int j = 0; j < btnArray[i].length;j++){
//                System.out.println(btnArray[i][j]);
                btnArray[i][j].setLabel(String.valueOf(board[i][j]));
//                board[i][j]

            }
//            System.out.println(btnArray.get(i).getLabel());

        }

    }

    public static void main(String[] args) {

        tttBackEnd.initializeBoard();

        tttBackEnd.addToBoard(0,0,'X');


        int fWidth = 800;
        int fHeight = 600;
        int offset = 20;

          Button[] colArray = new Button[cols];
         Button[] rowArray = new Button[rows];


        Button btnStart = new Button("Start");
        Button btnReset = new Button("Reset");

        Frame f = new Frame("TIc Tac Toe");
        f.setSize(fWidth, fHeight);

//      Creating 2 buttons ("Start" and "Reset" and setting their size and position
        f.add(btnStart);

        btnStart.setBounds(0, 540, 100, 60);
        btnStart.setBounds(0, f.getHeight() - btnStart.getHeight(), f.getWidth() / 2, btnStart.getHeight());

        f.add(btnReset);
        btnReset.setBounds(btnStart.getWidth(), 100, 100, 60);
        btnReset.setBounds(f.getWidth() / 2, f.getHeight() - btnReset.getHeight(), f.getWidth() / 2, btnReset.getHeight());

        // Setting grid buttons sizes
        int buttonHeight = (fHeight - btnStart.getHeight()) / rows;
        int buttonWidth = fWidth / cols;



        // Setting the initial function of "Start" and "Reset" buttons (not completed)
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

//      Creating the grid of buttons (The problem is HERE |
//                                                        V
        for (int r = 0; r < rows; r++) {
            if (r == 0) {

                for (int c = 0; c < cols; c++) {
                    colArray[c] = new Button(" " + c);
                    createBtnListener(colArray[c]);
                    btnArray[r][c] = colArray[c];
                    f.add(colArray[c]);
                    if (c == 0) {
                        colArray[c].setBounds(0, offset, buttonWidth, buttonHeight);

                    } else {
                        colArray[c].setBounds(colArray[c - 1].getWidth() + colArray[c - 1].getX(), offset, buttonWidth, buttonHeight);

                    }
                }
            } else {
                for (int c = 0; c < cols; c++) {
                    colArray[c] = new Button("" + c);
                    createBtnListener(colArray[c]);
                    btnArray[r][c] = colArray[c];
                    f.add(colArray[c]);

                    if (c == 0) {
                        colArray[c].setBounds(0, buttonHeight*r, buttonWidth, buttonHeight);
                    } else {
                        colArray[c].setBounds(colArray[c - 1].getWidth() + colArray[c - 1].getX(), colArray[c - 1].getHeight()*r, buttonWidth, buttonHeight);

                    }

                }

            }


        }





        f.addWindowListener(new WindowAdapter() {
                                public void windowClosing(WindowEvent we) {
                                    f.dispose();
                                }
                            }
        );

        f.setLayout(null);
        f.setVisible(true);

        refreshScreen();
    }

}
