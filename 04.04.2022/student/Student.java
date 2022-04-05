package student;
import biodata.*;

public class Student implements Schooling, College {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public String getName() {
        return this.name;
    }
}
