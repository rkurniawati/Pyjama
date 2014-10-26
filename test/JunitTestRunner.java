import jUnitTestSuits.compileTests.*;
import jUnitTestSuits.correctnessTests.barrier.Barrier_corrTest;
import jUnitTestSuits.correctnessTests.critical.Critical_corrTest;
import jUnitTestSuits.correctnessTests.firstPrivate.*;
import jUnitTestSuits.correctnessTests.flush.Flush_corrTest;
import jUnitTestSuits.correctnessTests.libraries.Omp_get_max_threadsTest;
import jUnitTestSuits.correctnessTests.libraries.Omp_get_num_procsTest;
import jUnitTestSuits.correctnessTests.libraries.Omp_get_num_threadsTest;
import jUnitTestSuits.correctnessTests.libraries.Omp_get_thread_numTest;
import jUnitTestSuits.correctnessTests.libraries.Omp_set_num_threadsTest;
import jUnitTestSuits.correctnessTests.loopFor.*;
import jUnitTestSuits.correctnessTests.master.Master_corrTest;
import jUnitTestSuits.correctnessTests.ordered.Ordered_corrTest;
import jUnitTestSuits.correctnessTests.parallel.*;
import jUnitTestSuits.correctnessTests.reduction.group1.*;
import jUnitTestSuits.correctnessTests.reduction.group2.*;
import jUnitTestSuits.correctnessTests.reduction.group3.*;
import jUnitTestSuits.correctnessTests.reduction.group4.*;
import jUnitTestSuits.correctnessTests.reduction.group5.*;
import jUnitTestSuits.correctnessTests.reduction.group6.*;
import jUnitTestSuits.correctnessTests.reduction.group7.*;
import jUnitTestSuits.correctnessTests.reduction.group8.*;
import jUnitTestSuits.correctnessTests.schedule.*;
import jUnitTestSuits.correctnessTests.sections.Sections_corrTest;
import jUnitTestSuits.correctnessTests.shared.*;
import jUnitTestSuits.correctnessTests.single.Single_corrTest;
import jUnitTestSuits.memoryAndCPUTest.loopFor.*;
import jUnitTestSuits.memoryAndCPUTest.parallel.Parallel_MacTest;
import jUnitTestSuits.memoryAndCPUTest.schedule.Schedule_Group1_MacTest;
import jUnitTestSuits.memoryAndCPUTest.schedule.Schedule_Group2_MacTest;
import jUnitTestSuits.memoryAndCPUTest.schedule.Schedule_Group3_MacTest;
import jUnitTestSuits.memoryAndCPUTest.schedule.Schedule_Group4_MacTest;
import jUnitTestSuits.memoryAndCPUTest.schedule.Schedule_Group5_MacTest;
import jUnitTestSuits.memoryAndCPUTest.schedule.Schedule_Group6_MacTest;
import jUnitTestSuits.runningTimeAndStabilityTest.loopFor.*;
import jUnitTestSuits.runningTimeAndStabilityTest.parallel.*;
import jUnitTestSuits.runningTimeAndStabilityTest.schedule.*;

import org.junit.runner.JUnitCore;

import Utility.ResultReportHelper.GenerateReport;

public class JunitTestRunner {
	//
	private static int CompileRunCount = 0;
	private static long CompileRunTime = 0;
	private static int CompileFailureCount = 0;

	private static int MaCRunCount = 0;
	private static long MaCRunTime = 0;
	private static int MaCFailureCount = 0;

	private static int RTRunCount = 0;
	private static long RTRunTime = 0;
	private static int RTFailureCount = 0;

	private static int CorrectnessRunCount = 0;
	private static long CorrectnessRunTime = 0;
	private static int CorrectnessFailureCount = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Class<?>[] directiveClasses = { BarrierTest.class,
				CriticalTest.class, FlushTest.class, MasterTest.class,
				OrderedTest.class, SectionsTest.class, SingleTest.class,
				LoopForTest.class, ParallelTest.class };

		Class<?>[] ClausesClasses = { PrivateTest.class,
				FirstPrivateTest.class, LastPrivateTest.class,
				CopyPrivateTest.class, SharedTest.class, ReductionTest.class,
				ScheduleTest.class };

		org.junit.runner.Result DirectiveResult = JUnitCore
				.runClasses(directiveClasses);
		org.junit.runner.Result ClausesResult = JUnitCore
				.runClasses(ClausesClasses);
		org.junit.runner.Result LibraryResult = JUnitCore
				.runClasses(LibrariesTest.class);
		CompileRunCount = DirectiveResult.getRunCount()
				+ ClausesResult.getRunCount() + LibraryResult.getRunCount();
		CompileRunTime = DirectiveResult.getRunTime()
				+ ClausesResult.getRunTime() + LibraryResult.getRunTime();
		CompileFailureCount = DirectiveResult.getFailureCount()
				+ ClausesResult.getFailureCount()
				+ LibraryResult.getFailureCount();

		// /////////////////////////////////////////////////////////////////////////////////////////
		Class<?>[] directiveClasses_CPUandMemory = {
				LoopFor_Group1_MacTest.class, LoopFor_Group2_MacTest.class,
				LoopFor_Group3_MacTest.class, LoopFor_Group4_MacTest.class,
				Parallel_MacTest.class, Schedule_Group3_MacTest.class,
				Schedule_Group5_MacTest.class, Schedule_Group1_MacTest.class,
				Schedule_Group2_MacTest.class, Schedule_Group4_MacTest.class,
				Schedule_Group6_MacTest.class };

