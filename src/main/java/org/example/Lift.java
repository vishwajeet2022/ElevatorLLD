package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lift implements Observer{
    private MovingStrategy movingStrategy;
    private LiftState liftState;
    private int currentFloor;
    private LiftController controller;


    Lift(LiftController liftController){
        movingStrategy = new DefaultMovingStrategy();
        this.controller = liftController;
        this.liftState = new StoppedState();
        this.currentFloor = 0;
    }

    public void handleRequest(int floor) throws InvalidNumberEnteredException{
        if(floor<0){
            throw new InvalidNumberEnteredException("Invalid floor");
        }

        movingStrategy.move(this,floor);
        controller.notifyLift(floor);
    }

    public void setCurrentFloor(int floor){
        this.currentFloor = floor;
    }

    public int getCurrentFloor(){
        return this.currentFloor;
    }

    public void setLiftState(LiftState liftState){
        this.liftState = liftState;
    }

    public LiftState getLiftState(){
        return this.liftState;
    }

    public MovingStrategy getMovingStrategy(){
        return this.movingStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy){
        this.movingStrategy = movingStrategy;
    }

    @Override
    public void update(int floor) {
        System.out.println("Lift is in on "+floor);
    }
}
