package aviTheRipper;

public class UsableLetters {
    static char[] getUppercaseLetters() {
        char anUppercaseLetter = 'A';
        int unicodeUpperLetter = (int) anUppercaseLetter;
        char[] usableLetters_U = new char[26];
        char upperLetter;
        for (int i = unicodeUpperLetter; i < (unicodeUpperLetter + 26); i++){
            upperLetter = (char) i;

            usableLetters_U[i - 'A'] = upperLetter;

        }
        return usableLetters_U;

    }


         /*   static char otherWay(){
//          Random newRnd = new Random();
//          newRnd.nextInt('z'-'a');

               return (char) Math.floor((Math.random() * 'z') + 'a');

            }*/




    static char[] getLowercaseLetters() {
        char aLowercaseLetter = 'a';
        int unicodeLowerLetter = (int) aLowercaseLetter;
        char[] usableLetters_L = new char[26];
        char lowerLetter;

        for (int i = unicodeLowerLetter; i < (unicodeLowerLetter + 26); i++){
            lowerLetter = (char) i;

            usableLetters_L[i-'a'] = lowerLetter;



        }


        return usableLetters_L;

    }

    static char[] usableLetters(char[] lowerLetters, char[] upperLetters){
        lowerLetters = getLowercaseLetters();
        upperLetters = getUppercaseLetters();
        char[] allLetters = new char[lowerLetters.length + upperLetters.length];
        for (int i = 0; i < lowerLetters.length; i++){
            allLetters[i] = lowerLetters[i];

        }
        int offset = 26 ;


        for (int i = 0; i < upperLetters.length; i++){
            allLetters[i + offset] = upperLetters[i];
        }


        return allLetters;
    }



}
