public class TryCatchFinallySample2{

private static logger logger =
Logger.getLogger(TryCatchFinallySample2.class.getName());

    public static void main(String[] args){
        logger.setLevel(Level.ALL);
        try{
            logger.warning("Try");
            Integer.parseInt(args[0]);
        }catch(Exception e){
            logger.severe("Catch");
        }finally{
            logger.info("Finally");
        }
    }
}