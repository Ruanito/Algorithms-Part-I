import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        Integer probability = 0;
        String champion = "";
        String word = "";


        do {
            word = StdIn.readString();
            probability += 1;
            if (StdRandom.bernoulli(1.0 / probability)) champion = word;
        } while (!StdIn.isEmpty());


        StdOut.println(champion);
    }
}
