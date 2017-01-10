import info.debatty.java.stringsimilarity.Cosine;
import info.debatty.java.stringsimilarity.Jaccard;
import info.debatty.java.stringsimilarity.JaroWinkler;
import info.debatty.java.stringsimilarity.Levenshtein;

public class SimilarityFunctions {

    public static boolean levenshtein(String from, String to, int threshold) {
        Levenshtein l = new Levenshtein();

        return l.distance(from, to) <= threshold;
    }

    public static boolean jaroWinkler(String from, String to, double threshold) {
        JaroWinkler jw = new JaroWinkler();

        return jw.distance(from, to) <= threshold;
    }

    public static boolean cosine(String from, String to, double threshold) {
        Cosine c = new Cosine();

        return c.distance(from, to) <= threshold;
    }

    public static boolean jaccard(String from, String to, double threshold) {
        Jaccard j = new Jaccard();

        return j.distance(from, to) <= threshold;
    }

}
