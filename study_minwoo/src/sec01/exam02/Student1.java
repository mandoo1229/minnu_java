package sec01.exam02;

public class Student1 {
    int studentID;
    String studentName;
    int grade;
    String address;
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        Student studentAhn = new Student();
        studentAhn.studentName = "남민우";

        System.out.println(studentAhn.StudentName);
//        System.out.println(studentAhn.getStudentName());
    }
}
