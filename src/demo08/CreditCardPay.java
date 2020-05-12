package demo08;

public class CreditCardPay extends AbstractPay{
    @Override
    public void pay() {
        System.out.println("信用卡支付");
    }
}
