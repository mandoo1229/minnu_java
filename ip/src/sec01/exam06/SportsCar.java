package sec01.exam06;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    //final method는 overriding을 할 수 없다.
    //    @Override
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
