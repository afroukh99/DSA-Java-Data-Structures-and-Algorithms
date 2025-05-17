package Assignments;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class SocialNetwork {
    public static void main (String args[]) {
        In in = new In("log.txt");
        int N  = 50;

        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(N);

        while (!(in.isEmpty())) {
            String timeStamp = in.readString();
            int p = in.readInt();
            int q = in.readInt();

            weightedQuickUnionUF.union(p,q);

            if (weightedQuickUnionUF.count() == 1) {
                System.out.println("All members are connected at :" + timeStamp);
                return;
            }
        }
        System.out.println("All members were not connected!");
    }
}
