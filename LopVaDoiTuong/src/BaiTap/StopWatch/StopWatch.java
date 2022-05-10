package BaiTap.StopWatch;

public class StopWatch {
    private long starttime, stoptime;

    public StopWatch() {
    }

    public long getStarttime() {
        return starttime;
    }

    public void setStarttime(long starttime) {
        this.starttime = starttime;
    }

    public long getStoptime() {
        return stoptime;
    }

    public void setStoptime(long stoptime) {
        this.stoptime = stoptime;
    }

    public StopWatch(long starttime, long stoptime) {
        this.starttime = starttime;
        this.stoptime = stoptime;
    }

    public void star() {
        setStarttime(System.currentTimeMillis());
    }

    public void stop() {
        setStoptime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return getStoptime() - getStarttime();
    }
}

