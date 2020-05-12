package homeWork.service;

import homeWork.dao.automaticTestDao;
import homeWork.dao.AutomaticTestDaoImpl;

public class automaticTestServiceImpl implements automaticTestService {
    @Override
    public void automaticTest() {
        automaticTestDao automatic = new AutomaticTestDaoImpl();
        automatic.automaticTest();
    }
}
