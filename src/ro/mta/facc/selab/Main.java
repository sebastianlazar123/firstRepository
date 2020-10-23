package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args) {
        Carte carte = new Carte("Fratii Karamazov", "Feodor Dostoievski", 1880, 1200);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.add(carte);
        biblioteca.add(new Carte("Procesul", "Kafka", 1910, 300));
        biblioteca.add(new Carte("CArte2", "Ksad", 1950, 1000));
        //System.out.println(carte);
        biblioteca.sort();
        // System.out.println(biblioteca);
        MyThread thr = new MyThread();
        System.out.println(Thread.currentThread().getName());
        thr.start();

        try {
            thr.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
