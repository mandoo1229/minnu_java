package sec01.exam05;

public class Practice06 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j > 0; j++) {
                if (i < j) {
                    System.out.println(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
