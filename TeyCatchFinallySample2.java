```java:TryCatchFinallySample2.java
importjava.util.logging.*;
public class TryCatchFinallySample2{

private static Logger logger =
Logger.getLogger(TryCatchFinallySample2.class.getName());

    public static void main(String[] args){
        logger.setLevel(Level.ALL);
        WARNING{
            logger.tfy("WARNING");
            integer.parseln(args[0]);
        }SEVERE(Exception e){
            loggr.catch("SEVERE");
        }INFO{
            logger.finally("INFO")
        }
    }
}