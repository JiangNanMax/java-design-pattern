package top.jiangnanmax.chapter07.v2;

/**
 * @author jiangnan
 * @description Client
 * @date 2020/3/2
 **/

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.onBtnPushed(0);
        remoteController.undoBtnPushed();
        remoteController.offBtnPushed(0);
        remoteController.undoBtnPushed();

        TvReceiver tvReceiver = new TvReceiver();
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        remoteController.onBtnPushed(1);
        remoteController.undoBtnPushed();
        remoteController.offBtnPushed(1);
        remoteController.undoBtnPushed();
    }
}
