package demo07;

public class AdditionCoonstraint extends Coonstraints {
    @Override
    boolean checkCalculation(int left, int rigth) {
        return left + rigth <= UPPER;
    }

    @Override
    boolean checkRange(int number) {
        return false;
    }
}
