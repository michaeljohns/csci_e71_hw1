package edu.harvard.cscie71.hw1;

/**
 * Classic HelloWorld for java, implemented in a JUnit testable manner.
 *
 * Created by mjohns on 9/3/16.
 */
public class HelloWorld {

    final public static String HELLO_TEMPLATE = "Hello, %s!";

    /**
     * If a non-empty arg[0] is provided, then greet message is generated.
     *
     * @param args String[] expect args[0] to be a non-empty string.
     * @return String | null
     */
    public static String generateGreetMsg(String[] args){

        if (    args == null ||
                args.length < 1 ||
                args[0] == null ||
                args[0].trim().isEmpty()) {
            return null;
        }

        return String.format(HELLO_TEMPLATE,args[0]);
    }

    /**
     * Prints successful result from {@link #generateGreetMsg(String[])} to console. Otherwise,
     * prints instructions and exits with code = 1.
     *
     * @param args String[] expect args[0] to be a non-empty string.
     */
    public static void main(String [] args){

        String msg = generateGreetMsg(args);

        if (msg != null) {
            System.out.println(msg);
        } else {
            System.out.println("Provide a name and I will say 'Hello, <Your Name>!'");
            System.err.println("... if you don't provide me your name as an arg, how can I say Hello?");
        }
    }
}
