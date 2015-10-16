public class Heap {
    
    /** The first hole in the heap */
    public MemControlBlock firstBlock;
    
    /** Create a heap, with holes of sizes as given in the array
     */
    public Heap(int[] holes) {
        
        firstBlock = new MemControlBlock(holes[0]);
        MemControlBlock previousBlock = firstBlock;
        
        for (int i = 1; i < holes.length; ++i) {
            MemControlBlock nextBlock = new MemControlBlock(holes[i]);
            previousBlock.next = nextBlock;
            nextBlock.previous = previousBlock;
            
            previousBlock = nextBlock;            
        }
    }
    
    /** For debugging: print out a string representation of the heap
     * 
     * You can change the code in this method.  It just prints out the first block */
    public String toString() {
        // You can change the implementation of this if you want, but there are no marks for doing so
        // This presently just prints out the first block        
        return "A heap, with the first memory control block as " + firstBlock;
    }
    
    /** Your implementation of best-fit-first
     *
     * All your code must go in this method.  You must not change the method signature.
     * 
     * @return True if the memory request was successful (there was a hole big enough)
     *         False if the memory request was not successful (there was no hole big enough)
     */
    public boolean requestMemoryBestFit(int allocationSize) {
    	MemControlBlock curr = firstBlock ;
    	MemControlBlock selected = null;
    	while(curr != null){
    		if(curr.available == true && allocationSize <= curr.size){		
    			if( selected == null ||curr.size  < selected.size){
        			selected = curr;
    			}
    		}
    		curr = curr.next;	
    	}
    	
    	if(selected == null){
    		return false;
    	}
    	else{
    		selected.size = allocationSize;
    		MemControlBlock newMcb = new MemControlBlock(selected.size - allocationSize - selected.SIZE_OF_MEMORY_CONTROL_BLOCK);
    		newMcb.next = selected.next;
    		newMcb.previous = selected; 
    		return true;
    	}
        // TODO all your code must go here - do not change any code elsewhere
        // (except if you want to change toString(), which you can if you want)
    }
}
