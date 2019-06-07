/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt48;

import java.util.Arrays;

/**
 *
 * @author hlamg
 */
public class CTivi {

    private String[] channelList;
    private boolean isOn;
    private String currentChannel;

    public String[] getChannelList() {
        return channelList;
    }

    public void setChannelList(String[] channelList) {
        this.channelList = channelList;
    }

    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public String getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(String currentChannel) {
        this.currentChannel = currentChannel;
    }

    
    public CTivi() {
        this.isOn = false;
        this.channelList = new String[]{"VTV1", "VTV2", "VTV3"};
        this.currentChannel = "VTV1";
    }

    public CTivi(String[] channelList) {
        this.channelList = channelList;
        this.isOn = false;
        this.currentChannel = channelList[0];
    }

    private String seachNextChannel(boolean isForward) {
        int leng = this.channelList.length;
        for (int i = 0; i < leng; i++) {
            if (isForward) {
                if (this.currentChannel == this.channelList[i] && i != leng-1) {
                    return this.channelList[i + 1];
                }
            } else {
                if (this.currentChannel == this.channelList[i] && i != 0) {
                    return this.channelList[i - 1];
                }
            }
        }

        if (isForward) {
            return this.channelList[0];
        } else {
            return this.channelList[leng - 1];
        }
    }
    
    void On(){
        this.isOn = true;
        System.out.println("---Tivi ON---");
    }
    
    void Off(){
        this.isOn = false;
        System.out.println("---Tivi OFF---");
    }
    
    void Switch(){
        if (isOn) {
            Off();
        } else {
            On();
        }
    }
    
    void Switch(String channel){
        if (isOn) {
            Off();
        } else {
            On();
            int cout2 = 0;
            for (String channelList1 : this.channelList) {
                if (channel.equals(channelList1)) {
                    this.currentChannel = channel;
                    ++cout2;
                }
            }
            if(cout2 == 0){
                System.out.println("Khong tim thay kenh : " + channel);
            }
        }
    }
    
    void nextChannel(){
        if (isOn) {
            this.currentChannel = seachNextChannel(true);
        }
    }
    
    void previousChannel(){
        if (isOn) {
            this.currentChannel = seachNextChannel(false);
        }
    }
    
    void Show(){
        if (isOn) {
            System.out.printf("---Tivi is On at channel : %s ---", this.currentChannel);
        } else {
            System.out.println("---- Tivi now OFF! ----");
        }
    }

    @Override
    public String toString() {
        String listChannel;
        listChannel = Arrays.toString(channelList);
        return "CTivi{" + "channelList=" + listChannel + ", isOn=" + isOn + ", currentChannel=" + currentChannel + '}';
    }
}
