package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class RBTreeTest {
    @Test
    void treeExists(){
        RBTree tree = new RBTree();
        assertNotNull(tree);
    }


    public static void main(String[] args) {
        RBTree rbTree = new RBTree();
        // Wstawiamy kilka elementów do drzewa
        rbTree.insert(10, 100);
        rbTree.insert(5, 50);
        rbTree.insert(15, 150);
        rbTree.insert(3, 30);
        rbTree.insert(7, 70);
        rbTree.insert(12, 120);
        rbTree.insert(18, 180);
        // Wyświetlamy wysokość drzewa
        System.out.println("Wysokość drzewa: " + rbTree.getHeight());
        // Wyszukujemy i wyświetlamy wartości dla kilku kluczy
        System.out.println("Wartość dla klucza 5: " + rbTree.getValue(5));
        System.out.println("Wartość dla klucza 15: " + rbTree.getValue(15));
        System.out.println("Wartość dla klucza 12: " + rbTree.getValue(12));
        // Usuwamy kilka elementów z drzewa
        rbTree.removeNode(5);
        rbTree.removeNode(15);
        // Wyświetlamy wysokość drzewa po usunięciu
        System.out.println("Wysokość drzewa po usunięciu: " + rbTree.getHeight());
        // Wyszukujemy i wyświetlamy wartości po usunięciu
        System.out.println("Wartość dla klucza 5 po usunięciu: " + rbTree.getValue(5));
        System.out.println("Wartość dla klucza 15 po usunięciu: " + rbTree.getValue(15));
    }
}
