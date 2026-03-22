import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Practical7_1 {
    public static void main(String[] args) {
        
        
        String filePath = "C:\\Users\\Revat\\OneDrive\\Desktop\\Java";

        try {
            // Create FileReader and BufferedReader
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("File Content:");

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
