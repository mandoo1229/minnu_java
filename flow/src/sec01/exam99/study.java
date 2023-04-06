package sec01.exam99;

public class study {
    public static void main(String[] args) {
        int score = 85;
        System.out.println("등급은");
        if(score < 70){
            System.out.println("D");
        } else if (score < 80) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
