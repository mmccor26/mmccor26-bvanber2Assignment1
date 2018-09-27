package Question1;

public interface Rollable <T> {

    public void reset();
    public void increase();
    public boolean lastRolledOver();
    public T getValue();
}
