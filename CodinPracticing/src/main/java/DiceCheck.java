import java.util.*;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Solution {

    private static final Logger logger = LogManager.getLogger(ReverseMode.class.getName());

    /*
    You are a DM and your players have a lot of dice rolls to perform.
    A 20-faced-die roll can be considered as:
    -a Criticall success is 20
    -a Critical failure is exactly 1
    in not the outcome is:
    - a success if it is above the expected value (also called DC) or equal to it
    - a failure if it is below the expected value
    You decide to write a script given the rolls will automatically tell you their outcomes, Success,
    Failure, Critical Success, or Critical Failure.
    Failure, Critical Success, or Critical Failure.
     */

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbRoll = in.nextInt();
        for (int i = 0; i < nbRoll; i++) {
            int roll = in.nextInt();
            int expected = in.nextInt();
            if(roll == 20){
                logger.info("Critical Success");
            } else if( roll == 1){
                logger.info("Critical Failure");
            }
            else if(roll >= expected){
                logger.info("Success");
            }
            else if (roll < expected){
                logger.info("Failure");
            }
        }

    }
}