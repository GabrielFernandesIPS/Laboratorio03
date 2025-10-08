package pt.pa;

import pt.pa.adts.Position;
import pt.pa.adts.TreeLinked;

/**
 *
 * @author amfs
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeLinked<String> tree = new TreeLinked<>("Ecosystem");
        Position<String> root = tree.root();
        //Anchovy
        tree.insert(root, "Anchovy");
        //Tuna
        Position<String> tuna = tree.insert(root, "Tuna");
        //Tuna Children
        Position<String> mackerel = tree.insert(tuna, "Mackerel");

        Position<String> barracuda = tree.insert(tuna, "Barracuda");
        tree.insert(barracuda, "Sardine");

        //Shark
        Position<String> shark = tree.insert(root, "Shark");
        //Shark Children
        tree.insert(shark, "Dolphin");

        //Eagles
        Position<String> eagles = tree.insert(root, "Eagles");
        //Eagles Children
        tree.insert(eagles, "Snakes");
        tree.insert(eagles, "Rabbits");

        System.out.println(tree.toString());
        System.out.println("Degree: " + tree.degree(root));
    }


}
