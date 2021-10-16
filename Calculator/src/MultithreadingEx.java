public class MultithreadingEx implements Runnable {
    int count;

    synchronized void modify() {
        count++;
        System.out.println(count + " " + Thread.currentThread().getName());
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            modify();
        }
    }

    public static void main(String[] args) {
        MultithreadingEx mtEx= new MultithreadingEx();

        Thread t1 = new Thread(mtEx);
        Thread t2 = new Thread(mtEx);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (Exception ob){
            System.out.println("abc");
        }
        System.out.println(mtEx.count);
    }
}
