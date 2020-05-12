package demo06.InterFaceImpl;

import demo06.InterFace.BrowseMyInfoInterFace;
import demo06.bean.ClientBean;

public class BrowseMyInfoInterFaceImpl implements BrowseMyInfoInterFace {
    @Override
    public void browseMyInfo(ClientBean clientBean) {
        System.out.println(clientBean.getClientName());
        System.out.println(clientBean.getClientIntegral());
    }
}
