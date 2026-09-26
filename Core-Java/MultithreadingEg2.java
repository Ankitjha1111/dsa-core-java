public class MultithreadingEg2  implements Runnable{

    public void run() {
        System.out.println("Hello from"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultithreadingEg2());
        Thread t2 = new Thread(new MultithreadingEg2());
        t1.start();
        t2.start();
    }

    }
