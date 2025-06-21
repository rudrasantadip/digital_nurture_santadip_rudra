package logs;

public class Logger {

    /*
     * private -> such that the field would not be accessible outside its own class
     * final -> such that in cannot be modified further
     * static -> no object instance of it can be created
     */
    private static Logger INSTANCE;

    private Logger() {

    }

    public static Logger getInstance() {

        if(INSTANCE==null){
            INSTANCE=new Logger();
        }
        return INSTANCE;
    }

    public void printConsole(){
        System.out.println("Taking logs..");
    }

}
