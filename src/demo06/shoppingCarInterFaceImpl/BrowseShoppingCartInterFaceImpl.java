package demo06.shoppingCarInterFaceImpl;

import demo06.shoppingCartInterface.BrowseShoppingCartInterFace;
import demo06.bean.ShoppingCartBean;

import java.util.Collection;

public class BrowseShoppingCartInterFaceImpl implements BrowseShoppingCartInterFace {
    @Override
    public void BrowseShoppingCartInterFace(Collection<ShoppingCartBean> shoppingCartBeans) {
        for (ShoppingCartBean shoppingCart : shoppingCartBeans) {
            System.out.println("商品编号："+shoppingCart.getGoodId()+"商品名称："+shoppingCart.getGoodName()+
                    "价格："+shoppingCart.getGoodPrice()+"数量："
                    +shoppingCart.getGoodNumber());
        }
    }
}
