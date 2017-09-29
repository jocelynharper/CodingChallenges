import org.junit.*;

import static org.junit.Assert.assertEquals;


public class RomanNumeralsTest {

    @Test
    public void testNonRomanNumerals(){

        String testUserInput = "S";

        int expectedOutput = 0;
        int actualOutput = RomanNumerals.romanNumeralConverter(testUserInput);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRomanNumeralConverterMCMLXXXIII(){

        String testUserInput = "MCMLXXXIII";

        int expectedNumberConversion = 1983;
        int actualNumberConversion = RomanNumerals.romanNumeralConverter(testUserInput);
        assertEquals(expectedNumberConversion, actualNumberConversion);

    }

    @Test
    public void testRomanNumeralConverterCLIX(){

        String testUserInput = "CLIX";
        int expectedNumberConversion = 159;
        int actualNumberConversion = RomanNumerals.romanNumeralConverter(testUserInput);
        assertEquals(expectedNumberConversion, actualNumberConversion);
    }

    @Test
    public void testRomanNumeralConverterCDXCIV(){

        String testUserInput = "CDXCIV";
        int expectedNumberConversion = 494;
        int actualNumberConversion = RomanNumerals.romanNumeralConverter(testUserInput);
        assertEquals(expectedNumberConversion, actualNumberConversion);

    }


    @Test
    public void testSpecialCaseNine(){

        String testUserInput = "IX";

        int expectedNineOutput = 9;
        int actualNineOutput = RomanNumerals.romanNumeralConverter(testUserInput);
        assertEquals(expectedNineOutput, actualNineOutput);

    }

    @Test
    public void testSpecialCaseNineteen(){

        String testNinteteenInput = "IXX";

        int expectedZeroOutput = 19;
        int actualZeroOutPut = RomanNumerals.romanNumeralConverter(testNinteteenInput);
        assertEquals(expectedZeroOutput, actualZeroOutPut);

    }


}
