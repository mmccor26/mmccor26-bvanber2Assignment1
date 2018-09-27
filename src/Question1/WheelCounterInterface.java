package Question1;

public interface WheelCounterInterface<T> {
    public void reset();
    public void increase();
    public T getWheelValue(int thewheel);
    public int getwheelsInUse();
}
