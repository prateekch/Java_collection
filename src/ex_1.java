import java.util.ArrayList;
import java.util.Iterator;

public class ex_1 {
    public static void main(String[] args) {
        float sum = 0.0f;
        ArrayList<Float> arr = new ArrayList<>();
        arr.add(32.222f);
        arr.add(23.22f);
        arr.add(10.223f);
        arr.add(3.232f);
        arr.add(7.23f);
        Iterator itr = arr.iterator();
        while (itr.hasNext()) {
            sum = (float) itr.next() + sum;
        }
        System.out.println("SUM --   "+sum);
    }
}
