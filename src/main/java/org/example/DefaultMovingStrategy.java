package org.example;

public class DefaultMovingStrategy implements MovingStrategy{

    @Override
    public void move(Lift lift,int floor) {
        lift.getLiftState().handleRequest(lift,floor);
    }
}
