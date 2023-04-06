package sec01.exam01;

public class SignOperaterExample {
    public static void main(String[] args) {
        int x = 100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1 = +" +result1);
        System.out.println("result2 = " + result2);

        byte b = 100;
//        byte result3 = -b; //- b 에 대한 결과가 int로 도출되기 때문에 byte타입의 변수에 할당이 불가
        int result3 = -3;
        System.out.println("result3 = " + result3);
    }
}
