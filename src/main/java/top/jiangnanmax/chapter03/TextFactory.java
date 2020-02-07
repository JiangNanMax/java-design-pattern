package top.jiangnanmax.chapter03;

/**
 * @author jiangnan
 * @description TextFactory
 * @date 2020/2/7
 **/

public class TextFactory extends AbstractReadFactory {
    public IRead create() {
        return new TextRead();
    }
}
