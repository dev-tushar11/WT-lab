class Student {
    int rollno;
    void putNumber(int i) {
        rollno = i;
    }
    int getNumber() {
        return rollno;
    }
}

class Test extends Student {
    double m1;
    double m2;
    void putMark(double i, double j) {
        m1 = i;
        m2 = j;
    }
    void getMark() {
        System.out.println("mark1: " + m1);
        System.out.println("mark2: " + m2);
    }
}

interface Sports {
    double weightage = 6.0;
    void putWeight();
}

class Result extends Test implements Sports {
    double total;
    public void putWeight() {
        System.out.println("weightage of sports: " + weightage);
    }
    void display() {
        System.out.println("Total marks: " + total);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.putNumber(2029119);
        r1.putMark(85, 93.5);
        r1.total = r1.m1 + r1.m2;
        System.out.println("Roll no.: " + r1.getNumber());
        r1.getMark();
        r1.putWeight();
        r1.display();
    }
}
