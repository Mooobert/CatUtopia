public class GenerationException extends Exception {

    public GenerationException() {
        super("A level generation issue occured!");
    }

    public GenerationException(int code) {
        super("invalid level!");
    }
}