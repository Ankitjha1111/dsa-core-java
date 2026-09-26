public class MultithredingEg3 extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count:" + i);
            try {
                  Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Interrupted!");

            }
        }// Thread sleep code
    }

    public static void main(String[] args) {
        MultithredingEg3 t1 = new MultithredingEg3();
        t1.start();
    }
}
