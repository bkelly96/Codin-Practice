import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

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
                System.out.println("Critical Success");
            } else if( roll == 1){
                System.out.println("Critical Failure");
            }
            else if(roll >= expected){
                System.out.println("Success");
            }
            else if (roll < expected){
                System.out.println("Failure");
            }
        }

    }
}