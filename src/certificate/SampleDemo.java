/*
 * Copyright (c) Burak KILINC 2021-2021. All rights reserved.
 */

package certificate;

/**
 * TODO Describe this class.
 *
 * @author burak kilinc
 * @since 2021-09-30
 */
class SampleDemo implements Runnable {

    private Thread t;
    private String threadName;

    SampleDemo (String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        while (true)
            System.out.print(threadName);
    }

    public void start ()
    {
        if (t == null)
        {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

class TestThread {

    public static void main(String args[]) {

        SampleDemo A = new SampleDemo( "A");
        SampleDemo B = new SampleDemo( "B");

        B.start();
        A.start();
    }
}

