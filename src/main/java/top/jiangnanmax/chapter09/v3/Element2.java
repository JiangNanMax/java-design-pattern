package top.jiangnanmax.chapter09.v3;

/**
 * @author jiangnan
 * @description Element2
 * @date 2020/4/13
 **/

public class Element2 implements IElement {
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
