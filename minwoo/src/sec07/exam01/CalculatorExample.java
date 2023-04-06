package sec07.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn(); //전원을 켭니다.

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 = " + result1); //result1 = 11

        byte x = 120;
        byte y = 10;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2); //result2 = 2.5

        myCalc.powerOff();
    }
}
