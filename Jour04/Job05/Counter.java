package Jour04.Job05;

class Counter implements Runnable {
    private int start;
    private int end;
    private long result;

    public Counter(int start, int end) {
        this.start = start;
        this.end = end;
        this.result = 0;
    }

    public long getResult() {
        return result;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            result += i;
        }
    }
}