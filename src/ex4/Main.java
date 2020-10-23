package ex4;

public class Main {
    public static void main(String[] args) {
        MyThread myT = new MyThread();
        myT.start();
        MyRunnable myT2=new MyRunnable();
        myT2.run();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Mare bine!");
            }
        }).start();
    }
}
