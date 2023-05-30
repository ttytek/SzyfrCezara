import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    //cool file reader
    String readLine(String fileName){
        File file = new File(fileName);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "error";
        }

        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            scanner.close();
            return line;
        }
        scanner.close();
        return "error";
    }
}
