import java.io.*;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class AllCapitals {
    private static final String FILE_PATH = "resources/input.txt";
    private static final String SAVE_FILE = "resources/output.txt";
    public static void main(String[] args) {
        File input = new File(FILE_PATH);
        File output = new File(SAVE_FILE);
        try (BufferedReader bfr = new BufferedReader(new FileReader(input)); PrintWriter pw = new PrintWriter(new FileWriter(output));){
            String line = bfr.readLine();
            while (line!=null){
                line = line.toUpperCase();
                pw.println(line);
                line = bfr.readLine();
            }
        } catch (IOException ioex) {
            System.out.println("GOTCHA!");
        }
    }




}
