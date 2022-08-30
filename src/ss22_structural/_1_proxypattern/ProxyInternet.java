package ss22_structural._1_proxypattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private static List<String> blackList = new ArrayList<>();

    static {
        blackList.add("zalo");
        blackList.add("facebook");
    }

    private RealInternet realInternet = new RealInternet();

    @Override
    public void connectTo(String server) throws Exception {
        if (blackList.contains(server)) {
            throw new Exception("Không được truy cập vào server: " + server);
        }
        realInternet.connectTo(server);
    }
}
