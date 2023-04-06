package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        map.put("홍길동", 30);
        map.put("이몽룡", 26);
        map.put("성춘향", 22);
        map.put("이방자", 22);
        System.out.println("총 Entry 수 : " + map.size());

        System.out.println("\t홍길동 : " + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        //객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        map.clear();
        System.out.println("총 Entry 수 : " + map.size());


        /*
        for (Map.Entry<String, Integer > entry:
        entrySet){
        String key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println("\t" + key + ":" + value);
        //향상된 for문으로 사용
         */
    }
}
