import java.io.*;
import java.util.List;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class SaveObjectToFile {
    private static String FILE_PATH = "resources/course.save";

    public static void main(String[] args) {
        Course course = new Course("Java Foundamentals", 200);
        writeCourseToFile(course);

        Course readCourse = readCourseFromFile();
        System.out.println("Course Name: " + readCourse.getName());
        System.out.println("Course Participants: " + readCourse.getNumberOfStudents());
    }

    static void writeCourseToFile(Course course) {
        File file = new File(FILE_PATH);

        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            oos.writeObject(course);
        } catch (IOException ioex) {
            System.out.println("GOTCHA!");
        }
    }

    static Course readCourseFromFile() {
        File file = new File(FILE_PATH);
        Course result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            result = (Course) ois.readObject();
        } catch (IOException ioex) {
            System.out.println("GOTCHA!");
        } catch (ClassNotFoundException cnf) {
            System.out.println("GOTCHA!");
        }
        return result;
    }
}
