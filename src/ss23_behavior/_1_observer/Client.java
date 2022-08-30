package ss23_behavior._1_observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Girl();

        subject.add(new Boy("Mậu Hoàng"));
        subject.add(new Boy("Hoàng Duy"));
        subject.add(new Boy("Vịnh"));
        subject.add(new Boy("Giang"));

        subject.postToFacebook();
    }
}
