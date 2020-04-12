package singleton;


import java.util.logging.Logger;

 class CandyMaker {

   private Logger logger = Logger.getLogger(CandyMaker.class.getName());

    private static CandyMaker myCandy;

    private boolean empty;
    private boolean boiled;
    private CandyMaker() {
        if (myCandy != null) {
            throw new RuntimeException("This is not supposed way of calling me.  Call my getCandy()");
        }
        empty = true;
        boiled = false;

    }

    static synchronized CandyMaker getCandy(){

        if(myCandy==null)
        {
            myCandy=new CandyMaker();
        }
        return myCandy;

    }

     void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            logger.info("fill the candyMaker with milk and chocolate mix");
        }
    }

     void drain() {
        if (!isEmpty() && isBoiled()) {
            logger.info("drain the boiled milk and chocolate");
            empty = true;
        }
    }

     void boil() {
        if (!isEmpty() && !isBoiled()) {
            logger.info("bring the content to boil");
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}