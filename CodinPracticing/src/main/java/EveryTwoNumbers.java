import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

class EveryTwoNumbers {

        private static final Logger logger = LogManager.getLogger(ReverseMode.class.getName());

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = 1;

        if(m == 1){
            logger.info(1);
        } else if(m <= 0){
            logger.info(0);
        } else{
            logger.info(1);
            for(int i = 1;i<m;i++){
                n+=2;
                if(n > m){
                    break;
                } else{
                    logger.info(" "+n);
                }
            }
        }
    }
}