		org.junit.runner.Result DirectiveResult_MaC = JUnitCore
				.runClasses(directiveClasses_CPUandMemory);

		MaCRunCount = DirectiveResult_MaC.getRunCount();
		MaCRunTime = DirectiveResult_MaC.getRunTime();
		MaCFailureCount = DirectiveResult_MaC.getFailureCount();

		Class<?>[] directiveClasses_RunningTime = {
				LoopFor_Group1_RtTest.class, LoopFor_Group2_RtTest.class,
				LoopFor_Group3_RtTest.class, LoopFor_Group4_RtTest.class,
				LoopFor_Group5_RtTest.class, LoopFor_Group6_RtTest.class,
				Parallel_Group1_RtTest.class, Parallel_Group2_RtTest.class,
				Parallel_Group3_RtTest.class, Schedule_Group1_RtTest.class,
				Schedule_Group2_RtTest.class, Schedule_Group3_RtTest.class,
				Schedule_Group4_RtTest.class, Schedule_Group5_RtTest.class,
				Schedule_Group6_RtTest.class 
				};
		
		org.junit.runner.Result DirectiveResult_RT = JUnitCore
				.runClasses(directiveClasses_RunningTime);

		RTRunCount = DirectiveResult_RT.getRunCount();
		RTRunTime = DirectiveResult_RT.getRunTime();
		RTFailureCount = DirectiveResult_RT.getFailureCount();

		// ///////////////////////////////////////////////////////////////////////////////////////////

		/***************************************
		 * Do not include correctness tests
		 * *************************************/

		 Class<?>[] libraryClasses_corr = {
		 Omp_get_max_threadsTest.class,
		 Omp_get_num_procsTest.class, 
		 Omp_get_num_threadsTest.class,
		 Omp_get_thread_numTest.class,
		 Omp_set_num_threadsTest.class 
		 };
		
		 org.junit.runner.Result LibraryResult_corr = JUnitCore
		 .runClasses(libraryClasses_corr);
		
		 Class<?>[] directiveClasses_corr = { 
		 Single_corrTest.class,
		 Ordered_corrTest.class,
		 Master_corrTest.class, 
		 Sections_corrTest.class, 
		 Barrier_corrTest.class,
		 Critical_corrTest.class, 
		 Flush_corrTest.class,
		 LoopFor_Group1_corrTest.class, LoopFor_Group2_corrTest.class,
		 LoopFor_Group3_corrTest.class, LoopFor_Group4_corrTest.class,
		 LoopFor_Group5_corrTest.class, LoopFor_Group6_corrTest.class,
		 Parallel_Group1_corrTest.class, Parallel_Group2_corrTest.class,
		 Parallel_Group3_corrTest.class 
		 };
		

		 org.junit.runner.Result DirectiveResult_corr = JUnitCore
		 .runClasses(directiveClasses_corr);
		 

		
		 Class<?>[] clausesClasses_corr = {
		 FirstPrivate_Group1_corrTest.class,
		 FirstPrivate_Group2_corrTest.class,
         Shared_Group1Test.class,
		 Shared_Group2Test.class, 
		 Shared_Group3Test.class,
		 Schedule_Group1Test.class, Schedule_Group2Test.class,
		 Schedule_Group3Test.class, Schedule_Group4Test.class,
		 Schedule_Group5Test.class, Schedule_Group6Test.class,
		 Reduction_Group1_1Test.class, 
		 Reduction_Group1_2Test.class,
		 Reduction_Group1_3Test.class,
		 Reduction_Group2_1Test.class,
		 Reduction_Group2_2Test.class,
		 Reduction_Group2_3Test.class,
		 Reduction_Group3_1Test.class, 
		 Reduction_Group3_2Test.class,
		 Reduction_Group3_3Test.class,
		 Reduction_Group4_1Test.class,
		 Reduction_Group4_2Test.class,
		 Reduction_Group4_3Test.class,
		 Reduction_Group7_1Test.class,
		 Reduction_Group7_2Test.class,
		 Reduction_Group7_3Test.class,
		 Reduction_Group8_1Test.class,
		 Reduction_Group8_2Test.class,
		 Reduction_Group8_3Test.class,
		 };
		 org.junit.runner.Result ClausesResult_corr = JUnitCore
		 .runClasses(clausesClasses_corr);

		
		 CorrectnessRunCount = DirectiveResult_corr.getRunCount()
		 + ClausesResult_corr.getRunCount()
		 + LibraryResult_corr.getRunCount();
		 CorrectnessRunTime = DirectiveResult_corr.getRunTime()
		 + ClausesResult_corr.getRunTime()
		 + LibraryResult_corr.getRunTime();
		 CorrectnessFailureCount = DirectiveResult_corr.getFailureCount()
		 + ClausesResult_corr.getFailureCount()
		 + LibraryResult_corr.getFailureCount();

		// Gennerate Report Parameters
		int[] RunCount = { CompileRunCount, CorrectnessRunCount, RTRunCount,
				MaCRunCount };
		long[] RunTime = { CompileRunTime, CorrectnessRunTime, RTRunTime,
				MaCRunTime };
		int[] FailrueCount = { CompileFailureCount, CorrectnessFailureCount,
				RTFailureCount, MaCFailureCount };

		// Generate Report
		GenerateReport report = new GenerateReport();
		report.generate(RunCount, RunTime, FailrueCount);
		System.out.println("Finished!");
	}
}
