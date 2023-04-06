package sec04.exam01;

import sec03.exam02.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    private List<Board> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter;

    public void showMenu() {
        while (true) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. 목록보기 | 2. 상세보기 | 3. 수정하기 | 4. 삭제하기 | 5. 파일저장 | 6. 종료" );
            System.out.println("----------------------------------------------------------------");

            System.out.println("선택");
            String selectNo = scanner.nextLine();
            switch (selectNo) {
                case "1" : registerProduct();
                case "2" : showProducts();
                case "3" : return;
            }
        }
    }

    private void showProducts() {
        Product product = new Product();
        product.setPno(++counter);

        System.out.println("모델명");
        product.setName (scanner.nextLine());

        System.out.println("상세정보");
        product.setName (scanner.nextLine());

        System.out.println("수정하기");
        product.setName(scanner.nextLine());

        System.out.println("삭제하기");
        product.setStock(Integer.parseInt(scanner.nextLine()));
    }

    private void registerProduct() {
    }
}
