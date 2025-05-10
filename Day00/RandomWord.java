import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = StdIn.readString();
        String challenger = "";
        int count = 1;

        if (StdIn.isEmpty()) {
            System.out.println("No Input received !");
            return;
        }

        while (!StdIn.isEmpty()) {
            challenger = StdIn.readString();
            count++;
            if (StdRandom.bernoulli(1.00 / count)) {
                champion = challenger;
            }
        }

        StdOut.println("\nFinal randomly selected word: \"" + champion + "\"");

    }
}
