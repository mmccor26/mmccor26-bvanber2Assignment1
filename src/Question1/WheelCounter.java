package Question1;

public class WheelCounter<T> implements WheelCounterInterface<T> {
    int inUse;


    public Rollable<T> wheel1,wheel2,wheel3,wheel4;

    public void reset(){
        wheel1.reset();
        wheel2.reset();
        wheel3.reset();
        wheel4.reset();

    }
    public void increase(){
        wheel1.increase();


        if(wheel1.lastRolledOver()){
            wheel2.increase();
            if(wheel2.lastRolledOver()){
                wheel3.increase();
                if(wheel3.lastRolledOver()){
                    wheel4.increase();
                }
            }
        }

    }

    public T getWheelValue(int thewheel){
        if(thewheel==1){
            return wheel1.getValue();
        }
        else if(thewheel==2){
            return wheel2.getValue();
        }
        else if(thewheel==3){
            return wheel3.getValue();
        }
        else{
            return wheel4.getValue();
        }


    }
    public int getwheelsInUse(){
        return inUse;

    }

    public WheelCounter(){

    }

    public WheelCounter(Rollable<T> one){
        inUse = 1;


    }
    public WheelCounter(Rollable<T> one , Rollable<T> two){
        inUse = 2;


    }
    public WheelCounter(Rollable<T> one,Rollable<T> two,Rollable<T> three){
        inUse = 3;

    }
    public WheelCounter(Rollable<T> one,Rollable<T> two,Rollable<T> three, Rollable<T> four){
        inUse = 4;
        wheel1=one;
        wheel2=two;
        wheel3=three;
        wheel4=four;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
