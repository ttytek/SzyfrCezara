package src.test.java;

import src.Morse.MorseCode;
import org.junit.Test;



class MorseTest{
    @Test
    public void testEncryption(){
        MorseCode morseCode = new MorseCode();
        assert(morseCode.encode("Test")=="- . ... -");
        assert(morseCode.decode("- . ... -")=="test");
    }
}