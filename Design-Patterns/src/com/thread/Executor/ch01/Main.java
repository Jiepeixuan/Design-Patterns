package com.thread.Executor.ch01;

/**
 * Created by peixuan.xie on 2017/9/21.
 */
public class Main {
    public static void main(String[] args) {
        // Create the server
        Server server=new Server();

        // Send 100 request to the server and finish
        for (int i=0; i<100; i++){
            Task task=new Task("Task "+i);
            server.executeTask(task);
        }

        server.endServer();

    }
}
