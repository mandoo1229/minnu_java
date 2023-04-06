package sec02.exam01;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

//        parent.method2();
        child.method3();

        //호출 불가능하다.
        //parent 참조변수는 parent 클래스의 멤버에 대해서만 접근 가능하다.
        //parent.method3();
    }
}
