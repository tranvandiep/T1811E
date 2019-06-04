/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai48;

/**
 *
 * @author Minh
 */
public class cTivi {

    private String[] channelList;
    private boolean isOn;
    private String currentChannel;

    public cTivi() {
        isOn = false;
        channelList = new String[3];
        channelList[0] = "VTV1";
        channelList[1] = "VTV2";
        channelList[2] = "VTV3";
        currentChannel = "VTV1";
    }

    public cTivi(String[] channelList) {
        this.channelList = channelList;
        isOn = false;
        currentChannel = channelList[0];
    }

    private String searchNextChannel(boolean isFoward) {
        int index = -1;
        for (int i = 0; i < channelList.length; i++) {
            if (channelList[i].equalsIgnoreCase(currentChannel)) {
                index = i;
                break;
            }
        }
        if (isFoward) {
            index++;
            if (index >= channelList.length) {
                index = 0;
            }
        } else {
            index--;
            if (index < 0) {
                index = channelList.length - 1;
            }
        }
        currentChannel = channelList[index];
        return currentChannel;
    }

    public void On() {
        isOn = true;
        System.out.println("---Tivi ON---");
    }

    public void Off() {
        isOn = false;
        System.out.println("---Tivi OFF---");
    }

    public void Switch() {
        if (isOn) {
            Off();
        } else {
            On();
        }
    }

    public void Switch(String channel) {
        Switch();
        if (isOn) {
            boolean isFind = false;
            for (int i = 0; i < channelList.length; i++) {
                if (channelList[i].equalsIgnoreCase(channel)) {
                    isFind = true;
                    break;
                }
            }
            if (isFind) {
                currentChannel = channel;
                System.out.println("Da tim thay kenh: " + currentChannel);
            } else {
                System.out.println("Khong tim thay kenh: " + currentChannel);
            }
        }
    }

    public void nextChannel() {
        if (isOn) {
            searchNextChannel(true);
            System.out.println("CurrentChannel: " + currentChannel);
        }
    }

    public void previousChannel() {
        if (isOn) {
            searchNextChannel(false);
            System.out.println("CurrentChannel: " + currentChannel);
        }
    }

    public void show() {
        if (isOn) {
            System.out.printf("---Tivi is On at channel: %s ---", currentChannel);
        } else {
            System.out.println("---Tivi now OFF!---");
        }
    }
}
