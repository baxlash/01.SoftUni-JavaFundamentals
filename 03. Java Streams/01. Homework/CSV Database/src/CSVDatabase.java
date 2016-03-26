import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.*;

public class CSVDatabase {
    private static final String STUDENTS_FILE = "resources/students.txt";
    private static final String GRADES_FILE = "resources/grades.txt";

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        //Scanner console = new Scanner(System.in);
        //String input = "Georgi Mamarchev 19 Sofia";
       // insertStudent("Georgi Mamarchev 19 Sofia");
       // insertStudent("Petar Petrov 23 Montana");
       // insertStudent("Ivan Ivanov 22 Plevem");
       // insertStudent("Iliyan Stoev 18 Shumen");
       // insertStudent("Ivaylo Tonev 25 Plovdiv");
       // insertStudent("Anton Dimov 24 Slivan");
       // insertStudent("Evgeni Ivanov 22 Samokov");
       // insertStudent("Maria Petrova 26 Sofia");
       // insertStudent("Kremena Koleva 19 Petrich");
       //  insertGradeById(1, "Math", 5.38);
       //  insertGradeById(2, "Math", 3.15);
       //  insertGradeById(8, "Literature", 5.40);
       //  insertGradeById(4, "Math", 4.44);
       //  insertGradeById(2, "Math", 5.18);
       //  insertGradeById(1, "Geography", 5.53);
       //  insertGradeById(5, "Chemistry", 3.11);
       //  insertGradeById(2, "Chemistry", 3.7);
       //  insertGradeById(6, "Literature", 4.44);
       //  insertGradeById(4, "Literature", 6d);
       //  insertGradeById(1, "Math", 4.89);
       //  insertGradeById(3, "Literature", 2.14);
       //  insertGradeById(3, "Math", 3.67);
       //  insertGradeById(2, "Geography", 5.0);

