import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class BankTeller {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String transaction = in.next();
            int amount = in.nextInt();

            if(transaction.contains("D")){
                V += amount;
            } else if(transaction.contains("W")){
                V -= amount;
            }

        }

        System.out.print(V);
    }
}