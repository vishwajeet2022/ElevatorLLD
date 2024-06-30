package org.example;

public interface Observable {
    void addLift(Observer observer);
    void removeLift(Observer observer);
    void notifyLift(int floor);
}
