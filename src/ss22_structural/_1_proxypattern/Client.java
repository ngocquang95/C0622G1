package ss22_structural._1_proxypattern;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet();

        internet.connectTo("james");
    }
}
