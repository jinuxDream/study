package com.jiangyunpeng.netty.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by user on 2018/2/6.
 */
public class TimeServer {

    public static void main(String[] args) {
        int port = 8080;

        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket(port);
            System.out.println("server is port:" + port + " started!");
            while (true){
                socket = server.accept();
                System.out.println("socket is on ready");
                new Thread(new TimeServerHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (server != null){
                try {
                    System.out.println("Server Closed!");
                    server.close();
                    server = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }




}
