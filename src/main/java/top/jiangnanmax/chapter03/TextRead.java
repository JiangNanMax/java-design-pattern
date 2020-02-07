package top.jiangnanmax.chapter03;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author jiangnan
 * @description TextRead
 * @date 2020/2/7
 **/

public class TextRead implements IRead<String> {    // 读取文本文件
    public String read(String... in) {
        String result = null;
        try {
            File file = new File(in[0]);
            long len = file.length();
            FileInputStream inputStream = new FileInputStream(in[0]);
            byte[] buf = new byte[(int)len];    // 设置缓冲区大小，此处设为文件大小，一次性读取完毕
            inputStream.read(buf);
            result = new String(buf, in[1]);    // 按照给定编码方式转化成可见字符串
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
