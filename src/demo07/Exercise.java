package demo07;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class Exercise {
    HashSet<BinaryOperation> additionOperations = new HashSet<>();
    int count = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return count == exercise.count &&
                Objects.equals(additionOperations, exercise.additionOperations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additionOperations, count);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "additionOperations=" + additionOperations +
                ", count=" + count +
                '}';
    }

    /**
     * 生成一定数量的加法运算题
     */
     public void generateAdditionExercise(int number){
        for (additionOperations.size(); additionOperations.size() < number;) {
           BinaryOperation a = new AdditionOperation();
           additionOperations.add(a);
        }
        formateAndDisplay(count);
    }
    /**
     * 生成一定数量的减法运算提
     */
    public void generateSubstractExercise(int number){
        for (additionOperations.size(); additionOperations.size() < number;) {
            BinaryOperation a = new SubstractCoonstration();
            additionOperations.add(a);

        }
        formateAndDisplay(count);
    }
    /**
     * 生成一定数量的加减法运算题
     */
    public void generateBinaryExercise(int number){
        int ra;
        for (additionOperations.size(); additionOperations.size() < number;) {
            Random random = new Random();
            ra = random.nextInt(2);
            if (ra == 0){
                BinaryOperation a = new AdditionOperation();
                additionOperations.add(a);

            }
            if (ra == 1){
                BinaryOperation a = new SubstractCoonstration();
                additionOperations.add(a);

            }
        }
        formateAndDisplay(count);
    }
    /**
     *
     */
    public void formateAndDisplay(int count){
        int i = 0;
        int a;
        int b;
        char c;
        for (BinaryOperation operation : additionOperations) {
            System.out.print(operation.left_operand+""+operation.operator+""+operation.right_operand+"= ");
            i++;
            if (i == count){
                System.out.println();
                i = 0;
            }
        }
        System.out.println();
    }
}
