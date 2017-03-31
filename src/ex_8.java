import java.text.SimpleDateFormat;
import java.util.Date;

public class ex_8 {
    public static void main(String[] args) {

        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String s=formatter.format(d);
        System.out.println(s);

    }
}
