public class Encrypter {
    private int shift_value;
    public void setShift_value(int shift_value) {
        this.shift_value = shift_value;
    }
    public Encrypter(){
        shift_value = 3;
    }
    public Encrypter(int shift_value){
        this.shift_value = shift_value;
    }
    public String encrypt(String message){
        String encryptedMessage = new String();
        for(char letter : message.toCharArray()){
            if((int)letter <= 122 && (int)letter >= 97){    //mala litera
                letter -= 97;
                letter += shift_value;
                letter %= 26;
                letter += 97;
            }
            if((int)letter <= 90 && (int)letter >= 65){     //wielka litera
                letter -= 65;
                letter += shift_value;
                letter %= 26;
                letter += 65;
            }
            encryptedMessage += letter;
        }
        return encryptedMessage;
    }
    public String encrypt(String message, int shift_value){
        int old_shift_value = this.shift_value;
        this.shift_value = shift_value;
        String encryptedMessage = encrypt(message);
        this.shift_value = old_shift_value;
        return encryptedMessage;
    }
    public String decrypt(String message, int shift_value){
        int old_shift_value = this.shift_value;
        this.shift_value = shift_value;
        String decryptedMessage = decrypt(message);
        this.shift_value = old_shift_value;
        return decryptedMessage;
    }
    public String decrypt(String message){
        shift_value *= -1;
        shift_value += 26;
        String decryptedMessage = encrypt(message);
        shift_value -= 26;
        shift_value *= -1;
        return decryptedMessage;

    }
}
