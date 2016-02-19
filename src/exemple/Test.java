package exemple;

/**
 * Created by leleluattila on 19/01/16.
 */
public class Test {
    public static void main(String[] args){
        TV tv1 = new TV(45, 110);

        tv1.onOff();
        //tv1.onOff();

        tv1.channelUp();
        tv1.channelUp();
        tv1.channelDown();
        tv1.channelDown();
        tv1.channelDown();

    }
}
