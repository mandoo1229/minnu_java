package sec01.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    private List<Board> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter;

    private void showMenu() {
        while (true) {
            System.out.println("======================================================================");
            System.out.println("1.목록 | 2. 상세내용 | 3. 수정하기 | 4. 글쓰기 | 5. 삭제하기 | 6. 파일저장 | 7. 종료");
            System.out.println("=============r========================================================");

            System.out.println("선택");
            String selectNo = scanner.nextLine();
            switch (selectNo) {
//                case "1" -> list();
//                case "2" -> det();
//                case "3" -> update();
//                case "4" -> write();
//                case "5" -> save();
//                case "6" -> delete();
//                case "7" -> {return;}
//
//            } catch(Exception e){
//                System.out.println("등록 에러 : " + e.getMessage());
//            }
//        }
            }
        }
    }
}