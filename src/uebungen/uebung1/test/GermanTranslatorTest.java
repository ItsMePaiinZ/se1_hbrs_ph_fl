package uebungen.uebung1.test;

import org.junit.jupiter.api.*;
import uebungen.uebung1.control.GermanTranslator;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    GermanTranslator gTrans = new GermanTranslator();
    String[] translations = {"eins", "zwei", "drei", "vier", "fuenf", "sechs", "sieben", "acht", "neun", "zehn"};

    // gAEK_1: [1,...,10]
    // uAEK_1: [MIN_INT,...,1[
    // uAEK_2: ]10,...,MAX_INT]
    // uAEK_3: NaN

    @Test
    void gAEK_1(){
        for(int i = 1; i <= 10; i++)
            assertEquals(translations[i-1], gTrans.translateNumber(i));
    }

    @Test
    void uAEK_1(){
        int uAEK_1_number = -25;
        assertEquals("Uebersetzung der Zahl " + uAEK_1_number + " nicht möglich (Version: " + gTrans.version +")", gTrans.translateNumber(uAEK_1_number));
        uAEK_1_number = 0; //Grenzwert
        assertEquals("Uebersetzung der Zahl " + uAEK_1_number + " nicht möglich (Version: " + gTrans.version +")", gTrans.translateNumber(uAEK_1_number));
    }

    @Test
    void uAEK_2(){
        int uAEK_2_number = 129;
        assertEquals("Uebersetzung der Zahl " + uAEK_2_number + " nicht möglich (Version: " + gTrans.version +")", gTrans.translateNumber(uAEK_2_number));
        uAEK_2_number = 11; // Grenzwert
        assertEquals("Uebersetzung der Zahl " + uAEK_2_number + " nicht möglich (Version: " + gTrans.version +")", gTrans.translateNumber(uAEK_2_number));
    }

    @Test
    void uAEK_3(){
        String uAEK_3_NaN = "abc";
        assertThrows(NumberFormatException.class, ()-> gTrans.translateNumber(Integer.parseInt(uAEK_3_NaN)));
    }

}