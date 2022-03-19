package ThreadPack;

/**
 *
 * Working example as per need
 */

public class WaitAndNotify implements Runnable {

    volatile int number = 0;

    WaitAndNotify() {
        Thread t1 = new Thread(this, "t1-odd");
        Thread t2 = new Thread(this, "t2-even");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        print();
    }

    private void print() {
        while (number < 20) {
            synchronized (this) {
                if (Thread.currentThread().getName().equals("t1-odd")) {
                    if (number % 2 == 0) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(" number " + number + " : " + Thread.currentThread());
                    number++;
                    notify();
                }

                if (Thread.currentThread().getName().equals("t2-even")) {
                    if (number % 2 != 0) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(" number " + number + " : " + Thread.currentThread());
                    number++;
                    notify();
                }

            }
        }

    }

    public static void main(String[] a) {
        new WaitAndNotify();
    }
}

/*
      remove queue [firsElem]

       fist elem = queue.next.nxt;
    *  queue.next =  newElemet
           newElemet.nxt = elem
    *
    *
    * */