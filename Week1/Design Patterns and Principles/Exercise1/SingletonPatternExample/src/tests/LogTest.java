package tests;

import logs.Logger;

public class LogTest {
public static void main(String[] args) {
    Logger logger = Logger.getInstance();

    if(logger!=null){
        System.out.println("Test 1 Passed");
    }else{
        System.out.println("Test 1 Failed: Object is null");
    }

    Logger logger2 = Logger.getInstance();

    if(logger==logger2){
        System.out.println("Test 2 Passed");
    }
    else{
        System.out.println(logger);
        System.out.println(logger2);
        System.out.println("Test 2 Failed: Objects are not the same");
    }

    try{
        logger.printConsole();
        System.out.println("Test 3 Passed");
    }
    catch(Exception ex){
        System.out.println("Test 3 Failed: "+ex.getMessage());
    }
}
}
