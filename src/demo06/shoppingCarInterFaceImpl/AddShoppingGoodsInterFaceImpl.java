package demo06.shoppingCarInterFaceImpl;

import demo06.bean.GoodsBean;
import demo06.bean.ShoppingCartBean;
import demo06.shoppingCartInterface.AddShoppingGoodsInterFace;

import java.util.Collection;

public class AddShoppingGoodsInterFaceImpl implements AddShoppingGoodsInterFace {

    @Override
    public Collection<ShoppingCartBean> addShoppingGoods(Collection<GoodsBean> goodsBeans, int id,
                                                         Collection<ShoppingCartBean> shoppingCartBeans) {
        ShoppingCartBean a = new ShoppingCartBean();
        for (GoodsBean goodsBean : goodsBeans) {
            if (goodsBean.getGoodId() == id){
                shoppingCartBeans.add((ShoppingCartBean) goodsBean);
            }
        }
        return shoppingCartBeans;
    }
}
