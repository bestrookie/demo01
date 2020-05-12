package demo07;

public class SubstractCoonstration extends BinaryOperation {
    public SubstractCoonstration(){
        generateBinaryOperation('-',new SubstractCoonstraint());
    }
    @Override
    int calculate(int left, int right) {
        return left - right;
    }
}
