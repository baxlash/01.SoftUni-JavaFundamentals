import java.io.*;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class CountCharacterTypes {
    private static final String FILE_PATH = "resources/words.txt";
    private static final String SAVE_PATH = "resources/count-chars.txt";

    public static void main(String[] args) {
        File input = new File(FILE_PATH);
        File output = new File(SAVE_PATH);
        try (BufferedReader bfr = new BufferedReader(new FileReader(input)); PrintWriter pw = new PrintWriter(new FileWriter(output));) {
            String line = bfr.readLine();
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    switch (line.charAt(i)) {
                        case 'a':
                            vowels++;
                            break;
                        case 'e':
                            vowels++;
                            break;
                        case 'i':
                            vowels++;
                            break;
                        case 'o':
                            vowels++;
                            break;
                        case 'u':
                            vowels++;
                            break;
                        case '!':
                            punctuation++;
                            break;
                        case ',':
                            punctuation++;
                            break;
                        case '.':
                            punctuation++;
                            break;
                        case '?':
                            punctuation++;
                            break;
                        case ' ':
                            break;
                        default:
                            consonants++;
                            break;
                    }
                }
                line = bfr.readLine();
            }
            pw.println("Vowels: " + vowels);
            pw.println("Consonants: " + consonants);
            pw.println("Punctuation: " + punctuation);
        } catch (IOException ioex) {
            ioex.getMessage();
        }
    }
}
