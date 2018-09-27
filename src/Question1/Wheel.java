package Question1;

public class Wheel extends Counter implements Rollable<Integer>{
    private int localmin;
    private int localmax;

    public Wheel(int min,int max){
        localmax = max;
        localmin = min;

    }

    public void reset(){
        while(getCount()>localmin){
            decrease();
        }

    }
    public void increase(){
        super.increase();
        if(getCount()>localmax){
            reset();
        }


    }
    public boolean lastRolledOver(){
        if(getCount() == localmin){
            return true;
        }
        else{
            return false;
        }
    }
    public Integer getValue(){

        return super.getCount();

    }

}
