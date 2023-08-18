public class Task {

    public static void main(String[] args) {
        System.out.println(new Task().message("[ERROR]: Invalid operation"));
        System.out.println(new Task().logLevel("[ERROR]: Invalid operation"));
        System.out.println(new Task().reformat("[INFO]: Operation completed"));
    }
    public String message(String logLine) {
        /* 1. Get message from a log line */
    }

    public String logLevel(String logLine) {
        /* 2. Get log level from a log line */
    }

    public String reformat(String logLine) {
        /* 3. Reformat a log line */
    }
}
