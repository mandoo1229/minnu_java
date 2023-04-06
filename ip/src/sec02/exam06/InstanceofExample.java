package sec02.exam06;

public class InstanceofExample {
    public static void method1(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child 변환 성공");
        } else {
            System.out.println("method1 - Child 변환 실패");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;
        System.out.println("method2 - child 변환 성공");
    }
    public static void main(String[] args) {
        Parent parent = new Child();
        method1(parent);
        method2(parent);

        Parent parent1 = new Parent();
        method1(parent1);
        method2(parent1);

    }
}
