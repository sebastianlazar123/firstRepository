package ex3;

public class CounterOutTask implements Task{
    private static int p=0;

    @Override
    public void execute() {
       p++;
       System.out.println(p);
    }

    public CounterOutTask() {
        this.p = p;
    }
}
