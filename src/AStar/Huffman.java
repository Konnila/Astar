package AStar;
import MinHeap.*;

public class Huffman {
    private IHeap heap;
    private final int size = 256; 
    
    public Huffman() {
        heap = new Heap(256);
    }
}
