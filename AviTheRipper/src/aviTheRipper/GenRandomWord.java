package aviTheRipper;




public class GenRandomWord extends GetRandomLetter {

    private int secretNumber = 0;




    String[] genRandomWord(int numOfLetters, int numOfWords) {
        String randomString;
        String[] arrayOfRandomStrings = new String[numOfWords];

        for (int i = 0; i < numOfWords; i++) {
            randomString = "";
            //genRandomLetter();
            for (int y = 0; y < numOfLetters; y++) {
                randomString += genRandomLetter();
            }
            arrayOfRandomStrings[i] = randomString;

        }
        return arrayOfRandomStrings;
    }
        void printOutArrayOfStrings(String[] arrayOfRandomStrings){

            for (int i = 0; i < arrayOfRandomStrings.length; i++){
                String tempString = "";
                tempString = arrayOfRandomStrings[i];
                System.out.println(tempString);



            }

            System.out.println();
        }



    }


