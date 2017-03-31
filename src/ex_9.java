import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ex_9 {
    public static void main(String[] args) {
       Date d=new Date();

        DateFormat date=DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.US);
        DateFormat time= DateFormat.getTimeInstance(DateFormat.DEFAULT,Locale.US);
        System.out.println("US TIME FORMAT \n "+date.format(d)+" "+time.format(d.getTime()));


        date=DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.FRANCE);
        time= DateFormat.getTimeInstance(DateFormat.DEFAULT,Locale.FRANCE);
        System.out.println("\n FRANCE TIME FORMAT \n "+date.format(d)+" "+time.format(d.getTime()));


        date=DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.UK);
        time= DateFormat.getTimeInstance(DateFormat.DEFAULT,Locale.UK);
        System.out.println("\n UK TIME FORMAT \n "+date.format(d)+" "+time.format(d.getTime()));

        date=DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.CHINA);
        time= DateFormat.getTimeInstance(DateFormat.DEFAULT,Locale.CHINA);
        System.out.println("\n CHINA TIME FORMAT \n "+date.format(d)+" "+time.format(d.getTime()));


    }
}
