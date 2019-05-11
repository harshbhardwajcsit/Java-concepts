package Basics;

public class Sample extends Thread {
    private  String name;
    private int repeat;

    public Sample(String name, int repeat) {
        this.name = name;
        this.repeat = repeat;
    }

    public void run() {
         synchronized(name) {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + "-->" + i);
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        Sample t1 = new Sample("Thread 1", 5);
        t1.setDaemon(false);

        Sample t2 = new Sample("Thread 2", 5);
        t2.setDaemon(false);

        t1.start();
        t2.start();


        System.out.println("exiting from main thread");
    }
}
