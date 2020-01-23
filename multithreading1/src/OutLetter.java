
public class OutLetter {
     private final Object lock1 = new Object();
     private volatile char nextletter = 'A';

    public OutLetter() {
    }

    public void printA(){
        synchronized (lock1) {
             try {
                for (int i1 = 0; i1 < 5; i1++) {
                    while (nextletter != 'A') {
                            lock1.wait();
                        }

                    System.out.printf("" + nextletter);
                    nextletter = 'B';
                    lock1.notifyAll();
                    }
                } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
        }
    }

    public void printB() {
        synchronized (lock1) {

            try {
                for (int i2 = 0; i2 < 5; i2++) {
                    while (nextletter != 'B') {
                            lock1.wait();
                        }

                    System.out.printf("" + nextletter);
                    nextletter = 'C';
                    lock1.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (lock1) {

            try {
                for (int i = 0; i < 5; i++) {
                    while (nextletter != 'C') {
                            lock1.wait();
                    }

                    System.out.printf("" + nextletter);
                    nextletter = 'A';
                    lock1.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
