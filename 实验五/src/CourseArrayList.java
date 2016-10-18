import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ray on 2016/10/18.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 5
 */
public class CourseArrayList {
    private String courseName;
    private ArrayList<String> students;

    public CourseArrayList(String courseName){
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void addStudent(String student){
        students.add(student);
    }

    public void dropStudent(String student){
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()){
            String studentName = iterator.next();
            if(studentName.equals(student)){
                iterator.remove();
            }
        }
    }

    public int getStudentCount() {
        return students.size();
    }

}
