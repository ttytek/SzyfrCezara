import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args){
        Encrypter encrypter = new Encrypter(1);
        String xd = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(encrypter.encrypt(xd));
        System.out.println(encrypter.decrypt(xd));
    }
}
