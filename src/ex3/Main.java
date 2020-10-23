package ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask());
        tasks.add(new OutTask());
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());
        tasks.add(new CounterOutTask());

        for(Task j:tasks)
            j.execute();
    }
}
