package sec02.exam03;

public class CreatByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; // 값을 넣어주지 않았다.
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr1[%d] = %d\n", i, arr1[i]); // 0을 기본값으로 해서 배열에 값이 설정됐다.
        }

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
        }

        double[] arr2 = new double[3]; // 값을 넣어주지 않았다.
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr2[%d] = %f\n", i, arr2[i]); // 0.0을 기본값으로 해서 배열에 값이 설정됐다.
        }

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr2[%d] = %f\n", i, arr2[i]);
        }

        String[] arr3 = new String[3]; // 값을 넣어주지 않았다.
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr3[%d] = %s\n", i, arr3[i]);
        }

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr3[%d] = %s\n", i, arr3[i]);
        }
    }
}
