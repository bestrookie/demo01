package demo06.payInterFace;

import demo06.bean.ClientBean;
import demo06.bean.ShoppingCartBean;

import java.util.Collection;

public interface PayInerFace {
    ClientBean payInterFace(Collection<ShoppingCartBean> shoppingCartBeans,ClientBean clientBean);

}
