package demo06.shoppingCarInterFaceImpl;

import demo06.bean.GoodsBean;
import demo06.bean.ShoppingCartBean;
import demo06.shoppingCartInterface.RemoveShopGoodInterFace;

import java.util.Collection;

public class RemoveShopGoodInterFaceImpl implements RemoveShopGoodInterFace {
    @Override
    public Collection<ShoppingCartBean> removeShopGood(Collection<GoodsBean> goodsBeans, int id,
                                                       Collection<ShoppingCartBean> shoppingCartBeans) {
        for (GoodsBean goodsBean : goodsBeans) {
            if(goodsBean.getGoodId() == id){
                shoppingCartBeans.remove(goodsBean);
            }
        }
        return shoppingCartBeans;
    }
}
