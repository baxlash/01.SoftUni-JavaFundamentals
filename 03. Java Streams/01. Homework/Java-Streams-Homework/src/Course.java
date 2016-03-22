import java.io.Serializable;

/**
 * Created by Baxlash on 22.3.2016 г..
 */
public class Course implements Serializable{
    private String name;
    private int numberOfStudents;

    Course(String name, int numberOfStudents){
        this.name = name;
        this.numberOfStudents=numberOfStudents;
    }

    String getName(){
        return this.name;
    }

    int getNumberOfStudents(){
        return this.numberOfStudents;
    }
}
