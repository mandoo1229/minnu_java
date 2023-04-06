package sec03.exam07;

public class PrimitiveStringConversionExmaple {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf( true);

        short s1 = 1;
        short s2 = 2;
        int i1 =3;
        int i2 = 4;
        int result = i1 + i2;

        char c1 = 'a';
        char c2 = (char)(c1 + 1);
        System.out.println(c2);


    }
}
