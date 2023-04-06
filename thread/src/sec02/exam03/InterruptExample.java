package sec02.exam03;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        thread.interrupt();
    }
}
