package memory.simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author loay
 */
public class NonContig {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String ProcessName;
        int ProcessPageNumber;
        int MemoryFrames;
        int y; 
        
        List <ProcessNon> ProcessList = new ArrayList <> (); 
        List<String> ProcessDetectedNames = new ArrayList <> (); 
        
        Scanner input = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        
        System.out.println("Enter The Memory Frames Number ? " );
        MemoryFrames =input.nextInt();
        memoryToFrames(MemoryFrames);
        
        do{
        System.out.println("Enter The Process Name ? " );
        ProcessName= string.nextLine();
        ProcessDetectedNames.add(ProcessName);
        
        System.out.println("Enter The Process Page Number ? " );
        ProcessPageNumber =input.nextInt();
      
        
        for (int i=0; i < ProcessPageNumber ;i++){
            ProcessList.add(new ProcessNon(ProcessName, i));
            
        }  
        
        System.out.println("Do You Want To Add Another Process " );
         
         y= input.nextInt();
        
        } while (y == 1 );
        addPagesToMemory(memoryToFrames(MemoryFrames),ProcessList,ProcessDetectedNames);
    }
    
    
     public static List memoryToFrames (int Frames){
     
        List<ProcessNon> memory = new ArrayList<>();
        
        for (int i = 0;i<Frames;i++){
            
            memory.add(null);
        }
        return memory;
    }
     
     public static void addPagesToMemory (List memo,List proc,List detectedList){
        
         int memorysatus = memo.size();
         List <ProcessNon> memory = memo;
         List <ProcessNon> Processinmemory = proc;
         Map< Integer,ProcessNon> pageTable = new HashMap<>();
        List <Integer> rand = RandomList(memo.size());
        
        for (int i =0 ;i<Processinmemory.size();i++){
           
            if(memorysatus > 0){ 
      
        memory.set(rand.get(i) , Processinmemory.get(i));
        
        pageTable.put(rand.get(i) ,Processinmemory.get(i) );
        memorysatus -- ;
            }
            else
            {
                
                
                 displayList(memory,detectedList);
                 
                 System.out.println(memory);
        
                System.out.println("Memory Is Full");
                
                return;
            }
        
        
        }
       
       displayList(memory,detectedList);
        System.out.println(memory);
          
}
     
     public static List RandomList (int memosize){
         
         List <Integer> randomList = new ArrayList <> (); 
         int m = memosize;
         
         Random randomGenerator = new Random();
         while (m !=0) {

          int random = randomGenerator .nextInt(memosize) + 0; 
           if (!randomList.contains(random)) {
            randomList.add(random);
            m--;
    }
}
         
         return randomList;
     }
     
     public static void displayList (List <ProcessNon> memorylist,List <String> detected) {
         for (int i=0; i<detected.size(); i++){
             String currProName = detected.get(i);
             for(int j=0; j<memorylist.size(); j++){
                 if ( memorylist.get(j) != null){
                 String currPro = memorylist.get(j).getprocessName();
                 if(currPro.equals(currProName)){
                     System.out.println("Process: " + currPro + " ,page: " + memorylist.get(j).getProcessPageNumber()
                      + ", in frame: " + memorylist.indexOf(memorylist.get(j)));
                 }
                 } //else {System.out.println("null");}
                
             }
             System.out.println();
         }
     }
     
     
     
     
     public static List <String> resultList;
     public static void displayListtt (List <ProcessNon> memorylist,List <String> detected) {
         
         for (int i=0; i<detected.size(); i++){
             String currProName = detected.get(i);
             for(int j=0; j<memorylist.size(); j++){
                 if ( memorylist.get(j) != null){
                 String currPro = memorylist.get(j).getprocessName();
                 if(currPro.equals(currProName)){
                     System.out.println("Process: " + currPro + " ,page: " + memorylist.get(j).getProcessPageNumber()
                      + ", in frame: " + memorylist.indexOf(memorylist.get(j)));
                     resultList.add("Process: " + currPro + " ,page: " + String.valueOf(memorylist.get(j).getProcessPageNumber())
                      + ", in frame: " + String.valueOf(memorylist.indexOf(memorylist.get(j))));
                 }
                 } else System.out.println("null");
                
             }
             System.out.println();
         }
     }
       
     
}

    