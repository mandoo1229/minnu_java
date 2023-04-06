package sec03.exam05;

public class OperrationsPromotionExample {
    public static void main(String[] args) {
        byte byteValue1 =10;
        byte byteValue2 =20;
//        byte bytevalue3 = byteValue1 + byteValue2  // 산술연산의 결과가 int형으로 변환되어서 byte타입의 변수에 담을 수 없었다. 
        int intValue1 = byteValue1 + byteValue2;
        System.out.println("intValue1 = " + intValue1);

        char charValue1 = 'A'; // 작은 따옴표는 char형의 리터럴 값이다.
        char charValue2 = 1;
//        char charValue3 = charValue1 + charValue2;  //산술연산의 결과가 int형으로 반환되어서 char타입의 변수에 담을 수 없었다.
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 = " + intValue2);
        System.out.println("출력문자 = " + (char)charValue2);
        
        int intValue3 = 10;
        int intValue4 = intValue3 / 4; //python 이었다면 float형으로 반환. java에서는 int형으로 결과가 반환된다. 
        System.out.println("intValue4 = " + intValue4);
        
        int intValue5 = 10;
//        int intValue6 = intValue5 / 4.0; // int 리터럴과 double 리터럴을 산술 연산하면 그 반환값이 double이 된다. 
                                           //범위가 더 큰 방향으로 타입이 통일된다. 
        double doubleValue = intValue5 / 4.0;
        System.out.println("doubleValue = " + doubleValue);
        
        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println("result = " + result);

    }
}
