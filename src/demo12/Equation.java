package demo12;

public class Equation {
    private int left;
    private int right;
    private char opr;

    @Override
    public String toString() {
        return "Equation{" +
                "left=" + left +
                ", opr=" + opr +
                ", right=" + right +
                '}';
    }

    public Equation(int left, int right, char opr) {
        this.left = left;
        this.right = right;
        this.opr = opr;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public char getOpr() {
        return opr;
    }

    public void setOpr(char opr) {
        this.opr = opr;
    }
}
