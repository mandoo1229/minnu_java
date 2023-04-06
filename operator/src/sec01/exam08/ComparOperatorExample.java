package sec01.exam08;

public class ComparOperatorExample {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        //타입이 달라도 값이 같은지비교가 되나 확인
        System.out.println(v2 == v3); //true

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); //false
        System.out.println((float) v4 == v5);
        System.out.println((int)(v4*10) == (int)(v5*10)); //true
        //소수점에서 어느 지점에서 반올림 하느냐에 따라 값이 달라지기 때문에 true 와 false로 나뉜다.
    }
}
