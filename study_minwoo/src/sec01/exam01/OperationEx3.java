package sec01.exam01;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);


        int num = 5;
        int t = 10;

        boolean value1 = ((num = num * 10)> 45) || ((i = i -5) < 10);
        System.out.println(value1);
        System.out.println(num);
        System.out.println(t);
    }
}
