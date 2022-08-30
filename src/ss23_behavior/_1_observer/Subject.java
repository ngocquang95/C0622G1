package ss23_behavior._1_observer;

public interface Subject {
    void note();
    void remove(Observer observer);
    void add(Observer observer);
    void postToFacebook();
}
