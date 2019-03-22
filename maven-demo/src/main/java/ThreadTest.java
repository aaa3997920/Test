import thread.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        System.out.println(Thread.currentThread().getName());
//        Runnable r = new MyRunnable();
//        Thread t = new Thread(r);
//        t.start();
        FutureTask<String> task = new FutureTask<String>(new MyCallable());
        new Thread(task).start();
        if(!task.isDone()){
            System.out.println(" task is not finished ");
        }
        System.out.println("task.get() = " + task.get());
    }



}
