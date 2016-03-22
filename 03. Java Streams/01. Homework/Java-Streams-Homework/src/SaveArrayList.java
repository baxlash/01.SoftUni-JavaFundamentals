import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class SaveArrayList {
    private static final String FILE_PATH = "resources/double.list";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(3.14159);
        doubleList.add(8.432);
        doubleList.add(43.5232);

        writeListToFile(doubleList);
        System.out.println(readListFromFile());

    }

    static void writeListToFile(List list){
        File file = new File(FILE_PATH);

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            oos.writeObject(list);
        } catch (IOException ioex) {
            System.out.println("GOTCHA!");
        }
    }
    static List readListFromFile(){
        File file = new File(FILE_PATH);
        List result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            result = (List) ois.readObject();
        } catch (IOException ioex) {
            System.out.println("GOTCHA!");
        }catch (ClassNotFoundException cnf){
            System.out.println("GOTCHA!");
        }
        return result;
    }
}
