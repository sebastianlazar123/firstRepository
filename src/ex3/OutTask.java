package ex3;
import java.util.*;
public class OutTask implements Task{
    private String text;
    public void execute()
    {
        System.out.println(text);
    }

    public OutTask() {
        this.text="Esti in OutTask!";
    }
}
