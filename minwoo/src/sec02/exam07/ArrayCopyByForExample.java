package sec02.exam07;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5]; //배열의 요소에 대해서 모두 0값으로 초기화

        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println("newIntArray = " + newIntArray[i]);

        }
    }
}
