package top.jiangnanmax.chapter07.v1;

/**
 * @author jiangnan
 * @description Teacher
 * @date 2020/2/28
 **/

public class Teacher implements ICommand {
    private Student receiver = null;

    public Teacher(Student receiver) {
        this.receiver = receiver;
    }

    public void sweep() {
        receiver.sweep();
    }
}
