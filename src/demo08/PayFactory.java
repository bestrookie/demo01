package demo08;

public class PayFactory {
    public static AbstractPay getPaymethod(String arg){
        AbstractPay pay = null;
        switch (arg){
            case "cash":
                pay = new CashPay();
                break;
            case "card":
                pay = new CreditCardPay();
                break;
        }
        return pay;
    }
}
