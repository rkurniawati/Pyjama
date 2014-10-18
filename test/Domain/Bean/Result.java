package Domain.Bean;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Result {
	
	//Common parameter 
 	private String schedule;// static,guided,dynamic
 	private String chunkSize;//default
 	private String testType;// integer,double,float,long
    private String testName;
    private String compileResult;
    private String junitResult;
    private Date createDate;
    private String remark;
    private String compilePJFilePath;
    
    //Thread 
    private int threadCount;
    private int[] threadNumber;
    
    //Correctness
    private int expectedValue;
    private int actualValue;
    private String expectedString;
    private String actualString;
    private int[] actualArrayValue;
    private int arraySize;
    private int[] expectedArrayValue;
    
    //Speedup
    private Long testStartRunningTime; //unit: millisecond
    private Long testEndRunningTime; //unit: millisecond
    private Long testRunningTime; //unit: millisecond
    
    //Memory and CPU
    private List<MonitorInfoBean> monitor; 
    //LoopFor
    private String initialValue;
    private String endValue;
    private String stride;
    private String operator;
    private Double[] resultDoubleArray;
    private int[] resultIntArray;
    
    //Reduction
    private int intResult;
    private double doubleResult;
    	    
    public Result() {
    	setCreateDate(new Date());
    }
    public Result(int threadCount,int[] threadNumber) {
    	setCreateDate(new Date());
    	this.threadCount = threadCount;
    	this.threadNumber = threadNumber;
    }	    

    //Common parameter getter and setter
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    public String getScheduler() {
        return schedule;
    }
    public void setChunkSize(String chunkSize) {
        this.chunkSize = chunkSize;
    }
    public String getChunkSize() {
        return chunkSize;
    }
    public void setTestType(String testType) {
        this.testType = testType;
    }
    public String getTestType() {
        return testType;
    }
    public void setTestName(String testName) {
        this.testName = testName;
    }
    public String getTestName() {
        return testName;
    }
	public String getCompileResult() {
		return compileResult;
	}
	public void setCompileResult(String compileResult) {
		this.compileResult = compileResult;
	}
	public String getJunitResult() {
		return junitResult;
	}
	public void setJunitResult(String junitResult) {
		this.junitResult = junitResult;
	}
    public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCompilePJFilePath() {
		return compilePJFilePath;
	}
	public void setCompilePJFilePath(String compilePJFilePath) {
		this.compilePJFilePath = "../"+compilePJFilePath;
	}
	
    //Thread getter and setter
    public void setThreadCount(int threadCount) {
        this.threadCount = threadCount;
    }
    public int getThreadCount() {
        return threadCount;
    }
    public void setThreadNumber(int[] threadNumber) {
        this.threadNumber = threadNumber;
    }
    public int[] getThreadNumber() {
        return threadNumber;
    }
    
    //Correctness getter and setter
	public int getExpectedValue() {
		return expectedValue;
	}
	public void setExpectedValue(int expectedValue) {
		this.expectedValue = expectedValue;
	}
	public int getActualValue() {
		return actualValue;
	}
	public void setActualValue(int actualValue) {
		this.actualValue = actualValue;
	}
	
	public String getExpectedString() {
		return expectedString;
	}
	public void setExpectedString(String expectedString) {
		this.expectedString = expectedString;
	}
	public String getActualString() {
		return actualString;
	}
	public void setActualString(String actualString) {
		this.actualString = actualString;
	}
	public String getActualArrayValue() {
		return Arrays.toString(actualArrayValue);
	}
	public void setActualArrayValue(int[] actualArrayValue) {
		this.actualArrayValue = actualArrayValue;
	}
	public int getArraySize() {
		return arraySize;
	}
	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	public String getExpectedArrayValue() {
		if(expectedArrayValue==null)return "Unconstant Vaule";
		return Arrays.toString(expectedArrayValue);
	}
	public void setExpectedArrayValue(int[] expectedArrayValue) {
		this.expectedArrayValue = expectedArrayValue;
	}
   
    //SpeedUp getter and setter
    public Long getTestStartRunningTime() {
		return testStartRunningTime;
	}

	public Long getTestEndRunningTime() {
		return testEndRunningTime;
	}

	public Long getTestRunningTime() {
		return testRunningTime;
	}

	public void setTestRunningTime(Long testStartRunningTime,Long testEndRunningTime) {
		this.testStartRunningTime = testStartRunningTime;
		this.testEndRunningTime = testEndRunningTime;
		this.testRunningTime = testEndRunningTime-testStartRunningTime;
	}
    
    //LoopFor getter and setter
    public void setInitialValue(String initialValue) {
        this.initialValue = initialValue;
    }
    public String getInitialValue() {
        return initialValue;
    }
    public void setEndValue(String endValue) {
        this.endValue = endValue;
    }
    public String getEndValue() {
        return endValue;
    }
    public void setStride(String stride) {
        this.stride = stride;
    }
    public String getStride() {
        return stride;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public String getOperator() {
        return operator;
    }
	public Double[] getResultDoubleArray() {
		return resultDoubleArray;
	}
	public void setResultDoubleArray(Double[] resultDoubleArray) {
		this.resultDoubleArray = resultDoubleArray;
	}
	public int[] getResultIntArray() {
		return resultIntArray;
	}
	public void setResultIntArray(int[] resultIntArray) {
		this.resultIntArray = resultIntArray;
	}
	
	//Reduction getter and setter
	public int getIntResult() {
		return intResult;
	}
	public void setIntResult(int intResult) {
		this.intResult = intResult;
	}
	public double getDoubleResult() {
		return doubleResult;
	}
	public void setDoubleResult(double doubleResult) {
		this.doubleResult = doubleResult;
	}
	public List<MonitorInfoBean> getMonitor() {
		return monitor;
	}
	public void setMonitor(List<MonitorInfoBean> monitor) {
		this.monitor = monitor;
	}
	
	public boolean equal(Result result){
		if(!this.testName.equals(result.getTestName())) return false;
		if(this.threadCount!=result.getThreadCount()) return false;
		if(this.arraySize!=result.getArraySize()) return false;
		return true;
	}


	

	
	


}
