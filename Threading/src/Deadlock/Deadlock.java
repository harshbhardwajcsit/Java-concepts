package Deadlock;

public class Deadlock implements Runnable {
    private Resources resource;


    public Deadlock(Resources resource) {
        this.resource = resource;
    }


    @Override
    public void run() {
        synchronized (resource) {
            while(true){
                try {
                    resource.setA(2);
                    resource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Resources r1 = new Resources(1, "s");
        Resources r2 = new Resources(1, "s");
        Thread thread1 = new Thread(() -> {

        });


    }
}
