package demo07;

import java.util.Objects;
import java.util.Random;

public abstract class BinaryOperation {
     int left_operand = 0;
     int right_operand = 0;
     int value = 0 ;
     char operator = '+';

    @Override
    public String toString() {
        return "BinaryOperation{" +
                "left_operand=" + left_operand +
                ", right_operand=" + right_operand +
                ", value=" + value +
                ", operator=" + operator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryOperation that = (BinaryOperation) o;
        return left_operand == that.left_operand &&
                right_operand == that.right_operand &&
                value == that.value &&
                operator == that.operator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left_operand, right_operand, value, operator);
    }

    private int getValidOperand(Coonstraints rule){
        Random random = new Random();
        return  random.nextInt(rule.UPPER+1) + rule.LOWER;
    }
    void generateBinaryOperation(char anOperator, Coonstraints rule){
        int left;
        int right;
        left = getValidOperand(rule);
        do{
            right =getValidOperand(rule);
        }while (!rule.checkCalculation(left,right));
        left_operand =left;
        right_operand = right;
        operator = anOperator;
    }
    abstract int calculate(int left,int right);
}
