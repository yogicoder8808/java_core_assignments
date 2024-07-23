package executorsFramework;

import java.util.concurrent.Callable;

public class ComputationTask implements Callable<Integer> {
    private final int number;

    public ComputationTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}

