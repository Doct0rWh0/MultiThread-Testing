public class Main {
        public static void main(String[] args) {
            MyRunnable myRunnable = new MyRunnable();
            Thread[] threadArr = new Thread[5];
            
            Thread thread1 = new Thread(myRunnable);
            Thread thread2 = new Thread(myRunnable);
            Thread thread3 = new Thread(myRunnable);

            thread1.start();
            thread2.start();
            thread3.start();
        }
}

