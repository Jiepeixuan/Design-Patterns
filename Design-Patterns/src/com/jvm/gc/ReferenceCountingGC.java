package com.jvm.gc;

/**
 * Created by peixuan.xie on 2017/9/19.
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC referenceCountingGCA = new ReferenceCountingGC();
        ReferenceCountingGC referenceCountingGCB = new ReferenceCountingGC();
        referenceCountingGCA.instance = referenceCountingGCB;
        referenceCountingGCB.instance = referenceCountingGCA;
        referenceCountingGCA = null;
        referenceCountingGCB = null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }

}
