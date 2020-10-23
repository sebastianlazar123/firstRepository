package ex3;
import java.util.*;
public class RandomOutTask implements Task {
    private Random rand;
    private int toPrint;
    public RandomOutTask() {
        int up=100000;
        this.rand= new Random();
        toPrint=rand.nextInt(100000);
    }

    @Override
    public void execute() {
      System.out.println(toPrint);
    }
}
