package sec03.exam01.sec03.exam02;

import sec03.exam01.Week;

import java.util.Calendar;

public class EnumaWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        //1일 때 일요일, 2일 때 월요일, 3일 때 화요일, 4일 때 수요일, 5일 때 목요일, 6일 때 금요일, 7일 때 토요일
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week) {
            case 1: // 일요일
                today = Week.SUNDAY; break;
            case 2: // 화요일
                today = Week.MONDAY; break;
            case 3: // 일요일
                today = Week.TUESDAY; break;
            case 4: // 일요일
                today = Week.WEDNESDAY; break;
            case 5: // 일요일
                today = Week.THURSDAY; break;
            case 6: // 일요일
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘 요일 : " + today);

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 게임을 합니다. ");
        } else {
            System.out.println("열심히 자바 공부합니다.");
        }
    }
}
