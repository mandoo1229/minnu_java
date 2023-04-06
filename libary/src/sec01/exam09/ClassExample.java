package sec01.exam09;

public class ClassExample {
    public static void main(String[] args) throws Exception{
        //첫번째 방법
        Class clazz1 = Car.class;

        //두번째 방법
        Class clazz2 = Class.forName("sec01.exam09.Car");

        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println(clazz1.getName()); //sec01.exam09.Car
        System.out.println(clazz2.getSimpleName()); //Car
        System.out.println(clazz3.getPackage().getName()); //sec01.exam09
    }
}
