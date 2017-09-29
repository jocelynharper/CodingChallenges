import java.util.Scanner;

public class RomanNumerals {

    /*I decided to use a switch statement because it would be the easiest for the sake of unit testing. The cases are in descending
    order since that is how Roman Numerals are input -- from highest value to lowest. In the instance that the user inputs
    a value that is not a case in the switch, it will return 0.
    */

    public static int romanNumerals(char individualLetterOfString) {
        switch (individualLetterOfString) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public static int romanNumeralConverter(String userInput) {

        int convertedOutput = 0;

        for (int i = 0; i < userInput.length() - 1; i++) {

            //If the current char in the String is less than the char directly after it, remove the numeric value for that char from the variable
            if (romanNumerals(userInput.charAt(i)) < romanNumerals(userInput.charAt(i + 1))) {
                convertedOutput -= romanNumerals(userInput.charAt(i));

                //Otherwise, it adds the numeric value to the variable
            } else {
                convertedOutput += romanNumerals(userInput.charAt(i));
            }
        }
        //This appends up through the end of the user input String
        convertedOutput += romanNumerals(userInput.charAt(userInput.length() - 1));

        //If an invalid user input is found, it will print this error message and prompt the user to put in another Roman Numeral
        if(convertedOutput == 0){

            System.out.println("Your Roman Numeral does not fit within the guidelines. Please re-enter.");
        }

        System.out.println(convertedOutput);
        System.out.println("Press 'Run' to convert another Roman Numeral!");
        return convertedOutput;
    }

}
