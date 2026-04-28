class Student {
    private String name;
    private int rollNo;
    private float marks;

    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public float getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Gautam");
        s.setRollNo(101);
        s.setMarks(89.5f);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }
}