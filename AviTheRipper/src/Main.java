import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);



      static void useableNumbers() {
        int[] numArray = {};
        int number = -1;
        for (int i = number; i < 9; i++){
            number++;
            System.out.println(number);

        }


    }

    static void getUppercaseLetters() {
       char anUppercaseLetter = 'A';
       int unicodeUpperLetter = (int) anUppercaseLetter;
       ArrayList<Character> usableLetters_U = new ArrayList<Character>();
       char upperLetter;
       for (int i = unicodeUpperLetter; i < (unicodeUpperLetter + 26); i++){
           upperLetter = (char) i;



           usableLetters_U.add(upperLetter);

//           System.out.println("this is the letter: " + usableLetters_U);
       }
    }

        static void getLowercaseLetters() {
            char aLowercaseLetter = 'a';
            int unicodeLowerLetter = (int) aLowercaseLetter;
            ArrayList<Character> usableLetters_L = new ArrayList<Character>();
            char lowerLetter;
            for (int i = unicodeLowerLetter; i < (unicodeLowerLetter + 26); i++){
                lowerLetter = (char) i;

            usableLetters_L.add(lowerLetter);

//                System.out.println("this is the letter: " + usableLetters_L);
            }}

            static void usableLetters(){
            getUppercaseLetters();
            getLowercaseLetters();
            }
            static String genRandomLetter(){
                usableLetters();


            }


    public static void main(String[] args) {


        useableNumbers();
        getUppercaseLetters();
        getLowercaseLetters();

      }


     }





































/* static char[] uppercaseLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
   static char[] lowercaseLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   static char[] usableNumbers = {'0','1','2','3','4','5','6','7','8','9'};*/

