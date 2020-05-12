package demo06.payInterFaceImpl.OnlinePayInterFaceImpl;

import demo06.payInterFace.OnlinePayInterFace.OnlinePayInterFace;

public class OnlinePayInterFaceImpl implements OnlinePayInterFace {
    @Override
    public void OnlinePayInterFace() {
        System.out.println("1.E_Bao支付");
        System.out.println("2.Bank_card");
        System.out.println("3.货到付款");
    }
}
