package demo06.shoppingCartInterface;

import demo06.bean.GoodsBean;
import demo06.bean.ShoppingCartBean;

import java.util.Collection;

public interface RemoveShopGoodInterFace {
    Collection<ShoppingCartBean> removeShopGood(Collection<GoodsBean> goodsBeans,int id,Collection<ShoppingCartBean> shoppingCartBeans);
}
