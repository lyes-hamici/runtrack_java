package Jour04.Job08;

import java.util.concurrent.*;

class SumCalculator implements Callable<Long> {
    private int start;
    private int end;

    public SumCalculator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}

