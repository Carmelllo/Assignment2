package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RomanPrinterTest {
//    static RomanPrinter printer;
//
//    @BeforeClass
//    public static void initializePrinter() {
//        printer = new RomanPrinter();
//    }

    @Rule
    //Performance Test
    public Timeout globalTimeout = Timeout.seconds(30);

    @Test
    public void testRomanD()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 500;
        String expected =
                " _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanC()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 100;
        String expected =
                "  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanL()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 50;
        String expected =
                " _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanX()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 10;
        String expected =
                "__   __\n"+
                "\\ \\ / /\n"+
                " \\ V / \n"+
                "  > <  \n"+
                " / . \\ \n"+
                "/_/ \\_\\\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanV()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 5;
        String expected =
                "__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanI()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 1;
        String expected =
                " _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testAsciiCombination118()
            throws NumberBelowZeroException, NumberOverOneThousand, InvalidLetterException {
        int n = 118;
        String expected =
                "  _____ " + "__   __" + "__      __" + " _____ " + " _____ " + " _____ \n" +
                " / ____|" + "\\ \\ / /" + "\\ \\    / /" + "|_   _|" + "|_   _|" + "|_   _|\n" +
                "| |     " + " \\ V / " + " \\ \\  / / " + "  | |  " + "  | |  " + "  | |  \n" +
                "| |     " +  "  > < " + "   \\ \\/ /  " +   "  | |  " +  "  | |  " +  "  | |  \n" +
                "| |____ " +  " / . \\ " + "   \\  /   " + " _| |_ " + " _| |_ " + " _| |_ \n" +
                " \\_____|" + "/_/ \\_\\ " + "   \\/    " + "|_____|" + "|_____|" + "|_____|\n";

        String ascii_art_118 = RomanPrinter.print(n);

        assertEquals(expected, ascii_art_118);
    }

    @Test
    public void testAsciiCombination599()
            throws NumberBelowZeroException, NumberOverOneThousand, InvalidLetterException {
        int n = 599;
        String expected =
     " _____ " + " __   __" +   "  _____ " +  " _____ " + "__   __\n" +
            "|  __ \\ " + "\\ \\ / /" +" / ____|" +  "|_   _|" + "\\ \\ / /\n" +
            "| |  | |"+ " \\ V / " +  "| |     "  +  "  | |  " + " \\ V / \n" +
            "| |  | |" + "  > <  " +   "| |     " +   "  | |  " + "  > <  \n" +
            "| |__| |" + " / . \\ " +  "| |____ " +  " _| |_ " + " / . \\ \n" +
            "|_____/ " + "/_/ \\_\\" + " \\_____|" + "|_____|" + "/_/ \\_\\\n" ;

        String ascii_art_599 = RomanPrinter.print(n);

        assertEquals(expected, ascii_art_599);
    }

    @Test
    public void testAsciiCombination22()
            throws NumberBelowZeroException, NumberOverOneThousand, InvalidLetterException {
        int n = 22;
        String expected =
                "__   __" + "__   __" + " _____ " + " _____ \n" +
                "\\ \\ / /" + "\\ \\ / /" + "|_   _|" + "|_   _|\n" +
                " \\ V / " + " \\ V / " + "  | |  " + "  | |  \n" +
                "  > <  " + "  > <  " + "  | |  " + "  | |  \n" +
                " / . \\ " + " / . \\ " + " _| |_ " + " _| |_ \n" +
                "/_/ \\_\\" + "/_/ \\_\\" + "|_____|" + "|_____|\n";


        String ascii_art_22 = RomanPrinter.print(n);

        assertEquals(expected, ascii_art_22);
    }


    @Test
    public void testAsciiCombination75()
            throws NumberBelowZeroException, NumberOverOneThousand, InvalidLetterException {
        int n = 75;
        String expected =
                " _      " + "__   __" + "__   __" + "__      __\n" +
                "| |     " + "\\ \\ / /" + "\\ \\ / /" + "\\ \\    / /\n" +
                "| |     " + " \\ V / " + " \\ V / " + " \\ \\  / / \n" +
                "| |     " + "  > <  " + "  > <  " + "  \\ \\/ /  \n" +
                "| |____ " + " / . \\ " + " / . \\ " + "   \\  /   \n" +
                "|______|" + "/_/ \\_\\" + "/_/ \\_\\" + "    \\/    \n";


        String ascii_art_75 = RomanPrinter.print(n);

        assertEquals(expected, ascii_art_75);
    }
    @Test
    public void testAsciiArtZero()
            throws NumberBelowZeroException, NumberOverOneThousand, InvalidLetterException {
        int n = 0;
        String expected ="";


        String ascii_art_zero = RomanPrinter.print(n);

        assertEquals(expected, ascii_art_zero);
    }

    @Test(expected = InvalidLetterException.class)
    public void testNumberAbove4999() throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException {
        String stringa_fallita ="M";

        RomanPrinter.print(stringa_fallita);
    }



}
