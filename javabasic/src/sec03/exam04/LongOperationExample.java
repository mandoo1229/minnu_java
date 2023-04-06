package sec03.exam04;

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        //int result = value1 + value2 + value3;  //산술 연산의 결곽 long 타입이라서 int형 변수에 담을 수 없다.
        long result = value1 + value2 + value3;
        System.out.println("result = " + result);

    }
}
