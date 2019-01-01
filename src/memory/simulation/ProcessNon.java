/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.simulation;

/**
 *
 * @author loay
 */

public  class ProcessNon {
        //private int processId;
        private String processName;
        private int ProcessPageNumber;
        
        public   ProcessNon( String processName,int ProcessPageNumber ){
            
            this.processName = processName;
            this.ProcessPageNumber = ProcessPageNumber;
        }
        
        public String getprocessName()
	{
		return processName;
	}

	public int getProcessPageNumber()
	{
		return ProcessPageNumber;
	}
        
        public String toString () {
            return String.format("process name : " + this.processName + ", page no. : " + this.ProcessPageNumber);
        }
    
}
