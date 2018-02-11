package com.jiangyunpeng.netty.bio2;

import com.jiangyunpeng.netty.bio.TimeServerHandler;

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

        try {
            server = new ServerSocket(port);
            System.out.println("time server started! 8080 ");
            Socket socket = null;
            TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(50,100);
            while (true){
                socket = server.accept();
                singleExecutor.execute(new TimeServerHandler(socket));
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
