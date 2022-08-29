package ss21_design_pattern._2_factory_method;

public class BankFactory {
    /**
     * @param type = 1 => TPBank, 2 => VietComBank
     * @return Bank
     */
    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietComBank();
            default:
                return null;
        }
    }
}
