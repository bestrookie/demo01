package demo08;

public class CashPay extends AbstractPay{
    @Override
    public void pay() {
        System.out.println("现金支付");
    }
}
