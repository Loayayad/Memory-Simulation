package memory.simulation;
/**
 *
 * @author karim
 */
public class Hole {
    
    private int holeIDX;
    private int holeSize;
    
    public Hole (int idx, int size) {
        this.holeIDX = idx;
        this.holeSize = size;
    }
    
    public void setHoleIDX (int index) { this.holeIDX = index; }
    public void setholeSize (int size) { this.holeSize = size; }
    
    public int getholeIDX () { return this.holeIDX; }
    public int getholeSize() { return this.holeSize; }
}
