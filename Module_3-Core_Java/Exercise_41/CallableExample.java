import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = List.of(
            () -> "Task 1 finished",
            () -> "Task 2 finished",
            () -> "Task 3 finished"
        );

        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
