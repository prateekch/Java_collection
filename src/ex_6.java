import java.util.*;

public class ex_6 {
    public static void main(String[] args) {
        char c = ' ';
        char[] s = {'a','b','c','c','d','d','d','e'};

        HashMap<Character, Integer> hm = new HashMap<>();
       for(int i=0;i<s.length;i++){
            if (hm.containsKey(s[i])) {
                hm.put(s[i], hm.get(s[i]) + 1);
            } else {
                hm.put(s[i], 1);
            }


        }
        Map<Character, Integer> sortedMap = sortByValue(hm);


        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + "     " + entry.getValue());
        }
    }
        private static Map<Character, Integer> sortByValue(Map<Character, Integer> unsortMap) {
       List<Map.Entry<Character, Integer>> list =
                    new LinkedList<Map.Entry<Character, Integer>>(unsortMap.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
                public int compare(Map.Entry<Character, Integer> o1,
                                   Map.Entry<Character, Integer> o2) {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });

            Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
            for (Map.Entry<Character, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            return sortedMap;
        }
    }

