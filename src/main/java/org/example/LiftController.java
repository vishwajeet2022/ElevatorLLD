package org.example;

import java.util.ArrayList;
import java.util.List;

public class LiftController implements Observable{
    private List<Lift> lifts;
    private List<Observer> observerList;

    LiftController(){
        this.lifts = new ArrayList<>();
        this.observerList = new ArrayList<>();
    }
    @Override
    public void addLift(Observer observer) {
        lifts.add((Lift) observer);
        observerList.add(observer);
    }

    @Override
    public void removeLift(Observer observer) {
        lifts.remove((Lift) observer);
        observerList.remove(observer);
    }

    @Override
    public void notifyLift(int floor) {
        for(Observer observer : observerList){
            observer.update(floor);
        }
    }

    public void requestLift(int floor){
        if(lifts.get(0)==null){
            System.out.println("No lifts available");
        }
        Lift bestLift = lifts.get(0);

        for(Lift lift : lifts){
            if(Math.abs(lift.getCurrentFloor()-floor)<bestLift.getCurrentFloor()-floor){
                bestLift = lift;
            }
        }

        new RequestCommand(bestLift,floor).execute();
    }
}
