package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description ImageFactory
 * @date 2020/2/7
 **/

public class ImageFactory extends AbstractReadFactory {
    public IRead create() {
        return new ImageRead();
    }
}
