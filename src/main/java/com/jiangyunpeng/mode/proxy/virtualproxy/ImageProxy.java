package com.jiangyunpeng.mode.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by jyp on 2017/10/31.
 */
public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL url;
    Thread retrievingThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.url = url;
    }

    public int getIconWidth() {
        if (imageIcon != null){
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    public int getIconHight() {
        if (imageIcon != null){
            return imageIcon.getIconHeight();
        }
        return 600;
    }

    public void printIcon(final Component c,Graphics g,int x,int y) {
        if (imageIcon != null){
            imageIcon.paintIcon(c,g,x,y);
        }else{
            g.drawString("loading cd ...",x+300,y+190);
            if (!retrieving){
                retrieving = true;
                retrievingThread = new Thread(new Runnable() {
                    public void run() {
                        imageIcon = new ImageIcon(url,"cd cover");
                        c.repaint();
                    }
                });
                retrievingThread.start();
            }
        }
    }
}
