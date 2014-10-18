package Domain.Bean;

import java.util.ArrayList;
import java.util.List;

public class MonitorInfoBean {  
    
	/** Total Memory in JVM */ 
    private long totalMemory;       
    /** Free Memory in JVM*/ 
    private long freeMemory;        
    
    /** cpu use Ratio */ 
    private List<Double> cpuRatio = new ArrayList<Double>();  
  
    public long getFreeMemory() {  
        return freeMemory;  
    } 
    public long getTotalMemory() {  
        return totalMemory;  
    } 
    public long getUsedMemory() {  
    	return this.totalMemory-this.freeMemory;
    }  

    public void setMemory(long totalMemory, long freeMemory) {  
        this.totalMemory = totalMemory;  
        this.freeMemory = freeMemory;
    }  
     
    public List<Double> getCpuRatio() {  
        return cpuRatio;  
    }  
    public void addCpuRatio(double cpuRatio) {  
        this.cpuRatio.add(cpuRatio);  
    }
} 

