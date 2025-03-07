package string;

import java.util.*;

public class SortCharactersByFrequency {


    static Comparator<Map.Entry<Character,Integer>> comp = new Comparator<Map.Entry<Character, Integer>>() {
        @Override
        public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
            if(o1.getValue() < o2.getValue()) return 1;
            return -1;
        }
    };

    public static String frequencySort(String s){

        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);

        List<Map.Entry<Character,Integer>> list  = new ArrayList<>(map.entrySet());
        System.out.println(list);
        list.sort(comp);
        System.out.println(list);

        StringBuilder sb =  new StringBuilder(s.length());
    for(Map.Entry<Character,Integer> en : list)
        for (int i = 0; i < en.getValue();i++) sb.append(en.getKey());

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));;
    }
}
