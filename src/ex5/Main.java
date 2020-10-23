package ex5;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        for(Integer i=0;i<=9;i++){
            Thread th = new Thread();
            Thread th1=Thread.currentThread();
            Thread.currentThread().setName(i.toString());
            String tName = Thread.currentThread().getName();
            System.out.println(tName);

        }
    }
}
