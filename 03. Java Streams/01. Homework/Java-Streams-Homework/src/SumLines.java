import java.io.*;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class SumLines {
    private static final String FILE_PATH = "resources/input.txt";
    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        try (BufferedReader bfr = new BufferedReader(new FileReader(file))){
            String line = bfr.readLine();
            while (line!=null){
                int output = 0;
                for (int i = 0; i < line.length(); i++) {
                    output += line.charAt(i);
                }
                System.out.println(output);
                line = bfr.readLine();
            }
        } catch (IOException ioex) {
            System.out.println("GOTCHA!");
        }
    }
}
