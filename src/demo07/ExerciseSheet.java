package demo07;

public class ExerciseSheet {
    public static void main(String[] args) {
        Exercise a = new Exercise();
        a.count = 5;
        a.generateAdditionExercise(40);
        System.out.println("=====================================");
        Exercise b = new Exercise();
        b.count = 6;
        b.generateAdditionExercise(40);
        System.out.println("==========================================");
        Exercise c = new Exercise();
        c.count = 5;
        c.generateBinaryExercise(30);
        System.out.println("=====================================");
        Exercise d = new Exercise();
        d.count = 5;
        d.generateBinaryExercise(30);

    }
}
