package demo06.InterFaceImpl;

import demo06.InterFace.BrowseGoodsInterFace;
import demo06.bean.GoodsBean;

import java.util.Collection;

public class BrowseGoodsInterFaceImpl implements BrowseGoodsInterFace {
    @Override
    public void browseGoods(Collection<GoodsBean> goodsBeans) {
        for (GoodsBean goods : goodsBeans) {
            System.out.println("商品编号："+goods.getGoodId()+"商品名称："+goods.getGoodName()+"价格："+goods.getGoodPrice()+"库存："
                    +goods.getGoodNumber());
        }
    }
}
