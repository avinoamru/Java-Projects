package aviTheRipper;

import java.util.Scanner;

public class GenRandomWord extends GetRandomLetter {
    static Scanner input = new Scanner(System.in);

    static String[] genRandomWord(int numOfLetters, int numOfWords){


        char randomWord = genRandomLetter();
        String temporaryString;
        String[] temporaryArrayOfStrings = new String[numOfWords];
        for (int i = 0; i < numOfWords; i++){
            temporaryString = "";
            //genRandomLetter();
            for (int y = 0; y < numOfLetters; y++){
                temporaryString += genRandomLetter();
            }
            temporaryArrayOfStrings[i] = temporaryString;
        }

        String[] arrayOfStrings = new String[numberOfLetters];
        arrayOfStrings = genRandomWord(numberOfLetters,numberOfWords);
        for (int i = 0; i <arrayOfStrings.length; i++){
            System.out.println(arrayOfStrings[i]);
        }
        return temporaryArrayOfStrings;

    }


}
