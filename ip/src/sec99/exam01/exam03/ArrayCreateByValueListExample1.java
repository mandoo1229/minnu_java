package sec99.exam01.exam03;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        int [] scores = {13,48,94};

        System.out.println("scores[0] : " + scores[0]);
        System.out.println("scores[1] : " + scores[1]);
        System.out.println("scores[2] : " + scores[2]);

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double)  sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
