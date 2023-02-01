public class TryCatchFinallySample2{

    private static Logger logger = Logger.getLogger(TryCatchFinallySample2.class.getName());

    public static void main(String[] args){
        logger.setLevel(Level.ALL);
        try{
        logger.WARNING("Try");
        Integer.parselnt(args[0]);
        }catch(Exception e){
            logger.SEVERE("Catch");
        }finally{
            logger.INFO("Finally");
        }
    }
}