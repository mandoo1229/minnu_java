package sec02.exam04;

public class ForMultipleTableExample {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.printf("**** %2d ***\n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%2d * %2d = %2d\n", i, j, (i*j));
            }

        }
    }
}
