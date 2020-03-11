package homeWork.service;

import homeWork.dao.automaticTestDao;
import homeWork.dao.automaticTestDaoImpl;

public class automaticTestServiceImpl implements automaticTestService {
    @Override
    public void automaticTest() {
        automaticTestDao automatic = new automaticTestDaoImpl();
        automatic.automaticTest();
    }
}
