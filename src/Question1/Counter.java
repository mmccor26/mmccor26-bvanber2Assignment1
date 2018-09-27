package Question1;

public class Counter{
    private int theCount=1;

    public void increase(){
        theCount = theCount +1;
    }
    public void decrease(){
        theCount = theCount -1;
    }
    public int getCount(){
        return theCount;
    }
    public boolean isZero(){
        if(theCount == 0){
           return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
