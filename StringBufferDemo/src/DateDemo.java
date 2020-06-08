import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 常用日期处理类
 * @author ww
 * @date 2020/4/27 10:59
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.getTime());
        //转换
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));

        //转换公用
        Date dl = format.parse("2020-04-27 11:08:11");
        System.out.println(dl);

        //设置指定时间的日历类
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dl);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
