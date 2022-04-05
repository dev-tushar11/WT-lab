class StudentInfo {
    String name_119;
    String address_119;
    String branch_119;
    String department_119;

    StudentInfo(String name, String address, String branch, String department) {
        name_119 = name;
        address_119 = address;
        branch_119 = branch;
        department_119 = department;
    }

    void display() {
        System.out.println("name: " + name_119);
        System.out.println("address: " + address_119);
        System.out.println("branch: " + branch_119);
        System.out.println("department: " + department_119);
    }
}

class StudentRegular extends StudentInfo {
    StudentRegular(String name, String address, String branch, String department) {
        super(name, address, branch, department);
    }

    void display() {
        super.display();
    }
}

class StudentETC extends StudentInfo {
    float marks_119;
    float attendance_119;

    StudentETC(String name, String address, String branch, String department, float marks, float attendance) {
        super(name, address, branch, department);

        marks_119 = marks;
        attendance_119 = attendance;
    }

    void display() {
        super.display();
        System.out.println("marks: " + marks_119);
        System.out.println("attendance: " + attendance_119);
    }
}

class q1 {
    public static void main(String[] args) {
        StudentETC s1 = new StudentETC("Tushar", "Katwa", "CSCE", "CSCE3", 9.61f, 99.7f);

        s1.display();
    }
}