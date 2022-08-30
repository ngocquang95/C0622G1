package ss22_structural._2_facade_pattern.facade;

import ss22_structural._2_facade_pattern.service.PayService;
import ss22_structural._2_facade_pattern.service.SendMailService;
import ss22_structural._2_facade_pattern.service.ShippingService;

public class Facade {
    private PayService payService = new PayService();
    private SendMailService sendMailService = new SendMailService();
    private ShippingService shippingService = new ShippingService();

    public void pay(String mail) {
        sendMailService.sendMail(mail);
        shippingService.ship();
        payService.pay();
    }
}
