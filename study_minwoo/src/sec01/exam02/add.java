package sec01.exam02;

public class add {
    int add (int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }
    int getTenTotal() {
        int i;
        int total = 0;
        for (i = 1; i <= 10; i++) {
            total += i;
        }
        return total;
    }
}
