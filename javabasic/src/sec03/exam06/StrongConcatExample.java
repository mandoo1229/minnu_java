package sec03.exam06;

public class StrongConcatExample {
    public static void main(String[] args) {
        //숫자의 연산 + 연산
        int value = 10 + 2 + 8;
        System.out.println("value = " + value);
        
        //+ 결합 연산
        String str1 = 10 + 2 + "8"; //덧셈 산술 연산은 왼쪽부터 오른쪽으로 수행된다. "128"
        System.out.println("str1 = " + str1);

        String str2 = 10 + "2" + 8; //"1028"
        System.out.println("str2 = " + str2);
        
        String str3 = "10" + 2 + 8; //"1028"
        System.out.println("str3 = " + str3);
        
        String str4 = "10" + (2 + 8); //"1010"
        System.out.println("str4 = " + str4);
    }
}
