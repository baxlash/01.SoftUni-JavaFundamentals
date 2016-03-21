import java.io.*;

/**
 * Created by Baxlash on 21-Mar-16.
 */
public class Streams {
    private static final String FILE_PATH = "users.txt";
    private static final String SAVE_PATH = "total-time.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        File outputFile = new File(SAVE_PATH);
        try (BufferedReader bfr = new BufferedReader(new FileReader(file)); PrintWriter pw = new PrintWriter(new FileWriter(outputFile, true),true);) {
                String line= bfr.readLine();
            while (line != null) {
                String[] lineArgs = line.split(" ");
                String name = lineArgs[0];
                int totalTime = 0;
                for (int i = 1; i < lineArgs.length; i++) {
                    String[] loggedTime = lineArgs[i].split(":");
                    int hours = Integer.parseInt(loggedTime[0]);
                    int minutes = Integer.parseInt(loggedTime[1]);
                    totalTime += (hours * 60) + minutes;
                }

                String output = name + " (" + timeConvert(totalTime) + ")";
                pw.println(output);

                line  = bfr.readLine();

            }
        } catch (IOException ioex) {
            System.out.println("Error!");
        }
    }

    public static String timeConvert(int time) {
        return time / 24 / 60 + " days, " + time / 60 % 24 + " hours, " + time % 60 + " minutes";
    }
}
