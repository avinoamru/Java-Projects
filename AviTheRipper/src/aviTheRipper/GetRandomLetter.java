package aviTheRipper;

import java.util.Random;

public class GetRandomLetter  extends UsableLetters{
    static char[] lowerLetterArray;
    static char[] upperLetterArray;

    static char genRandomLetter(){

        Random rnd = new Random();

        char[] letters = usableLetters(lowerLetterArray, upperLetterArray);


//               return  lower[rnd.nextInt(lower.length-1)];
        return letters[rnd.nextInt(letters.length-1)];

    }



}
