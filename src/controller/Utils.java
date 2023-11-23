package controller;

public final class Utils {
    private Utils() {
    }

    public static void TODO() throws NotImplementedException {
        TODO("Not yet implemented");
    }

    public static void TODO(String message) throws NotImplementedException {
        throw new NotImplementedException(message);
    }

    public static void waitFor(int millis) throws RuntimeException{
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class NotImplementedException extends RuntimeException {
        public NotImplementedException() {
            super("Not yet implemented");
        }

        public NotImplementedException(String message) {
            super(message);
        }
    }
}
