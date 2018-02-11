package com.jiangyunpeng.netty.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 *  1 10000 3481
 *  2 10000 2393  -- java.net.BindException: Address already in use: connect
 * Created by user on 2018/2/6.
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;

        Socket socket  = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            long begin = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++){
                socket = new Socket("127.0.0.1",port);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(),true);
                out.println("query time order");
                System.out.println("send time order success !");
                String resp = in.readLine();
                System.out.println("now is : " +resp);
                socket.close();
            }
            long end = System.currentTimeMillis();
            System.out.println("消耗时间 ：" + (end - begin) );
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (out != null){
                out.close();
                out = null;
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                socket = null;
            }
        }
    }
}
