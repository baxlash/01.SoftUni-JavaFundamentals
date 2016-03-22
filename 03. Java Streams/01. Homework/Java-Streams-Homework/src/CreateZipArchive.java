import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class CreateZipArchive {
    private static String DIRECTORY = "resources/";
    private static String ZIP_FILE = "text-files.zip";
    private static String[] TEXT_FILES = new String[]{"input.txt", "output.txt", "count-chars.txt"};

    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[512];
            FileOutputStream zipFile = new FileOutputStream(DIRECTORY + ZIP_FILE);
            ZipOutputStream zos = new ZipOutputStream(zipFile);
            for (int i = 0; i < TEXT_FILES.length; i++) {
                File file = new File(DIRECTORY + TEXT_FILES[i]);
                System.out.println("Adding file: " + file.getName());
                FileInputStream fis = new FileInputStream(file);

                zos.putNextEntry(new ZipEntry(file.getName()));
                int length = 0;

                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
                zos.closeEntry();
                fis.close();
            }
            zos.close();


        } catch (IOException ioex) {
            ioex.printStackTrace();
        }

    }
}
