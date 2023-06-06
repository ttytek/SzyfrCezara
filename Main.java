import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args){
        MorseCode morseCode = new MorseCode();
        System.out.println(morseCode.encode("kacper"));
        System.out.println(morseCode.decode("-.- .- -.-. .--. . .-. "));

        System.out.println(morseCode.encode("a 1 b 2"));
        System.out.println(morseCode.decode(".-  / .----  / -...  / ..--- "));
    }
}
