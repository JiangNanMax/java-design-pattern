package top.jiangnanmax.chapter09.v3;

/**
 * @author jiangnan
 * @description Element1
 * @date 2020/4/13
 **/

public class Element1 implements IElement {
    @Override
    public void accept(IVisitor v) {
        v.visit(this);
    }
}
