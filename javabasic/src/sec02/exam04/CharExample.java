package sec02.exam04;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; //65에 해당되지만 문자로 저장
        char c2 = 65; //십진수로 저장
        char c3 = '\u0041'; //16진수로 저장
        
        char c4 = '가'; //43032에 해당되지만 문자로 저장
        char c5 = 44032; // 십진수로 저장
        char c6 = '\uac00';  //16진수로 저장

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
    }
}
