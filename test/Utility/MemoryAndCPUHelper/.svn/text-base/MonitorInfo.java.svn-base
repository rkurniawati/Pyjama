package Utility.MemoryAndCPUHelper;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;  
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;  

import Domain.Bean.MonitorInfoBean;

public class MonitorInfo{  
    private MonitorInfoBean infoBean = new MonitorInfoBean();  
    public MonitorInfoBean getMonitorInfoBean(){  
        int mb = 1024*1024;  
        
        long totalMemory = Runtime.getRuntime().totalMemory() / mb;    
        long freeMemory = Runtime.getRuntime().freeMemory() / mb;     
        
        getCpuRateForLinux();
       
        infoBean.setMemory(totalMemory, freeMemory);  
        return infoBean;  
    }  
   
    public void getCpuRateForLinux(){  
        InputStream is = null;  
        InputStreamReader isr = null;  
        BufferedReader br = null;  
        StringTokenizer tokenStat = null;  
        try{  
        	// start up the command in child process
            String cmd = "cat /proc/stat";
            String line;int index =0;
            Process p = Runtime.getRuntime().exec(cmd);
           
            is = p.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);             
            List<Long> totals1 = new ArrayList<Long>();
            List<Long> idles1 = new ArrayList<Long>();
            
    		while ((line = br.readLine()) != null && line.startsWith("cpu") ) {
    			//System.out.println(line);
    			tokenStat = new StringTokenizer(line);  
    			tokenStat.nextToken();//String name    	
    			long user = Long.parseLong(tokenStat.nextToken());
                long nice = Long.parseLong(tokenStat.nextToken());
                long system = Long.parseLong(tokenStat.nextToken());    			
                long idle = Long.parseLong(tokenStat.nextToken());       
                long iowait = Long.parseLong(tokenStat.nextToken());
                long irq = Long.parseLong(tokenStat.nextToken());
                long softirq = Long.parseLong(tokenStat.nextToken());
                long total = user+nice+system+iowait+irq+softirq+idle;
                idles1.add(idle);
                totals1.add(total);
                index++;
    		}
    		
    		Thread.sleep(100);
    		
    		p = Runtime.getRuntime().exec(cmd);
            
            is = p.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);             
            List<Long> idles2 = new ArrayList<Long>();
            List<Long> totals2 = new ArrayList<Long>();
            
    		while ((line = br.readLine()) != null  && line.startsWith("cpu")) {
    			//System.out.println(line);
    			tokenStat = new StringTokenizer(line);  
    			tokenStat.nextToken();//String name    	
    			long user = Long.parseLong(tokenStat.nextToken());
                long nice = Long.parseLong(tokenStat.nextToken());
                long system = Long.parseLong(tokenStat.nextToken());    			
                long idle = Long.parseLong(tokenStat.nextToken());       
                long iowait = Long.parseLong(tokenStat.nextToken());
                long irq = Long.parseLong(tokenStat.nextToken());
                long softirq = Long.parseLong(tokenStat.nextToken());
                long total = user+nice+system+iowait+irq+softirq+idle;
                idles2.add(idle);
                totals2.add(total);
    		}
    		for (int i = 0; i < index; i++) {
				long total = totals2.get(i)-totals1.get(i);
				long idle = idles2.get(i)-idles1.get(i);
				double pcpu =100 * (double)(total-idle)/(double)total;
				infoBean.addCpuRatio(Math.round(pcpu*100.0)/100.0);
			}              
        } catch(Exception e){  
            e.printStackTrace();
            freeResource(is, isr, br);    
        } finally{  
            freeResource(is, isr, br);  
        }  
    }  
    private static void freeResource(InputStream is,  InputStreamReader isr, BufferedReader br){  
        try{  
            if(is!=null)  
                is.close();  
            if(isr!=null)  
                isr.close();  
            if(br!=null)  
                br.close();  
        }catch(Exception e){  
        	e.printStackTrace(); 
        }  
    }  
      

    public static void main(String[] args) throws Exception {  
    	MonitorInfo service = new MonitorInfo();  
        MonitorInfoBean monitorInfo = service.getMonitorInfoBean();  
        System.out.println("cpu Ratio=" + monitorInfo.getCpuRatio());  
         
        System.out.println("Availble memory=" + monitorInfo.getTotalMemory());  
        System.out.println("Free memory=" + monitorInfo.getFreeMemory());  
        System.out.println("Max availble=" + monitorInfo.getUsedMemory());  
        System.out.println("Free Physical memory=" + monitorInfo.getFreeMemory() + "kb");  
        System.out.println("Used Physical memory=" + monitorInfo.getUsedMemory() + "kb");  
       
    }  
}  