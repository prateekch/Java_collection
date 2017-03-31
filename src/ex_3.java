import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ex_3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = ' ';
        try {
            System.out.println("Enter String");
            String str = br.readLine().toLowerCase();
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                if (c != ' ') {
                    if (hm.containsKey(c)) {
                        hm.put(c, hm.get(c) + 1);
                    } else {
                        hm.put(c, 1);
                    }
                }
            }
            for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
