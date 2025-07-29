package vectors;
import java.util.Vector;

public class vectors_01 {
    public static void main(String[] args) {
        // Initiate a vector (ArrayList in Java)
        Vector<Integer> vector = new Vector<>();
        // Example: add elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);
        Vector<Integer> vector2 = new Vector<>();
        // Example: add elements
        vector2.add(40);
        vector2.add(50);
        vector2.add(60);
        for(int i : vector2){
            System.out.println("Element: " + i);
        }
        System.out.println("Vector2: " + vector2);
        System.out.println("Size of vector: " + vector.size());
    }
}
