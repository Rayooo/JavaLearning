/**
 * Created by Ray on 2016/10/18.
 * 陈枭磊
 * Java programing Autumn 2016
 * Lab 5
 */
public class Course {
    private String courseName;
    private String[] students;
    private int studentCount;

    public Course(String courseName){
        this.courseName = courseName;
        students = new String[1000];
        studentCount = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void addStudent(String student){
        students[studentCount] = student;
        studentCount++;
    }

    public boolean dropStudent(String student){
        boolean isDropped = false;
        int i = 0;
        for (i = 0;i < students.length;++i){
            if(students[i].equals(student)){
                students[i] = "";
                studentCount--;
                isDropped = true;
                break;
            }
        }
        for(;i < students.length - 1; ++i){
            students[i] = students[i+1];
        }

        return isDropped;
    }




}
