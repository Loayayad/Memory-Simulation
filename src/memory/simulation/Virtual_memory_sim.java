package memory.simulation;

import java.util.*;

/**
 *
 * @author karim
 */
public class Virtual_memory_sim {
    static int frames [] ={-1,-1,-1,-1};
   static int sequence_length;
   int sequence [] =new int [sequence_length];
   public static int page_faults=0;
   static int number_of_pages;
   
   public ArrayList <String> virtualList = new ArrayList<>();
   
    Virtual_memory_sim(int n_pages,int n_seq)
    {
        sequence_length=n_seq;
        number_of_pages=n_pages;
    }
    
//------------------------------------------------------------------------
    
     public class node{
       int id;
       node next;
       node previous;
       int valid_bit=0;
       int frame_indx;
       
       node (int i)
       {
           id=i;
       }
       
   }
     
 //-----------------------------------------------------------------------
     
   public  class doubly_LinkList{
        node first;
        node last ;
        
       doubly_LinkList()
       {
            first = null;                  
            last = null; 
       }
        
        public  boolean ISEmpty()
        {
          return (first==null);
        }
        
 //----------------------------------------------------------------------       
    
    public  void Allocate(int seq[])
    {
        int x;
          
        for(int i=0;i<sequence_length;i++)
        {
            int allocated=0;
            x=seq[i];
             for(int y=0;y<4;y++)
             {
                  if(x==frames[y])
                 {
                     allocated=1;
                     reset_stack(x,y);
                     
                 }
                 if(frames[y]==-1)
                 {
                     allocated=1;
                     allocate_frame(y,x);
                     page_faults++;
                     break;
                 }
                
             }
             
            if (allocated==0) 
            {
                page_faults++;
               replace_with_victim(x);
            }
        }
    }
        
 //---------------------------------------------------------------------- 
        
    public  void insertFirst(int i, int indx)
    { 
      
       node recently_used=new node(i);
       
        if( ISEmpty() )                
           last = recently_used; 
       
        else 
            first.previous = recently_used;
        
        recently_used.next = first;
        first = recently_used; 
        recently_used.valid_bit=1;
        recently_used.frame_indx=indx;
    }
   
 //----------------------------------------------------------------------   
    
   public node deletepage(int key)
   {
        node current = first;
       if(!ISEmpty()){
   
      
       while(current.id != key) 
       {
            current = current.next;
           if(current == null) return null; 
       }
       if(current!=first){
       current.previous.next = current.next;
       if(current==last)   
           last = current.previous; 
       else
           current.next.previous = current.previous;
       }
       }
       return current;
   }
   
//-----------------------------------------------------------------------    
   
    public void reset_stack(int page,int indx)
    {
            deletepage(page);
            insertFirst(page,indx);
    }
    
//-----------------------------------------------------------------------    
    
    public int select_victim()
    {    int victim=0,f=0;
         node current = last;
          while(current != null){
             for(int y=0;y<4;y++)
             {
                 if(current.id==frames[y])
                 {
                     victim=y;
                     current.valid_bit=0;
                      f=1;
                      break;
                 }
             }
             if(f==1)
                 break;
             else
             current=current.previous;
             
          }
         return victim; 
    }
    
//-----------------------------------------------------------------------    
    
    public  void allocate_frame(int indx,int page)
    {
        frames[indx]=page;
        reset_stack(page,indx);
        
    }
    
//----------------------------------------------------------------------- 
    
    public void replace_with_victim(int page)
    {
        int victim = select_victim();
        allocate_frame(victim,page);
    }
      
//-----------------------------------------------------------------------    
       
    public void displayForward(){
        node current = first; 
         while(current != null)         
         {   
             if(current.valid_bit==1){
             System.out.println(current.id+" valid : "+current.valid_bit+" in frame : "+current.frame_indx );
             virtualList.add(current.id+" valid : "+current.valid_bit+" in frame : "+current.frame_indx);
             }
             else{
                 System.out.println(current.id+" valid : "+current.valid_bit);
                 virtualList.add(current.id+" valid : "+current.valid_bit);
             }
              current = current.next;  
            } 
        System.out.println("page faults = " + page_faults);
         }
        
    }

//---------------------------------------------------------------------   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("Enter number of pages");
        Scanner input = new Scanner(System.in);
         int n = input.nextInt(); 
          System.out.println("Enter size of sequence");
           int y = input.nextInt(); 
         
          System.out.println("Enter sequence");
          int arr[]=new int [y];
          for(int i=0; i<y;i++)
          {
              int b = input.nextInt(); 
              arr[i]=b;
          }
          Virtual_memory_sim obb=new Virtual_memory_sim(n,y);
          // int srr [] ={1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
         Virtual_memory_sim.doubly_LinkList mm = obb.new doubly_LinkList();
         mm.Allocate(arr);
         mm.displayForward();
    }
}
