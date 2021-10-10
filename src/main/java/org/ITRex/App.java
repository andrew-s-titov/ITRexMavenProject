package org.ITRex;

public class App {
    public static final String greeting = "Hello, %s!";
    public static final String indents = "- - - - - - -\n%s\n- - - - - - -";

    public static void main(String[] args) {
        if (args.length > 0 && !args[0].isBlank()) {
            System.out.printf(indents, createGreeting(args[0]));
        }
        else {
            System.out.printf(indents, createGreeting("Noname"));
        }
    }

    public static String createGreeting(String name) {
        return String.format(greeting, name);
    }
}