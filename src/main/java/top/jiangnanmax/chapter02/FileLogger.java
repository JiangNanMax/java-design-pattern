package top.jiangnanmax.chapter02;

import sun.util.resources.cldr.fa.CalendarData_fa_AF;

import java.io.FileOutputStream;
import java.util.Calendar;

/**
 * @author jiangnan
 * @description FileLogger
 * @date 2020/1/13
 **/

// 日志类

public class FileLogger {

    private String path = "/Users/jiangnan/IdeaProjects/java-design-pattern/src/main/java/top/jiangnanmax/chapter02/log.txt";

    private FileOutputStream out;

    private FileLogger() throws Exception {
        out = new FileOutputStream(path, true);
        System.out.println("This is new instance.");
    }

    public void write(String msg) {
        try {
            Calendar c = Calendar.getInstance();
            int y = c.get(Calendar.YEAR);
            int m = c.get(Calendar.MONTH);
            int d = c.get(Calendar.DAY_OF_MONTH);
            int hh = c.get(Calendar.HOUR);
            int mm = c.get(Calendar.MINUTE);
            int ss = c.get(Calendar.SECOND);
            String strTime = String.format("time:%d-%02d-%02d %02d:%02d:%-2d\r\n", y, m, d, hh, mm, ss);
            String strContent = "content:\r\n" + msg + "\r\n";
            byte[] buf = strTime.getBytes("gbk");
            out.write(buf);
            buf = strContent.getBytes("gbk");
            out.write(buf);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class My {
        static FileLogger log;
        static {
            try {
                log = new FileLogger();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static FileLogger getInstance() {
        return My.log;
    }

}
