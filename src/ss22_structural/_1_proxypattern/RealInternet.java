package ss22_structural._1_proxypattern;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String server) {
        System.out.println("Đã connect tới server: " + server);
    }
}
