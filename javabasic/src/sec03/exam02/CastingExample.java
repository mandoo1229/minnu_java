package sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue; //자동 형변환 되지 않고 에러 발생되기 때문에 강제 형변환을 해줌
        System.out.println("charValue = " + charValue);
        
        long longValue = 500;
        intValue = (int) longValue;
        System.out.println("intValue = " + intValue);
        
        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println("doubleValue = " + doubleValue);
    }
}
