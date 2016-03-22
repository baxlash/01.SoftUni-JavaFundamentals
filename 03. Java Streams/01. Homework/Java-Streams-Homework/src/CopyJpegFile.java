import java.io.*;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class CopyJpegFile {
    private static final String FILE_PATH = "resources/pic.jpg";
    private static final String SAVE_FILE = "resources/my-copied-pic.jpg";

    public static void main(String[] args) {
        File input = new File(FILE_PATH);
        File output = new File(SAVE_FILE);
        try(FileInputStream fis = new FileInputStream(input); FileOutputStream fos = new FileOutputStream(output)){
            byte[] buffer = new byte[4];
            int reader = fis.read(buffer);
            while (reader !=-1){
                fos.write(buffer);
                reader=fis.read(buffer);
            }
        }catch (IOException ioex){
            System.out.println("GOTCHA!");
        }
    }
}
