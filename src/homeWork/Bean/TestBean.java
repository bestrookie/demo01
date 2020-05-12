package homeWork.Bean;

/**
 * 测试题的抽象类
 */
public class TestBean {
    int key;
    int number1;
    int number2;
    String symbol;
    public TestBean(){

    }

    public TestBean(int key, int number1, int number2, String symbol) {
        this.key = key;
        this.number1 = number1;
        this.number2 = number2;
        this.symbol = symbol;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
