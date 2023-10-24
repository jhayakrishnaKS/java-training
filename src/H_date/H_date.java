package H_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_date {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.print("Today is:");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E-dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
