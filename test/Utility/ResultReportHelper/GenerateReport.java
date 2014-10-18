package Utility.ResultReportHelper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import pj.Pyjama;
import Domain.SettingConstans;
import Domain.Bean.MonitorInfoBean;
import Domain.Bean.Data;
import Domain.Bean.Result;
import Domain.DataType.TreeNode;
import Utility.JSONDatabaseHelper.resultWriterHelper;

public class GenerateReport {

	private static resultWriterHelper n;

	public static void  main(String[] arg){
		GenerateReport tt = new GenerateReport();
		tt.generate(new int[]{105,450,150,77}, new long[]{101445,19530,26096,22489}, new int[]{7,42,0,0});
	}
	
	public void generate(int[] num,long[] time,int[] fauiledCount) {
		File theDir = new File("Report");
		// if the directory does not exist, create it
		if (!theDir.exists())
			theDir.mkdir();

		n = new resultWriterHelper();
		try {
			//index.html
			generateIndex();
			//navigation.html
			generateNavigation();
			//summary.html
			generateSummary(num,time,fauiledCount);
			///main results pages
			
			//Directives 0 for int value; 1 for array vale 2 for special loopFor 3 for special schedule
			//Directives Synchronization Construct
			generateResultsPage("Atomic",1,0,null);
			generateResultsPage("Barrier",1,1,null);
			generateResultsPage("Critical",1,0,null);
			generateResultsPage("Master",1,1,null);
			generateResultsPage("Flush",1,0,null);
			generateResultsPage("Ordered",1,1,null);
			
			//Directives Parallel Construct
			generateResultsPage("Parallel",3,0,new String[]{"parallel_region_increment_array"});
			//Directive Work-Sharing Construct
			generateResultsPage("Sections",1,0,null);
			generateResultsPage("Single",1,0,null);
			generateResultsPage("LoopFor",6,2,new String[]{"100000 size array parallel_for"});
			
			//Clauses
			generateResultsPage("Schedule",6,3,new String[]{"parallel_for_guided:1000000","parallel_for_static:1000000","parallel_for_dynamic:1000000"});
			generateResultsPage("Firstprivate",3,1,null);
			generateResultsPage("Reduction",8,0,null);
			generateResultsPage("Shared",3,1,null);
			generateResultsPage("Private",1,0,null);
			generateResultsPage("Lastprivate",1,0,null);
			generateResultsPage("Copyprivate",1,0,null);
		
			//Libraries
			generateResultsPage("Omp_get_max_threads",1,0,null);
			generateResultsPage("Omp_get_num_procs",1,0,null);
			generateResultsPage("Omp_get_num_threads",1,0,null);
			generateResultsPage("Omp_get_thread_num",1,1,null);
			generateResultsPage("Omp_set_num_threads",1,0,null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void generateIndex() throws Exception {
		n.writeHTML("Index", ReportHelper.Index());
	}
	@SuppressWarnings("unused")
	public static void generateNavigation() throws Exception {
		TreeNode<String> root = new TreeNode<String>("Report");
		{
			TreeNode<String> Node1 = root.addChild("Directives");
			{
				// Synchronization Construct
				TreeNode<String> directive1 = Node1.addChild("Atomic");
				TreeNode<String> directive2 = Node1.addChild("Barrier");
				TreeNode<String> directive3 = Node1.addChild("Critical");
				TreeNode<String> directive4 = Node1.addChild("Flush");
				TreeNode<String> directive5 = Node1.addChild("Master");
				TreeNode<String> directive6 = Node1.addChild("Ordered");

				// Work-Sharing Construct
				TreeNode<String> directive7 = Node1.addChild("Sections");
				TreeNode<String> directive8 = Node1.addChild("Single");
				TreeNode<String> directive9 = Node1.addChild("LoopFor");

				// Parallel Construct
				TreeNode<String> directive10 = Node1.addChild("Parallel");

				// Thread Private
				//TreeNode<String> directive11 = Node1.addChild("Thread Private");
			}

			TreeNode<String> Node2 = root.addChild("Clauses");
			{
				TreeNode<String> clause1 = Node2.addChild("Private");
				TreeNode<String> clause2 = Node2.addChild("Firstprivate");
				TreeNode<String> clause3 = Node2.addChild("Lastprivate");
				TreeNode<String> clause4 = Node2.addChild("Copyprivate");
				TreeNode<String> clause5 = Node2.addChild("Shared");
				TreeNode<String> clause6 = Node2.addChild("Reduction");
				TreeNode<String> clause8 = Node2.addChild("Schedule");
			}

			TreeNode<String> Node3 = root.addChild("Runtime Library Methods");
			{				
				TreeNode<String> method1 = Node3.addChild("Omp_get_max_threads");
				TreeNode<String> method2 = Node3.addChild("Omp_get_num_procs");
				TreeNode<String> method3 = Node3.addChild("Omp_get_num_threads");
				TreeNode<String> method4 = Node3.addChild("Omp_get_thread_num");
				TreeNode<String> method5 = Node3.addChild("Omp_set_num_threads");		
			}
		}
		n.writeHTML("Frame_navigation", ReportHelper.frame_navigation(root));
	}
		
	public static void generateSummary(int[] num,long[] time,int[] fauiledCount) throws Exception{
		n.writeHTML("Summary_Page", ReportHelper.SummaryPage(num,time,fauiledCount));
	}
	private static void generateResultsPage(String type, int CorrectnessGroupSize,int CorrectnessStyle, String[] selectCases)throws Exception {
		// Compile Result
		Data dataCompile = n.read("JsonResult/"+type+"/CompileJunitResults.json");
		String pageContent = ReportHelper.Compile_Table(compileTable(dataCompile));

		// Correct Result
		if(CorrectnessGroupSize>1){
			String[] title = new String[CorrectnessGroupSize];
			String[] content = new String[CorrectnessGroupSize];
			for (int i = 1; i <= CorrectnessGroupSize; i++) {
				Data dataCorrectness = n.read("JsonResult/"+type+"/CorrectnessJunitResults_Group"+i+".json");
				title[i-1]="Group"+i;
				content[i-1]=ReportHelper.Correctness_Table(correctnessTable(dataCorrectness,CorrectnessStyle)).replace("null", "");
			}
			pageContent += ReportHelper.Tabs_Left("correct",title, content);
		}else{
			Data dataCorrectness = n.read("JsonResult/"+type+"/CorrectnessJunitResults.json");
			pageContent += ReportHelper.Correctness_Table(correctnessTable(dataCorrectness, CorrectnessStyle)).replace("null", "");
		}
		
		if(selectCases!=null){
			// Stability Table Result 
			Data dataStabilityTime = n.read("JsonResult/"+type+"/RunningTimeJunitResults.json");
			String[][] arg =StabilityTableTab(dataStabilityTime,CorrectnessGroupSize);
			pageContent += ReportHelper.Tabs_Left("table",arg[0], arg[1]); 
			
			// SpeedUp Line Result
			Data dataLineChart = n.read("JsonResult/"+type+"/RunningTimeJunitResults.json");
			
			int[][] data = new int[selectCases.length][];
			for (int i = 0; i < data.length; i++) {
				data[i]= RunningTimeLineChart(dataLineChart,selectCases[i]);
//				System.out.println(Arrays.toString(data[i]));
			}
			pageContent += ReportHelper.SpeedUp_LineChart(data,selectCases);
					
			// Memory Result
			Data dataCPU = n.read("JsonResult/"+type+"/MemoryAndCPUJunitResults.json");
			String[] title = new String[]{"Total Memory","Uesed Memory","Free Memory"};
			
			if(dataCPU!=null){
				pageContent += ReportHelper.MemoryUsage_BarChart(Memory(dataCPU,selectCases[0]), title);
				// CPU Result			
				pageContent += ReportHelper.CPU_PieChart(CPUChart(dataCPU,selectCases[0]));
			}

		}
		
		n.writeHTML(type+"_charts", ReportHelper.TestResultPage("Directives_"+type, pageContent));
	}

	//Utility/////////////////////////////////////////////////////////////////////////////////
	private static long[][] Memory(Data data,String testCase){
		int size = 50;
		long[] TotalMemory = new long[size];
		long[] UsedMemory = new long[size];
		long[] FreeMemory = new long[size];
		for(Result result:data.getList()){
			if(result.getTestName().equals(testCase)){
				List<MonitorInfoBean> cpuInfo = result.getMonitor();
				try {
					if (cpuInfo!=null)
					for (int i = 0; i < cpuInfo.size(); i++) {
						TotalMemory[i]=cpuInfo.get(i).getTotalMemory();
						UsedMemory[i]=cpuInfo.get(i).getUsedMemory();
						FreeMemory[i]=cpuInfo.get(i).getFreeMemory();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		return new long[][]{TotalMemory,UsedMemory,FreeMemory};
	}
	
	private static double[] CPUChart(Data data,String testCase){
		List<Double> CPU = new ArrayList<Double>();
		List<Double> CPU1 = new ArrayList<Double>();
		List<Double> CPU2= new ArrayList<Double>();
		List<Double> CPU3 = new ArrayList<Double>();
		List<Double> CPU4 = new ArrayList<Double>();
		
		List<Double> percent10 = new ArrayList<Double>();
		List<Double> percent20 = new ArrayList<Double>();
		List<Double> percent30 = new ArrayList<Double>();
		List<Double> percent40 = new ArrayList<Double>();
		List<Double> percent50 = new ArrayList<Double>();
		List<Double> percent60 = new ArrayList<Double>();
		List<Double> percent70 = new ArrayList<Double>();
		List<Double> percent80 = new ArrayList<Double>();
		List<Double> percent90 = new ArrayList<Double>();
		List<Double> percent100 = new ArrayList<Double>();
		
		for(Result result:data.getList()){
			if(result.getTestName().equals(testCase)){
				List<MonitorInfoBean> cpuInfo = result.getMonitor();
				if(cpuInfo==null) continue;
				percent10= cpuInfo.get(0).getCpuRatio();
				percent20= cpuInfo.get(1).getCpuRatio();
				percent30= cpuInfo.get(2).getCpuRatio();
				percent40= cpuInfo.get(3).getCpuRatio();
				percent50= cpuInfo.get(4).getCpuRatio();
				percent60= cpuInfo.get(5).getCpuRatio();
				percent70= cpuInfo.get(6).getCpuRatio();
				double[] Cpu_average = new double[5];
				for (int i = 0; i < Cpu_average.length; i++) {
					Cpu_average[i]=(percent10.get(i)+percent20.get(i)+
								   percent30.get(i)+percent40.get(i)+
								   percent50.get(i)+percent60.get(i)+
								   percent70.get(i))/7;
				}
				CPU.add(Cpu_average[0]);
				CPU1.add(Cpu_average[1]);
				CPU2.add(Cpu_average[2]);
				CPU3.add(Cpu_average[3]);
				CPU4.add(Cpu_average[4]);
			}			
		}
		
		return new double[]{averageDouble(CPU),averageDouble(CPU1),averageDouble(CPU2),averageDouble(CPU3),averageDouble(CPU4)};
	}
	private static String[][] compileTable(Data data){
		int rowNumber = data.getList().size();
		int  errorLenght = SettingConstans.ERROR_MESSAGE_LENGTH;
		
		String[][] Table = new String[rowNumber+1][5];
		Table[0][0]="Test Case Name";
		Table[0][1]="Compiling Date";
		Table[0][2]="Pyjama Code Describe";
		Table[0][3]="Status";
		Table[0][4]="Sourse Code";

		int rowIndex=1;
		for (Result result : data.getList()) {
			String color;
			if(result.getJunitResult().equals("Pass"))
				color="#00DF00";
			else if(result.getJunitResult().equals("Unsupported"))
				color ="#FF9900";
			else
				color="#ff1500";
			
			Table[rowIndex][0]="<td>" + result.getTestName()+"</td>";
			Table[rowIndex][1]="<td>" + result.getCreateDate().toString()+"</td>";
			Table[rowIndex][2]="<td>" + result.getRemark()+"</td>";
			String compileResult = result.getCompileResult();
			String titleResult="";
			if (result.getCompileResult().length() > errorLenght) {
				compileResult = result.getCompileResult().substring(0,errorLenght)+"...";
				titleResult=result.getCompileResult();
			}
			Table[rowIndex][3]="<td title=\""+titleResult+"\" style=\" color :"+color+"\"}>"+ compileResult + "</td>";
			Table[rowIndex][4]="<td><a href=\""+result.getCompilePJFilePath()+"\">Compile Code</a></td>";
			rowIndex++;
		}	
		return Table;
	}
	private static String[][] correctnessTable(Data data, int Style){
		int rowNumber = data.getList().size();
		int lastIndex = 0;
		switch (Style){ 
	 	case 0:
			lastIndex =6;
	 		break;
	 	case 1:
			lastIndex =6;
			break;
		case 2:
			lastIndex =8;
		    break; 
		case 3:
			lastIndex =8;
		    break; 
		default:
		    break; 
		}
		
		String[][] Table = new String[rowNumber+1][lastIndex];
		Table[0][0]="Test Case";
		Table[0][1]="Thread Number";
		Table[0][2]="Create Date";
		switch (Style){ 
		 	case 0:
		 		Table[0][3]="Expected Value";
				Table[0][4]="Actual Value";
		 		break;
		 	case 1:
		 		Table[0][3]="Expected Value";
				Table[0][4]="Actual Value";
				break;
			case 2:
				Table[0][3]="InitialValue Value";
				Table[0][4]="EndValue Value";	
				Table[0][5]="Stride Value";	
				Table[0][6]="Operator";	
			    break; 
			case 3:
				Table[0][3]="Expected Value";
				Table[0][4]="Actual Value";
				Table[0][5]="ChunkSize";	
				Table[0][6]="TestArraySize";	
			    break; 
			default:
			    break; 
		}
		
		Table[0][lastIndex-1]="Status";
		List<String> nameNoRept = new ArrayList<String>();
		int rowIndex=1;
		for (Result result : data.getList()) {	
			if(nameNoRept.contains(result.getTestName())) break;
			nameNoRept.add(result.getTestName());
			String color;
			if(result.getJunitResult().equals("Success"))
			color="#00DF00";
			else
			color="#ff1500";
			
			Table[rowIndex][0]="<td>" + result.getTestName()+"</td>";
			Table[rowIndex][1]="<td>" + result.getThreadCount()+"</td>";
			Table[rowIndex][2]="<td>" + result.getCreateDate().toString()+"</td>";
			
			switch (Style)
				{ 
				  case 0:
					  Table[rowIndex][3]="<td>" + result.getExpectedValue()+"</td>";
					  Table[rowIndex][4]="<td>" + result.getActualValue()+"</td>";
				      break;
				  case 1:
					  Table[rowIndex][3]="<td>" + result.getExpectedArrayValue()+"</td>";
					  Table[rowIndex][4]="<td>" + result.getActualArrayValue()+"</td>";
				      break;
				  case 2:
					  Table[rowIndex][3]="<td>" + result.getInitialValue()+"</td>";
					  Table[rowIndex][4]="<td>" + result.getEndValue()+"</td>";
					  Table[rowIndex][5]="<td>" + result.getStride()+"</td>";
					  Table[rowIndex][6]="<td>" + result.getOperator()+"</td>";
				      break;  
				  case 3:
					  Table[rowIndex][3]="<td>" + result.getExpectedArrayValue()+"</td>";
					  Table[rowIndex][4]="<td>" + result.getActualArrayValue()+"</td>";
					  Table[rowIndex][5]="<td>" + result.getChunkSize()+"</td>";
					  Table[rowIndex][6]="<td>" + result.getArraySize()+"</td>";
				      break;  
				  default:
				        break; 
				}					
			
			
			Table[rowIndex][lastIndex-1]="<td style=\" color :"+color+"\"}>"+ result.getJunitResult() + "</td>";
			rowIndex++;
		}	
		return Table;
	}
	private static String[][] StabilityTableTab(Data data,int GroupSize){
		int procesNum=Pyjama.omp_get_num_procs();
		String[] titles =new String[procesNum];
		for (int i = 0; i < titles.length; i++) {
			titles[i]=i+2+" Threads";
		}

		String[] contents = new String[titles.length];
		
		for(int i=0;i<titles.length;i++){
			Data newData = new Data(data.getVersion());
			for(Result result:data.getList()){
				if(result.getThreadCount()==i+2)
					newData.addResult(result);
				}
			contents[i]= ReportHelper.Stability_Table(runningTimeTable(newData),GroupSize);
		}
		return new String[][]{titles,contents};
	}
	private static String[][] runningTimeTable(Data data){
		int rowNumber = data.getList().size();
		
		String[][] Table = new String[rowNumber+1][6];
		Table[0][0]="Test Case";
		Table[0][1]="Thread Number";
		Table[0][2]="Create Date";
		Table[0][3]="Start Time (ms)";
		Table[0][4]="End Time (ms)";
		Table[0][5]="Running Time (ms)";
		
		int rowIndex=1;
		for (Result result : data.getList()) {							
			Table[rowIndex][0]=result.getTestName();
			Table[rowIndex][1]= result.getThreadCount()+"";
			Table[rowIndex][2]= result.getCreateDate().toString();
			Table[rowIndex][3]= result.getTestStartRunningTime()+"";
			Table[rowIndex][4]= result.getTestEndRunningTime()+"";
			Table[rowIndex][5]= result.getTestRunningTime()+"";
			rowIndex++;
		}	
		return Table;
	}
	private static double averageDouble(List<Double> n){
		
		double sum = 0;
		for(double i:n)
			sum+=i;
		if(n.size()==0) return 0;
		return (double) (sum/n.size());
	}
	private static int average(List<Long> n){
		long sum = 0;
		for(long i:n)
			sum+=i;
		if(n.size()==0) return 0;
		return (int) (sum/n.size());
	}
	private static int[] RunningTimeLineChart(Data data,String testCase){
		ArrayList<Long> thread2_sum = new ArrayList<Long>();
		ArrayList<Long> thread3_sum = new ArrayList<Long>();
		ArrayList<Long> thread4_sum = new ArrayList<Long>();
		ArrayList<Long> thread5_sum = new ArrayList<Long>();
		ArrayList<Long> thread6_sum = new ArrayList<Long>();
		ArrayList<Long> thread7_sum = new ArrayList<Long>();
		ArrayList<Long> thread8_sum = new ArrayList<Long>();
		
		for(Result result:data.getList()){
			if(result.getTestName().equals(testCase))
				switch (result.getThreadCount())
				{ 
				  case 2:
					  thread2_sum.add(result.getTestRunningTime());
				      break;
				  case 3:
					  thread3_sum.add(result.getTestRunningTime());
				      break;  
				  case 4:
					  thread4_sum.add(result.getTestRunningTime());
				      break;
				  case 5:
					  thread5_sum.add(result.getTestRunningTime());
				      break;
				  case 6:
					  thread6_sum.add(result.getTestRunningTime());
				      break;
				  case 7:
					  thread7_sum.add(result.getTestRunningTime());
				      break;
				  case 8:
					  thread8_sum.add(result.getTestRunningTime());
				      break;
				  default:
				        break; 
				}					
		}
		int[] avgTime = new int[8];
		avgTime[0]=0;
		avgTime[1]=average(thread2_sum);
		avgTime[2]=average(thread3_sum);
		avgTime[3]=average(thread4_sum);
		avgTime[4]=average(thread5_sum);
		avgTime[5]=average(thread6_sum);
		avgTime[6]=average(thread7_sum);
		avgTime[7]=average(thread8_sum);		
		return avgTime;
	}
}
