package exemple;
import java.util.Scanner;

/**
 * Created by leleluattila on 19/01/16.
 */
class TV {
    Display disp;
    PowerSource pw;
    boolean start;
    int channel;

    TV(int s, int w){
        disp = new Display(s);
        pw = new PowerSource(w);
        channel = 99;
    }

    void channelUp(){
        if(channel<100 && start == true){
            channel++;
        }
        System.out.println("current channel: "+ channel);
    }

    void channelDown(){
        if(channel<0 && start == true){
            channel--;
        }
        System.out.println("current channel: " + channel);
    }

    void onOff(){
        if (start == false){
            start = true;
            System.out.println("Power on");
            pw.currentFlowOn();
            disp.showMenu();

        }else{
            start = false;
            System.out.println("Powering off");
            pw.currentFlowOff();
        }
    }
}

class Display{
    int size;
    Display(int s){
        size = s;
    }


    void showMenu(){
        System.out.println("Displaying tv menu");

    }

    void closeMenu(){
        System.out.println("Closing tv menu");
    }
}

class PowerSource{
    int watt;
    PowerSource(int w){
        watt = w;
    }

    void currentFlowOn(){
        System.out.println("Power source connected");
    }

    void currentFlowOff(){
        System.out.println("Power source disconected");
    }
}