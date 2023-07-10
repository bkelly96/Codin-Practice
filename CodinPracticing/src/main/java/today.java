import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

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