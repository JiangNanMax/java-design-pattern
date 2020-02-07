package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description ImageInfo
 * @date 2020/2/7
 **/

public class ImageInfo {    // 自定义图片的数据类型
    private int width;
    private int height;
    private int[][] r;
    private int[][] g;
    private int[][] b;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getR() {
        return r;
    }

    public int[][] getG() {
        return g;
    }

    public int[][] getB() {
        return b;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRGB(int[] rgb) {
        r = new int[height][width];
        g = new int[height][width];
        b = new int[height][width];
        int pos = 0;
        for (int i = 0; i < height; i++) {
            pos = width * i;
            for (int j = 0; j < width; j++) {
                r[i][j] = (rgb[pos + j] & 0xff0000) >> 16;
                g[i][j] = (rgb[pos + j] & 0x00ff00) >> 8;
                b[i][j] = rgb[pos + j] & 0x0000ff;
            }
        }
    }
}
