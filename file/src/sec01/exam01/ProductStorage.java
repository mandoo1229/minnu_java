package sec01.exam01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ProductStorage {
    private List<Product> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter;

    public void showMenu() {
        while (true) {
            System.out.println("=======================");
            System.out.println("1. 등록 | 2. 목록 | 3. 종료");
            System.out.println("=======================");

            System.out.println("선택 :");
            String selectNo = scanner.nextLine();
            switch (selectNo) {
                case "1" : registerProduct();
                case "2" : showProducts();
                case "3" : return;
            }
        }
    }

    private void registerProduct() {
        try {
            Product product = new Product();
            product.setPno(++counter);

            System.out.println("상품명 :");
            product.setName(scanner.nextLine());

            System.out.println("가격 : ");
            product.setPrice(Integer.parseInt(scanner.nextLine()));

            System.out.println("재고 : ");
            product.setStack(Integer.parseInt(scanner.nextLine()));

            list.add(product);
        } catch (Exception e) {
            System.out.println("등록 에러 : " + e.getMessage());
        }
    }
    private void showProducts() {
        for (Product p : list) {
            System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStack());
        }
    }



}
