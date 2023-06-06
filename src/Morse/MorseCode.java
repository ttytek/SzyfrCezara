package src.Morse;
public class MorseCode {
    private String[] numbers =
            {
                    "-----",    //0
                    ".----",     //1
                    "..---",    //2
                    "...--",    //3
                    "....-",    //4
                    ".....",    //5
                    "-....",    //6
                    "--...",    //7
                    "---..",    //8
                    "----."     //9
            };
    private String[] letters =
            {
                    ".-",       //a
                    "-...",     //b
                    "-.-.",     //c
                    "-..",      //d
                    ".",        //e
                    "..-.",     //f
                    "--.",      //g
                    "....",     //h
                    "..",       //i
                    ".---",     //j
                    "-.-",      //k
                    ".-..",     //l
                    "--",       //m
                    "-.",       //n
                    "---",      //o
                    ".--.",     //p
                    "--.-",     //q
                    ".-.",      //r
                    "...",      //s
                    "-",        //t
                    "..-",      //u
                    "...-",     //v
                    ".--",      //w
                    "-..-",     //x
                    "-.--",     //y
                    "--..",     //z
            };
    public String encode(String message){
        String encodedMessage = new String();
        for(char letter : message.toCharArray()){
            if((int)letter <=122 && (int) letter >= 97){    //mala litera
                letter -= 97;
                encodedMessage += letters[letter];
                encodedMessage += " ";
                continue;
            }
            if((int)letter <= 90 && (int)letter >= 65){     //wielka litera
                letter -= 65;
                encodedMessage += letters[letter];
                encodedMessage += " ";
                continue;
            }
            if((int)letter <= 57 && (int)letter >= 48){
                letter -= 48;
                encodedMessage += numbers[letter];
                encodedMessage += " ";
                continue;
            }
            if(letter == ' ' || letter == '\n'){
                encodedMessage += " / ";
            }
        }
        return encodedMessage;
    }

    public String decode(String message){
        String decodedMessage = new String();
        String currentCharacter = new String();
        for(char letter : message.toCharArray()){
            if(letter == ' '){
                if(currentCharacter.equals("/")){
                    decodedMessage += ' ';
                }
                for(int i = 0; i < letters.length; i++){
                    if(currentCharacter.equals(letters[i])){
                        decodedMessage += (char)(65+i);
                    }
                }
                for(int i = 0; i < numbers.length; i++){
                    if(currentCharacter.equals(numbers[i])){
                        decodedMessage += (char)(48+i);
                    }
                }
                currentCharacter = "";
            }
            else{
                currentCharacter += letter;
            }
        }
        return decodedMessage;
    }
}
