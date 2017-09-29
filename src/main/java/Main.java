import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Please enter a Roman Numeral between I and MMMMCMXCIX: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        //.toUpperCAse on the input since the switch statement for the converter is case sensitive*
        RomanNumerals.romanNumeralConverter(userInput.toUpperCase());

    }
}
