package sec03.exam01;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {84,90,99};
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("종합 = " + sum1);

        int sum2 = add(new int[] {84, 89, 98});
        System.out.println("종합 = " + sum2);
        System.out.println();
    }

    public static int add(int[] scores) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        return sum;
    }
}
