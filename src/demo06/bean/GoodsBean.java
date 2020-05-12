package demo06.bean;

public class GoodsBean {
    private int goodId;
    private String goodName;
    private double goodPrice;
    private int goodNumber;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(int goodNumber) {
        this.goodNumber = goodNumber;
    }

    @Override
    public String toString() {
        return "GoodsBean{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodNumber=" + goodNumber +
                '}';
    }
}
