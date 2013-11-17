package taojava.util;

import java.io.PrintWriter;

import java.util.Iterator;

/**
 * Some simple experiments with binary search trees.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class BSTExpt {
    // +--------+----------------------------------------------------------
    // | Fields |
    // +--------+

    /**
     * Output for our program.
     */
    static PrintWriter pen;

    /**
     * The current dictionary.
     */
    static BST<String,String> dict;

    // +------+------------------------------------------------------------
    // | Main |
    // +------+

    public static void main(String[] args) throws Exception {
        pen = new PrintWriter(System.out, true);
        dict = new BST<String,String>(new Comparator<String>() {
                   public int compare(String left, String right) {
                       return left.compareTo(right);
                   } // compare(String, String)
                });
        dict.dump(pen);
        expt("e", "elephant");
        expt("c", "chinchilla");
        expt("b", "baboon");
        expt("d", "dingo");
        expt("a", "aardvark");
        expt("g", "gibbon");
        expt("h", "hippo");
    } // main(String[])

    // +-----------+-------------------------------------------------------
    // | Utilities |
    // +-----------+

    /**
     * Add a key/value pair to the BST then print it out.
     */
    public static void expt(String key, String value) {
        pen.println("dict[" + key + "] = " + value);
        dict.set(key,value);
        dict.dump(pen);
        pen.println();
    } // expt(BST, PrintWriter, String, String)

    /**
     * Iterate the dictionary.
     */
    public static void iterate() {
        for (String key : dict.keys()) {
            pen.print(key + " ");
        } // for each key
        pen.println();
    } // iterate()
} // BSTExpt
