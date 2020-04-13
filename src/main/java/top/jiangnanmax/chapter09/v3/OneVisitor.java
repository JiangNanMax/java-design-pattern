package top.jiangnanmax.chapter09.v3;

/**
 * @author jiangnan
 * @description OneVisitor
 * @date 2020/4/13
 **/

public class OneVisitor implements IVisitor {
    @Override
    public void visit(IElement obj) {
        if (obj instanceof Element1) {
            //...
        } else {
            //...
        }
    }
}
