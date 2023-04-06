package sec02.exam07;

public class FloataDoubleExample {
    public static void main(String[] args) {
        //float var1 = 3.14; //실수 리터럴은 기본적으로 double이다 double 리터럴 값을float 변수에 담을 수없다.
        float var2 = 3.14f;
        double var3 = 3.14;
        
        float var4 = 0.123456789123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var1 = " + var2);
        System.out.println("var2 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
        
        double var6 = 3e6;
        float var7 = 3e6f;
        double var8 = 2e-3;
        System.out.println("var6 = " + var6);
        System.out.println("var7 = " + var7);
        System.out.println("var8 = " + var8);
    }
}
