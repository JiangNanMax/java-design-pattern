package top.jiangnanmax.chapter03;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * @author jiangnan
 * @description ImageRead
 * @date 2020/2/7
 **/

public class ImageRead implements IRead<ImageInfo> {    // 读取图像文件
    public ImageInfo read(String... in) {
        File file = new File(in[0]);
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();
            int[] rgb = new int[width * height];
            bufferedImage.getRGB(0, 0, width, height, rgb, 0, width);   // 将图像数据读取到rgb数组中

            ImageInfo imageInfo = new ImageInfo();
            imageInfo.setWidth(width);
            imageInfo.setHeight(height);
            imageInfo.setRGB(rgb);
            return imageInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
