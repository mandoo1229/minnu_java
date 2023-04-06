package sec04.exam03;

public class QStopExample {
    public static void main(String[] args) throws Exception{
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode = " + keyCode);
            if(keyCode == 113) { // 113번에 해당되는 키코드는 q입니다.
                break;
            }
        }

        System.out.println("종료");
    }
}
