package sec01.sec01.exam04;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10){
            int v2;
            v2 = v1 -10;
        }
        //int v3 = v1 + v2; 오류가 떠버렸다!!!!!! v2변수를 사용할 수 없기 때문에 에러가 발생
    }
}
