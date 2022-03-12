package ThreadPack;

// Real working as per need
public class ThreadOddEven {

    volatile int counter = 0;
    static int n = 100;

    public static void main(String[] args) {
        ThreadOddEven threadOddEven = new ThreadOddEven();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadOddEven.printEvenNumber();
            }
        }, "t1-even");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadOddEven.printOddNumber();
            }
        }, "t2-Odd");
        t1.start();
        t2.start();


    }

    private void printOddNumber() {

        synchronized (this) {
            while (counter < n) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(" number " + counter + " : " + Thread.currentThread());
                counter++;
                notifyAll();
            }
        }
    }

    private void printEvenNumber() {
        synchronized (this) {
            while (counter < n) {
                if (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(" number " + counter + " : " + Thread.currentThread());
                counter++;
                notifyAll();
            }
        }
    }
}

/**
 * number 0 : Thread[t1-even,5,main]
 *  number 1 : Thread[t2-Odd,5,main]
 *  number 2 : Thread[t1-even,5,main]
 *  number 3 : Thread[t2-Odd,5,main]
 *  number 4 : Thread[t1-even,5,main]
 *  number 5 : Thread[t2-Odd,5,main]
 *  number 6 : Thread[t1-even,5,main]
 *  number 7 : Thread[t2-Odd,5,main]
 *  number 8 : Thread[t1-even,5,main]
 *  number 9 : Thread[t2-Odd,5,main]
 *  number 10 : Thread[t1-even,5,main]
 *  number 11 : Thread[t2-Odd,5,main]
 */
