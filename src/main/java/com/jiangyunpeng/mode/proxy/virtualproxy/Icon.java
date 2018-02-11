package com.jiangyunpeng.mode.proxy.virtualproxy;

import java.awt.*;

/**
 * Created by jyp on 2017/10/31.
 */
public interface Icon {

    int getIconWidth();
    int getIconHight();
    void printIcon(final Component c, Graphics g, int x, int y);
}
