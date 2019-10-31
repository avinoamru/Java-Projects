package calculator.avi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame {
        private Model model = new Model();

      private int screenHeight = 800;
      private int screenWidth = 600;
      private int offset = 100;


       private int cols = 4;
       private int rows = 4;

       private int buttonHeight = ((screenHeight-130)/cols) ;
       private int buttonWidth = (screenWidth/rows);

       private GridButton[][] btnArray = new GridButton[cols][rows];



  private GridButton[][] screen() {
      char symbol = 0;
       for (int r = 0; r < rows; r++){
           for (int c = 0; c < cols; c++){
               final GridButton[][] aButton = new GridButton[r][c];
               GridButton aBtn = null;
               aButton[cols][rows] = aBtn;
               model.btnAction(aBtn);
               aButton[r][c].x = r;
               aButton[r][c].y = c;
               aButton[r][c].setBounds(buttonWidth * r, buttonHeight * c + offset, buttonWidth, buttonHeight);

              /*switch (symbol){
                   case 0:
                       aButton[r][c].setLocation(0,100);

                       break;

                  case 1:
                       aButton[r][c].setLocation(0,267);

                       break;

                  case 2:
                        aButton[r][c].setLocation(0,434);

                        break;*/

                /*  case 3:
                        aButton[0].setLocation(0,601);

                        break;

                  case 4:
                        aButton[0].setLocation(150,100);

                        break;

                  case 5:
                        aButton[0].setLocation(150,267);

                        break;

                  case 6:
                        aButton[0].setLocation(150,434);

                        break;

                  case 7:
                        aButton[0].setLocation(150,601);

                        break;

                  case 8:
                        aButton[0].setLocation(300,100);

                        break;

                  case 9:
                        aButton[0].setLocation(300,267);

                        break;

                  case 10:
                        aButton[0].setLocation(300,434);

                        break;

                  case 11:
                        aButton[0].setLocation(300,601);

                        break;

                  case 12:
                        aButton[0].setLocation(450,100);

                        break;

                  case 13:
                        aButton[0].setLocation(450,267);

                        break;

                  case 14:
                        aButton[0].setLocation(450,434);

                        break;

                  case 15:
                        aButton[0].setLocation(450,601);

                        break;*/

//               }
                   this.add(aButton[r][c]);
               btnArray[r][c] = aButton[r][c];

           }
       }


       this.setLayout(null);
       this.setVisible(true);
       this.setSize(screenWidth,screenHeight);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       return btnArray;
    }

    public GridButton[][] getScreen(){
      return screen();
    }

}


