package sec01.exam01;

public class ArraCrate {
    public static void main(String[] args) {
        int [] scores = {83, 90, 87};

        //배열 변수 초기화 동시에 값을 넣을 때만 중괄호를 사용해서 값을 초기화 할 수 있다.
        // int[] scores;
        // scores = {83, 90, 87}

        System.out.println("scores[0]" + scores[0]);
        System.out.println("scores[1]" + scores[1]);
        System.out.println("scores[2]" + scores[2]);


        //sum에는 숫자와 누적합을 담을 변수인데, 0으로 초기값을 준 이유는
        // 어떤 숫자를 더해도 더한 피연산자의 숫자를 반환해주는 숫자이기 때문

        int sum = 0;
        // i를 0부터 2까지 1씩 증가시킨 이유는 scores의 인덱스 크기와 맞추기 위함
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("좋합 : " + sum);
        double avg = (double) sum/3;
        System.out.println("평균 : " + avg);
    }
}
