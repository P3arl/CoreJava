import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

class Counter  implements Runnable{
    private int c = 0;

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {
        synchronized (Counter.class) {
            //incrementing
            this.increment();
            System.out.println("Value for Thread After increment "
                    + Thread.currentThread().getName() + " " + this.getValue());
            //decrementing
            this.decrement();
            System.out.println("Value for Thread at last "
                    + Thread.currentThread().getName() + " " + this.getValue());
       }
    }
}

public class RaceConditionDemo{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        Counter counter1 = new Counter();
        Thread tt1 = new Thread(counter1, "Thread-11");
        Thread tt2 = new Thread(counter1, "Thread-22");
        Thread tt3 = new Thread(counter1, "Thread-33");
        tt1.start();
        tt2.start();
        tt3.start();*/

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(new Callable<String>(){
            public String call() throws Exception{
                return"task A";
            }
        });
        callables.add(new Callable<String>(){
            public String call() throws Exception{
                return"task B";
            }
        });
        callables.add(new Callable<String>(){
            public String call() throws Exception{
                return"task C";
            }
        });
        List<Future<String>> result = executorService.invokeAll(callables);
        result.forEach(f -> {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        //System.out.println("result = " + result);
        executorService.shutdown();
    }

}