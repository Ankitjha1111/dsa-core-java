public class MultithreadingEg1 extends Thread {
    public void run() {
        System.out.println("Running is" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultithreadingEg1 t1 = new MultithreadingEg1();
        MultithreadingEg1 t2 = new MultithreadingEg1();
        t1.start();
        t2.start();
    }
}//This is extending Thread