import java.io.*;

public class Practical7_3 {
    public static void main(String[] args) {

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try {
            // Open file
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Count words
                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    wordCount += words.length;

                // Convert to lowercase for easy comparison
                line = line.toLowerCase();

                // Count vowels and 'a'
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    // Check vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }

                    // Count 'a'
                    if (ch == 'a') {
                        aCount++;
                    }
                }
            }

            br.close();

            // Display results
            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Number of times 'a' appears: " + aCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}