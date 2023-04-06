package sec01.exam04;

public class SwichExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) +1;

        switch (num) {
            case 1:
                System.out.println("1이 나왔습니다.");
                break;

            case 2:
                System.out.println("2가 나왔습니다.");
                break;

            case 3:
                System.out.println("3이 나왔습니다.");
                break;

            case 4:
                System.out.println("4가 나왔습니다.");
                break;

            case 5:
                System.out.println("5가 나왔습니다.");
                break;
            default : //앞에 case에서 모두 해당되지 않을 때 실행되는 부분
            case 6:
                System.out.println("6이 나왔습니다.");
                break;
        }
    }
}
