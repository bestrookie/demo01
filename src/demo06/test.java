package demo06;

import demo06.InterFace.BrowseMyInfoInterFace;
import demo06.InterFaceImpl.BrowseMyInfoInterFaceImpl;
import demo06.bean.ClientBean;
import demo06.bean.GoodsBean;


public class test {
    public static void main(String[] args) {
        ClientBean cli = new ClientBean();
        cli.setClientName("张三");
        cli.setClientIntegral(100);
        BrowseMyInfoInterFace a = new BrowseMyInfoInterFaceImpl();
        a.browseMyInfo(cli);

    }
}
