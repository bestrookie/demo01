package demo07;

public class AdditionOperation extends BinaryOperation{
   public AdditionOperation(){
       generateBinaryOperation('+',new AdditionCoonstraint());
   }
    @Override
    int calculate(int left, int right) {
        return left+right;
    }
}
