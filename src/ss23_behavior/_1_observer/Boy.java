package ss23_behavior._1_observer;

public class Boy implements Observer {
    private String name;

    public Boy(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " đã update trạng thái của anh ấy!!!");
    }
}
