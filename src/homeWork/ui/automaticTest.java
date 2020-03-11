package homeWork.ui;

import homeWork.service.automaticTestService;
import homeWork.service.automaticTestServiceImpl;

/**
 * 模拟用户界面
 */
public class automaticTest {
    public static void main(String[] args) {
        automaticTestService automatic = new automaticTestServiceImpl();
        automatic.automaticTest();
    }
}
