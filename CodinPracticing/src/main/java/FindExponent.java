import java.util.*;
import java.io.*;
import java.math.*;

/**
Write Tests and Validation Checking
 **/
class FindExponent {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Y = in.nextInt();
        int i = 0;
        boolean solve = false;

        while(solve == false){
            if(Math.pow(N,i) == Y){
                solve = true;
            } else{
                i++;
            }
        }

        System.out.println(i);
    }
}