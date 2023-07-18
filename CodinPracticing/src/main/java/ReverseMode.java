import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class ReverseMode {

    private static final Logger logger = LogManager.getLogger(ReverseMode.class.getName());

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


       logger.info(a*c+b + " " + c);




    }
}