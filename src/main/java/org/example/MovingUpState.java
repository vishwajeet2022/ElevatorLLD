package org.example;

public class MovingUpState implements LiftState{

    @Override
    public void handleRequest(Lift lift, int floor) {
        if(floor>lift.getCurrentFloor()){
            System.out.println("Lift is moving up from "+lift.getCurrentFloor()+" to "+floor);
        }
        lift.setLiftState(new StoppedState());
    }
}
