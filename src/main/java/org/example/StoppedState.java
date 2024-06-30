package org.example;

public class StoppedState implements LiftState{
    @Override
    public void handleRequest(Lift lift, int floor) {
        if(lift.getCurrentFloor()<floor){
            lift.setLiftState(new MovingUpState());
            return;
        }
        else if(lift.getCurrentFloor()>floor){
            lift.setLiftState(new MovingDownState());
            return;
        }
    }
}