       // deleteStudent(5);

    }

    private static void insertStudent(String student) {
        int id = 0;
        String[] splittedLine = student.split(" ");
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bfr = new BufferedReader(new FileReader(new File(STUDENTS_FILE)));
             PrintWriter pw = new PrintWriter(new FileWriter(new File(STUDENTS_FILE), true))) {
            String line = bfr.readLine();
            if (line == null) {
                id = 1;
                sb.append(id);
                sb.append(',');
                for (int i = 0; i < splittedLine.length; i++) {
                    sb.append(splittedLine[i]);
                    if (i < splittedLine.length - 1) {
                        sb.append(',');
                    }
                }
                pw.println(sb);
            } else {
                TreeMap<Integer, List<String>> existingEntries = new TreeMap<>();
                while (line != null) {
                    splittedLine = line.split(",");
                    id = Integer.parseInt(splittedLine[0]);
                    List<String> personalData = new ArrayList<>();
                    for (int i = 1; i < splittedLine.length; i++) {
                        personalData.add(splittedLine[i]);
                        System.out.println(personalData);
                    }
                    existingEntries.put(id, personalData);
                    line = bfr.readLine();
                }
                id = existingEntries.lastKey() + 1;
                sb.append(id);
                sb.append(',');
                String[] studentSplitted = student.split(" ");
                for (int i = 0; i < studentSplitted.length; i++) {
                    sb.append(studentSplitted[i]);
                    if (i < studentSplitted.length - 1) {
                        sb.append(',');
                    }
                }
                pw.println(sb);
            }
        } catch (IOException ioex) {
            ioex.getCause();
            System.out.println("CRASHED!");
        }
    }

    static void insertGradeById(int id, String course, double grade) {
        HashMap<Integer, HashMap<String, List<Double>>> existingEntries = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        try (BufferedReader bfrStudent = new BufferedReader(new FileReader(new File(STUDENTS_FILE)));
             BufferedReader bfr = new BufferedReader(new FileReader(new File(GRADES_FILE)))) {
            String line = bfr.readLine();

            while (line != null) {
                String[] entries = line.split(",");
                int studentId = Integer.parseInt(entries[0]);
                HashMap<String, List<Double>> courses = new HashMap<>();
                for (int i = 1; i < entries.length; i++) {
                    String[] courseGrades = entries[i].split(" ");
                    String courseId = courseGrades[0];
                    List<Double> grades = new ArrayList<>();
                    for (int j = 1; j < courseGrades.length; j++) {
                        grades.add(Double.parseDouble(courseGrades[j]));
                    }
                    courses.put(courseId, grades);
                }
                existingEntries.put(studentId, courses);
                line = bfr.readLine();
            }
            line = bfrStudent.readLine();
            List<Integer> existingStudentIds = new ArrayList<>();
            while (line != null) {
                existingStudentIds.add(Integer.parseInt(line.split(",")[0]));
                line = bfrStudent.readLine();
            }

            if (!existingStudentIds.contains(id)) {
                System.out.println("This student does not exist in the database.");
                return;
            } else {
                List<Double> grades = new ArrayList<>();
                if (existingEntries.containsKey(id)) {
                    if (existingEntries.get(id).containsKey(course)) {
                        grades = existingEntries.get(id).get(course);
                        grades.add(grade);
                        existingEntries.get(id).put(course, grades);
                    } else {
                        grades.add(grade);
                        existingEntries.get(id).put(course, grades);
                    }
                } else {
                    grades.add(grade);
                    HashMap<String, List<Double>> newEntry = new HashMap<>();
                    newEntry.put(course, grades);
                    existingEntries.put(id, newEntry);
                }

            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        try (PrintWriter pw = new PrintWriter(new FileWriter(new File(GRADES_FILE)))) {
            for (Integer studentId : existingEntries.keySet()) {
                sb.append(studentId);
                sb.append(',');
                Set<String> courseNames = existingEntries.get(studentId).keySet();
                for (String courseName : courseNames) {
                    sb.append(courseName);
                    sb.append(" ");

                    for (int i = 0; i < existingEntries.get(studentId).get(courseName).size(); i++) {
                        sb.append(existingEntries.get(studentId).get(courseName).get(i));
                        if (i < existingEntries.get(studentId).get(courseName).size() - 1) {
                            sb.append(" ");
                        } else {
                            sb.append(',');
                        }
                    }
                }
                sb.append("\n");
            }
            pw.print(sb);
        } catch (IOException ioex) {
            ioex.getCause();
            ioex.printStackTrace();
        }

    }

    static void deleteStudent(int id) {
        StringBuilder student = new StringBuilder();
        StringBuilder courses = new StringBuilder();
        try (BufferedReader bfrStudent = new BufferedReader(new FileReader(new File(STUDENTS_FILE)));
             BufferedReader bfrGrades = new BufferedReader(new FileReader(new File(GRADES_FILE)))) {
            String lineStudent = bfrStudent.readLine();
            String lineGrades = bfrGrades.readLine();

            while (lineStudent != null) {
                //HashMap<String, List<Double>> existingGrades = new HashMap<>();
                if (id != Integer.parseInt(lineStudent.split(",")[0])) {
                    student.append(lineStudent);
                    student.append("\r\n");
                }
                lineStudent = bfrStudent.readLine();
            }
            while (lineGrades != null) {
                if (id != Integer.parseInt(lineGrades.split(",")[0])) {
                    courses.append(lineGrades);
                    courses.append("\r\n");
                }
                lineGrades = bfrGrades.readLine();
            }
        } catch (
                IOException ioex
                )

        {
            ioex.printStackTrace();
        }

        try (PrintWriter pwStudent = new PrintWriter(new FileWriter(new File(STUDENTS_FILE)));
             PrintWriter pwGrades = new PrintWriter(new FileWriter(new File(GRADES_FILE)))) {
            pwStudent.println(student);
            pwGrades.println(courses);
        } catch (IOException ioex) {
            ioex.getCause();
        }
    }

    static void updateStudent(int id) {

    }

    static String searchByName(String name) {
        String[] nameSplitted = name.split(" ");
        HashMap<String,String> student = new HashMap<>();
        try(BufferedReader bfr = new BufferedReader(new FileReader(STUDENTS_FILE))){
            String line = bfr.readLine();
            while(line!=null){
                student.put("id",line.split(",")[0]);
                student.put("firstName",line.split(",")[1]);
                student.put("lastName",line.split(",")[2]);
                student.put("age",line.split(",")[3]);
                student.put("city",line.split(",")[4]);
                String studentName = line.split(",")[1]+" "+line.split(",")[2];
                if(studentName==nameSplitted[1]+" "+nameSplitted[2]){
                    break;
                }else {
                    line=bfr.readLine();
                }
            }
        } catch (IOException ioex){
            System.out.println(ioex.getCause());
        }
        return "";
    }

    static String searchById(int id) {
        return "";
    }
}
