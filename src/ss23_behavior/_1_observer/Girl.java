package ss23_behavior._1_observer;

import java.util.ArrayList;
import java.util.List;

public class Girl implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void note() {

    }



    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void postToFacebook() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
