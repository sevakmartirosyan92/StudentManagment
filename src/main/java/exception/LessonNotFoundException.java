package exception;

public class LessonNotFoundException extends Exception {

    public LessonNotFoundException() {
    }

    public LessonNotFoundException(String message) {
        super(message);
    }
}