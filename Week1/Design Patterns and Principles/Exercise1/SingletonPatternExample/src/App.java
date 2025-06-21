import logs.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        //the two different instances are called together to ensure if they hold the same object
        System.out.println(logger1);
        System.out.println(logger2);
 
    }
}
