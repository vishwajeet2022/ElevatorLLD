package org.example;

public class MovingDownState implements LiftState{
    @Override
    public void handleRequest(Lift lift, int floor) {
        if(lift.getCurrentFloor()>floor){
            System.out.println("Lift is moving downward");
        }

        lift.setLiftState(new StoppedState());
    }
}
