package aviTheRipper;

import java.util.Scanner;

public class Console {



    public void run(){

        Scanner input = new Scanner(System.in);

        GenRandomWord getWords = new GenRandomWord();

        System.out.print("Enter how long you want each word to be: ");
        int numberOfLetters = input.nextInt();
        System.out.print("Enter how many word you want: ");
        int numberOfWords = input.nextInt();

        String[] resultArray = new String[numberOfWords];
        resultArray = getWords.genRandomWord(numberOfLetters, numberOfWords);
        getWords.printOutArrayOfStrings(resultArray);

    }

}
