package memory.simulation;
/**
 *
 * @author karim
 */
public class Process {
    // Process Properties:
    private String pID;
    private final int pSize;
    private int base;
    private int pNoOfPages;
    private int limit;
    private boolean printed;
    
    // Process Constructors:
    public Process (String pID, int pSize, int pNoOfPages) {
        this.pID        = pID;
        this.pSize      = pSize;
        this.pNoOfPages = pNoOfPages;
    }
    
    public Process (String pID, int pSize) {
        this.pID   = pID;
        this.pSize = pSize;
    }
    
    // Process Properties Getters:
    public String getpID    () { return this.pID; }
    public int getpSize     () { return this.pSize; }
    public int getpNoOfPages() { return this.pNoOfPages; }
    public int getBase      () { return this.base; }
    public int getLimit     () { return this.limit; }
    public boolean isPrinted() { return this.printed; }
    
    public void setpID  (String id) { pID = id; }
    public void setBase (int base ) { this.base = base; }
    public void setLimit(int base, int size) { this.limit = base + size; }
    public void setPrinted (boolean state) { this.printed = state; }
    
    public String toString () {
        return String.format("["+this.pID+", "+this.pSize+"]");
    }
}
