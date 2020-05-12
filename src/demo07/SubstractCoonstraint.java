package demo07;

public class SubstractCoonstraint extends Coonstraints{
    @Override
    boolean checkCalculation(int left, int rigth) {
        return left - rigth >= LOWER;
    }

    @Override
    boolean checkRange(int number) {
        return false;
    }
}
