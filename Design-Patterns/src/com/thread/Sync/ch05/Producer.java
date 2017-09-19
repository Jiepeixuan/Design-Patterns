package com.thread.Sync.ch05;

/**
 * Created by peixuan.xie on 2017/9/19.
 */
public class Producer implements Runnable {

    /**
     * Simulated File
     */
    private FileMock mock;

    /**
     * Buffer
     */
    private Buffer buffer;

    /**
     * Constructor of the class. Initialize the objects
     * @param mock Simulated file
     * @param buffer Buffer
     */
    public Producer (FileMock mock, Buffer buffer){
        this.mock=mock;
        this.buffer=buffer;
    }

    /**
     * Core method of the producer. While are pending lines in the
     * simulated file, reads one and try to store it in the buffer.
     */
    @Override
    public void run() {
        buffer.setPendingLines(true);
        while (mock.hasMoreLines()){
            String line=mock.getLine();
            buffer.insert(line);
        }
        buffer.setPendingLines(false);
    }

}