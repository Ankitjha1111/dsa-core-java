public class MultithreadingEg4 extends Thread {
    public void run() {
        System.out.println("Running thread:" + this.getName());
    }

    public static void main(String[] args) {
        MultithreadingEg4 t1 = new MultithreadingEg4();
        MultithreadingEg4 t2 = new MultithreadingEg4();
        t1.start();
        try {
            t1.join();   // this is the code of join method

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        t2.start();
    }
}
