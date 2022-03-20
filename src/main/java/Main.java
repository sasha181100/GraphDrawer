public class Main {
    public static void main(String[] args) {
        if (args == null || args.length != 2 || args[0] == null || args[1] == null) {
            System.err.println("Run with <drawing api: awt | fx> <graph type: list | matrix>");
            return;
        }

        new App().run(args[0], args[1]);
    }
}