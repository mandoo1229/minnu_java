package sec02.exam03;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 10000000000; //컴파일 에러
        long var4 = 10000000000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
        // long type을 사용할 때는 숫자 뒤에 L을 붙여 주면 된다!
    }
}
