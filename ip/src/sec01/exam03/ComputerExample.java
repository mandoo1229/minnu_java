package sec01.exam03;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator Calculator = new Calculator();
        System.out.println("calculator.areaCircle(r) = " + Calculator.areaCircle(r));
        System.out.println();
        Computer computer = new Computer();
        System.out.println("computer.areaCircle(r) = " + computer.areaCircle(r));
    }
}

