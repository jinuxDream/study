package com.jiangyunpeng.mode.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jyp on 2017/11/1.
 */
public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void printComponent(Graphics g){
        super.printComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHight();
        int x = (800-w)/2;
        int y = (600-h)/2;
        icon.printIcon(this,g,x,y);
    }
}
