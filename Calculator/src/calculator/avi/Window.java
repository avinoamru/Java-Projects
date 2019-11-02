package calculator.avi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Window extends JFrame {


    private int screenHeight = 500;
    private int screenWidth = 500;




    private int buttonHeight = 75;
    private int buttonWidth = screenWidth / 4;

    private int arraySize = 14;
    private JButton[] buttons = new JButton[arraySize];



    JTextArea inputBox() {
        JTextArea text = new JTextArea();

        text.setColumns(screenWidth);
        text.setRows(1);
        text.setBackground(Color.WHITE);
        text.setBounds(0,0,screenWidth,screenHeight/7);
        text.setFont(new Font("Ariel", Font.PLAIN,text.getHeight()));

        this.add(text);
        return text;
    }

    JButton createButton(String label, int x, int y, int width, int height) {
        JButton aButton = new JButton();
        return aButton;
    }



    private JButton[] createNumbersButtons() {
            int index = 0;

            for (index = 0; index < arraySize; index++) {
                buttons[index] = createButton("", 100, 100, buttonWidth, buttonHeight);
                if (index == 0) {
                    buttons[index].setBounds(0, inputBox().getHeight() , buttonWidth, buttonHeight);
                    buttons[index].setLabel("7");

                }
                else if (index == 1){
                    buttons[index].setBounds( buttonWidth, inputBox().getHeight() , buttonWidth, buttonHeight);
                    buttons[index].getIcon();
                    buttons[index].setLabel("8");
                }
                else if (index == 2){
                    buttons[index].setBounds( buttonWidth * 2, inputBox().getHeight() , buttonWidth, buttonHeight);
                    buttons[index].setLabel("9");
                }
                else if (index == 3){
                    buttons[index].setBounds( 0, inputBox().getHeight()*2 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("4");
                }
                else if (index == 4){
                    buttons[index].setBounds( buttonWidth, inputBox().getHeight()*2 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("5");
                }
                else if (index == 5){
                    buttons[index].setBounds( buttonWidth *2, inputBox().getHeight()*2 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("6");
                }
                else if (index == 6){
                    buttons[index].setBounds( 0, inputBox().getHeight()*3 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("1");
                }
                else if (index == 7){
                    buttons[index].setBounds( buttonWidth, inputBox().getHeight()*3 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("2");
                }
                else if (index == 8){
                    buttons[index].setBounds( buttonWidth*2, inputBox().getHeight()*3 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("3");
                }
                else if (index == 9){
                    buttons[index].setBounds( buttonWidth, inputBox().getHeight()*4 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("0");
                }
                else if (index == 10){
                    buttons[index].setBounds( buttonWidth*3, inputBox().getHeight() , buttonWidth, buttonHeight);
                    buttons[index].setLabel("/");
                }
                else if (index == 11){
                    buttons[index].setBounds( buttonWidth*3, inputBox().getHeight()*2 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("X");
                }
                else if (index == 12){
                    buttons[index].setBounds( buttonWidth*3, inputBox().getHeight()*3 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("-" );
                }
                else if (index == 13){
                    buttons[index].setBounds( buttonWidth*3, inputBox().getHeight()*4 , buttonWidth, buttonHeight);
                    buttons[index].setLabel("+");
                    buttons[index].addActionListener(
                            new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent actionEvent) {

                                }
                            }
                    );
                }



                this.add(buttons[index]);


            }   return buttons;
    }

       void screen(){
       this.inputBox();
       createNumbersButtons();

       this.setLayout(null);
       this.setVisible(true);
       this.setSize(screenWidth, screenHeight);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);

       }




}









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

                        break;

               }
            */
