package aviTheRipper;


import java.util.Scanner;

public class Console {

    public void getInput(){
        Scanner input = new Scanner(System.in);



        System.out.print("Enter how long you want each word to be: ");
        int numberOfLetters = input.nextInt();
        System.out.print("Enter how many word you want: ");
        int numberOfWords = input.nextInt();


    }


    public void run(int numberOfWords, int numberOfLetters){

        GenRandomWord getWords = new GenRandomWord();

        String[] resultArray = new String[numberOfWords];
        resultArray = getWords.genRandomWord(numberOfLetters, numberOfWords);
        getWords.printOutArrayOfStrings(resultArray);

    }

}
