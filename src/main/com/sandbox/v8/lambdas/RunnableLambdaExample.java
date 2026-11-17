package main.com.sandbox.v8.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * Before Java 8
         * Anonymous Class generates a separate .class file on disk
         * Allocates a new heap object every single invocation
         */
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside Runnable One. Prior Java 8.");
            }
        };
        new Thread(runnable).start();

        /**
         * Modern Java 8 Lambda
         * Caller ---> [ () -> executeTask() ]
         * No extra .class file created on disk
         */
        Runnable runnableLambda = ()-> {
            System.out.println("Inside Runnable Two. Java 8 Lambda implementation.");
        };
        new Thread(runnableLambda).start();

        // Another way (when there's only one line to execute, we don't need {}
        Runnable anotherRunnableLambda = ()-> System.out.println("Runnable Three Lambda. No Braces,");
        new Thread(anotherRunnableLambda).start();
        // Direct invocation of Lambda in thread
        new Thread(()-> System.out.println("Runnable Four Lmabda. Direct invocation")).start();
        //Which method is more easy to debug?
    }
}
