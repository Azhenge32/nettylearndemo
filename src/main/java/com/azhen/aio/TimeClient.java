package com.azhen.aio;

/**
 * @author Azhen
 * @date 2017/12/29
 */
public class TimeClient {
    public static void main(String[] args) {
        int port = 8081;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                ;   //不处理
            }
        }

        AsyncTimeClientHandler timeServer = new AsyncTimeClientHandler("127.0.0.1" ,port);
        new Thread(timeServer, "AIO-AsyncTimeClientHandler-001").start();
    }
}
