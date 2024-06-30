package org.example;

public class RequestCommand implements LiftCommand{
    Lift lift;
    int floor;

    RequestCommand(Lift lift,int floor){
        this.lift = lift;
        this.floor = floor;
    }

    @Override
    public void execute() {
        lift.handleRequest(floor);
    }
}
