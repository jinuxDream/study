package com.jiangyunpeng.mode.proxy.virtualproxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by jyp on 2017/10/31.
 */
public class ImageProxyTestDriver {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDriver testDriver = new ImageProxyTestDriver();

    }

    public ImageProxyTestDriver() throws MalformedURLException {
        cds.put("test","http://58.246.210.2:8845/wisdom_b615u2pqnejqxgg9on3ebrcyld0juia9/101a.jpg");
        cds.put("aaa","http://58.246.210.2:8845/wisdom_b615u2pqnejqxgg9on3ebrcyld0juia9/101a.jpg");
        cds.put("bbb","http://58.246.210.2:8845/wisdom_b615u2pqnejqxgg9on3ebrcyld0juia9/101a.jpg");

        URL initialURL = new URL((String) cds.get("test"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite  CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys();e.hasMoreElements();){
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("listenning ...." + e.getActionCommand());
                    System.out.println("URL ...." + getCDUrl(e.getActionCommand()));
                    imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    private URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
