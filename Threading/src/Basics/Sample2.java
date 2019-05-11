package Basics;

public class Sample2 extends Thread {
    private String name;
    private int repeat;

    public Sample2(String name, int repeat) {
        this.name = name;
        this.repeat = repeat;
    }

    public void run() {
        System.out.println("Thread " + name + " started");

        for (int i = 1; i <= repeat; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("From thread " + name + " : " + i);
            } catch (IllegalThreadStateException e) {
                System.out.println("Thread ends" + e);
            } catch (InterruptedException e) {
                System.out.println("Thread ends" + e);
            }
        }
        System.out.println("Thread " + name + " finished");
    }

    public static void main(String args[]) throws InterruptedException {
        Sample2 t1 = new Sample2("Thread 1", 10);
        t1.setDaemon(false);

        Sample2 t2 = new Sample2("Thread 2", 5);
        t2.setDaemon(false);

        Sample2 t3 = new Sample2("Thread 3", 5);
        t3.setDaemon(false);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t2.join(10);

//        t3.start();


        System.out.println("exiting from main thread");
    }
}
