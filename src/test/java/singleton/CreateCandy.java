package singleton;
import java.util.logging.Logger;

public class CreateCandy {
   private  static final Logger logger = Logger.getLogger(CreateCandy.class.getName());
    public static void main(String[] args) {

        CandyMaker candy1=CandyMaker.getCandy();
       logger.info("Object1 address to show same object reference is called:" +candy1);
        candy1.fill();
        candy1.boil();
        candy1.drain();

        CandyMaker candy2=CandyMaker.getCandy();
        logger.info("Object2 address to show same object reference is called:" +candy2);
        candy2.fill();
        candy2.boil();
        candy2.drain();

    }
}
