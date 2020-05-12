package demo06.shoppingCartInterface;

import demo06.bean.GoodsBean;
import demo06.bean.ShoppingCartBean;

import java.util.Collection;

public interface AddShoppingGoodsInterFace {
    Collection<ShoppingCartBean> addShoppingGoods(Collection<GoodsBean> goodsBeans,int id, Collection<ShoppingCartBean> shoppingCartBeans);
}
