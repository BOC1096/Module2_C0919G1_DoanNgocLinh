package B3_LopVaDoiTuongTrongJava.BT_B2XayDungLopStopWatch;

public class StopWatch {

    private long startTime = 0;
    private long endTime = 0;

    StopWatch() {
    }

    long getStartTime() {
        return startTime;
    }

    long getEndTime() {
        return endTime;
    }

    void start() {
        this.startTime = System.currentTimeMillis();

    }

    void stop() {
        this.endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return (this.endTime - this.startTime);
    }
}
