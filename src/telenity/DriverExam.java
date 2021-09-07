package telenity;

public class DriverExam {
    public static void executeExercise(IExercise exercise) throws Exception {
        try {
            exercise.start();
            exercise.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            exercise.markNegativePoints();
        }
        exercise.end();
    }

    public static void main(String[] args) throws Exception {
        DriverExam.executeExercise(new Exercise());
    }
}

class Exercise implements IExercise {
    public void start() {
        System.out.println("Start");
    }

    public void execute() {
        System.out.println("Execute");
    }

    public void markNegativePoints() {
        System.out.println("MarkNegativePoints");
    }

    public void end() {
        System.out.println("End");
    }
}

interface IExercise {
    void start() throws Exception;

    void execute();

    void markNegativePoints();

    void end();
}