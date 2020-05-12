package demo06.payInterFaceImpl;
import demo06.bean.ClientBean;
import demo06.bean.ShoppingCartBean;
import demo06.payInterFace.PayInerFace;
import demo06.shoppingCarInterFaceImpl.BrowseShoppingCartInterFaceImpl;
import demo06.shoppingCartInterface.BrowseShoppingCartInterFace;

import java.util.Collection;

public class PayInterFaceImpl implements PayInerFace{

    @Override
    public ClientBean payInterFace(Collection<ShoppingCartBean> shoppingCartBeans, ClientBean clientBean) {
        double sum = 0;
        BrowseShoppingCartInterFace a = new BrowseShoppingCartInterFaceImpl();
        a.BrowseShoppingCartInterFace(shoppingCartBeans);
        for (ShoppingCartBean i : shoppingCartBeans) {
            sum = i.getGoodPrice()+sum;
        }
        clientBean.setClientIntegral(sum);
        return clientBean;
    }
}
