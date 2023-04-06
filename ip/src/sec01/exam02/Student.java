package sec01.exam02;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        //부모 클래스의 생성자를 호출
        // super는 맨 위에 작성합니다.
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
