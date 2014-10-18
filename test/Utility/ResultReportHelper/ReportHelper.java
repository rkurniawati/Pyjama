package Utility.ResultReportHelper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

import Domain.SettingConstans;
import Domain.DataType.TreeNode;

import pj.Version;

public class ReportHelper {

	private static StringBuffer buf;
	private static StringBuffer bufChart;
	private static StringBuffer bufTab;

	/**
	 * Help to add string into string buffer
	 */
	private static StringBuffer appendln(String st) {
		buf.append(st);
		buf.append(System.getProperty("line.separator"));
		return buf;
	}

	private static StringBuffer Chart_appendln(String st) {
		bufChart.append(st);
		bufChart.append(System.getProperty("line.separator"));
		return bufChart;
	}

	private static StringBuffer Tab_appendln(String st) {
		bufTab.append(st);
		bufTab.append(System.getProperty("line.separator"));
		return bufTab;
	}

	/**
	 * Index.html include Frame_navigation and main-frame
	 */
	public static String Index() {
		buf = new StringBuffer();
		appendln("<html xmlns:lxslt=\"http://xml.apache.org/xslt\" xmlns:stringutils=\"xalan://org.apache.tools.ant.util.StringUtils\">");
		appendln("<head>");
		appendln("    <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		appendln("    <title>Unit Test Results</title>");
		appendln("</head>");

		appendln("<frameset cols=\"18%,82%\">");
		appendln("    <frame src=\"Frame_navigation.html\" name=\"classListFrame\">");
		appendln("    <frame src=\"Summary_Page.html\" name=\"classFrame\">");
		appendln("    <noframes>");
		appendln("        <h2>Frame Alert</h2>");
		appendln("        <p>");
		appendln("            This document is designed to be viewed using the frames feature. If you see this message, you are using a");
		appendln("            non-frame-capable web client.");
		appendln("        </p>");
		appendln("    </noframes>");
		appendln("</frameset>");
		appendln("</html>");

		return buf.toString();
	}

	/**
	 * Directive navigation page
	 */
	public static String frame_navigation(TreeNode<String> root) {
		buf = new StringBuffer();
		appendln("<html>");
		appendln("<head>");
		appendln("<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		appendln("<title>Navigation</title>");
		appendln("<style> li.level{list-style-type:none; margin:0;padding:0;} a{text-decoration:none} ul{margin:5 0 5 0;} </style>");
		appendln("</head>");

		appendln("<body bgcolor=\"#E2E2E2\">");
		appendln("<h2>Pyjama Test Navigation</h2>");
		appendln("<ul width=\"100%\">");

		for (TreeNode<String> children_Level1 : root.children) {
			appendln(navigation_li(children_Level1.data, children_Level1)
					.toString());
		}

		appendln("</ul>");
		appendln("</body>");
		appendln("</html>");
		return buf.toString();
	}

	private static StringBuffer navigation_li(String children_Level1,
			TreeNode<String> children) {
		StringBuffer out = new StringBuffer();
		// appendln("<li><a target=\"classFrame\" href=\""
		// + children_Level1 + "_charts.html\">" + children_Level1
		// + "</a>");
		appendln("<li class=\"level\"><a>" + children_Level1 + "</a>");
		appendln("<ul>");

		for (TreeNode<String> children_Level2 : children.children)
			appendln("<li><a target=\"classFrame\" href=\""
					+ children_Level2.data + "_charts.html\">"
					+ children_Level2.data + "</a></li>");

		appendln("</ul>");
		appendln("</li>");
		return out;
	}

	public static String SummaryPage(int[] num, long[] time, int[] failedCount) {
		buf = new StringBuffer();
		int sum = 0;
		for (int item : num)
			sum += item;
		sum += 405;
		int failedSum = 0;
		for (int item : failedCount)
			failedSum += item;
		int successSum = sum - failedSum;

		long sumTime = 0;
		for (long item : time)
			sumTime += item;

		appendln("<!DOCTYPE html>");
		appendln("<html lang=\"en\">");
		appendln("<head>");
		appendln("<meta charset=\"utf-8\" />");
		appendln("<title>Pyjama Report</title>");
		appendln("<link href=\"library/css/styles.css\" rel=\"stylesheet\" />");
		appendln("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
		appendln("</head>");

		appendln("<body>");
		appendln("<div id=\"main_content\" class=\"container-fluid\">");

		appendln("<div class=\"page-heading\">");
		appendln("<h2 class=\"page-title muted\">");
		appendln("<i class=\"micon-stats-up\"></i> Pyjama Benchmark Report");
		appendln("</h2>");

		appendln("<div class=\"page-info hidden-phone\">");
		appendln("<ul class=\"stats\">");

		appendln("<li>");
		appendln("<span class=\"large text-info\">" + sum + "</span>");
		appendln("<span class=\"mini muted\">Test Cases</span>");
		appendln("</li>");

		appendln("<li>");
		appendln("<span class=\"large text-success\">" + successSum + "</span>");
		appendln("<span class=\"mini muted\">Passed</span>");
		appendln("</li>");

		appendln("<li>");
		appendln("<span class=\"large text-error\">" + failedSum + "</span>");
		appendln("<span class=\"mini muted\">Failed</span>");
		appendln("</li>");

		appendln("<li>");
		appendln("<span class=\"large text-warning\">" + sumTime
				+ " (ms) </span>");
		appendln("<span class=\"mini muted\">Totally Running Time</span>");
		appendln("</li>");

		appendln("</ul>");
		appendln("</div>");

		appendln("</div>");

		appendln("<ul class=\"breadcrumb breadcrumb-main\">");
		appendln("<li><a>Pyjama Performance JUnit Test</a> <span class=\"divider\"><i class=\"icon-caret-right\"></i></span></li>");
		appendln("<li><a>Summary Page</a> <span class=\"divider\"><i class=\"icon-caret-right\"></i></span></li>");
		appendln("<li class=\"text-info\">Welcome</li>");
		appendln("</ul>");

		appendln("<div class=\"well widget\">");
		appendln("<div class=\"widget-header\">");
		appendln("<h3 class=\"title\">Overview Results of Pyjama Benchmark</h3>");
		appendln("</div>");

		appendln("<div class=\"widget-content\">");
		appendln("<table class=\"table table-striped\">");
		appendln("<thead>");
		appendln("<tr>");
		appendln("<th>Name</th>");
		appendln("<th><b>Test Cases</b></th>");
		appendln("<th><b>Passed Cases</b></th>");
		appendln("<th><b>Failded Cases</b></th>");
		appendln("<th><b>Running Time</b></th>");
		appendln("</tr>");
		appendln("</thead>");

		appendln("<tbody>");

		appendln("<tr>");
		appendln("<td>Compile Test Suit</td>");
		appendln("<td>" + num[0] + "</td>");
		appendln("<td>" + (num[0] - failedCount[0]) + "</td>");
		appendln("<td>" + failedCount[0] + "</td>");
		appendln("<td>" + time[0] + " (ms) </td>");
		appendln("</tr>");

		appendln("<tr>");
		appendln("<td>Correctness Test Suit</td>");
		appendln("<td>" + num[1] + "</td>");
		appendln("<td>" + (num[1] - failedCount[1]) + "</td>");
		appendln("<td>" + failedCount[1] + "</td>");
		appendln("<td>" + time[1] + " (ms) </td>");
		appendln("</tr>");

		appendln("<tr>");
		appendln("<td>Running Time Test Suit</td>");
		appendln("<td>" + num[2] + "</td>");
		appendln("<td>" + (num[2] - failedCount[2]) + "</td>");
		appendln("<td>" + failedCount[2] + "</td>");
		appendln("<td>" + time[2] + " (ms) </td>");
		appendln("</tr>");

		appendln("<tr>");
		appendln("<td>CPU and Memory Test Suit</td>");
		appendln("<td>" + num[3] + "</td>");
		appendln("<td>" + (num[3] - failedCount[3]) + "</td>");
		appendln("<td>" + failedCount[3] + "</td>");
		appendln("<td>" + time[3] + " (ms) </td>");
		appendln("</tr>");

		appendln("</tbody>");
		appendln("</table>");
		appendln("</div>");
		appendln("</div>");

		// ////////////////////
		appendln("<div class=\"well widget\">");
		appendln("<div class=\"widget-header\">");
		appendln("<h3 class=\"title\">System Infomation</h3>");
		appendln("</div>");
		appendln("<div class=\"widget-content\">");
		appendln("<table class=\"table table-bordered\">");
		appendln("<thead>");
		appendln("<tr>");
		appendln("<th><b>Operater System :</b></th>");
		appendln("<th>" + System.getProperty("os.name") + "</th>");
		appendln("<th><b>Operater System Version :</b></th>");
		appendln("<th>" + System.getProperty("os.version") + "</th>");
		appendln("<th><b>Architecture of the OS</b></th>");
		appendln("<th>" + System.getProperty("os.arch") + "</th>");
		appendln("</tr>");
		appendln("</thead>");

		appendln("<tbody>");
		int MemTotal = 0;
		int MemUsed = 0;
		int SwapTotal = 0;

		try {
			Process p = Runtime.getRuntime().exec("free -m");
			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			StringTokenizer tokenStat = null;
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("Mem")) {
					tokenStat = new StringTokenizer(line);
					tokenStat.nextToken();// String name
					MemTotal = Integer.parseInt(tokenStat.nextToken());
					MemUsed = Integer.parseInt(tokenStat.nextToken());
				}
				if (line.startsWith("Swap")) {
					tokenStat = new StringTokenizer(line);
					tokenStat.nextToken();// String name
					SwapTotal = Integer.parseInt(tokenStat.nextToken());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		appendln("<tr>");
		appendln("<td><b>Available Processors :</b></td>");
		appendln("<td>" + Runtime.getRuntime().availableProcessors() + "</td>");
		appendln("<td><b>Total Physical Space :</b></td>");
		appendln("<td>" + File.listRoots()[0].getTotalSpace() / 1048576
				+ "(MB)</td>");
		appendln("<td><b>Usable Physical Space :</b></td>");
		appendln("<td>" + File.listRoots()[0].getUsableSpace() / 1048576
				+ "(MB)</td>");
		appendln("</tr>");

		appendln("<tr>");
		appendln("<td><b>Total Swap Space :</b></td>");
		appendln("<td>" + SwapTotal + "(MB)</td>");
		appendln("<td><b>Total Memory space :</b></td>");
		appendln("<td>" + MemTotal + "(MB)</td>");
		appendln("<td><b>Usable Memory space :</b></td>");
		appendln("<td>" + MemUsed + "(MB)</td>");
		appendln("</tr>");

		appendln("<tr>");
		appendln("<td><b>Java Version :</b></td>");
		appendln("<td>" + System.getProperty("java.version") + "</td>");
		appendln("<td><b>Java Vendor :</b></td>");
		appendln("<td>" + System.getProperty("java.vendor") + "</td>");
		appendln("<td><b>JUnit Version :</b></td>");
		appendln("<td>" + junit.runner.Version.id() + "</td>");
		appendln("</tr>");
		
		appendln("<tr>");
		appendln("<td><b>Pyjama Version : </b></td>");
		appendln("<td>" + Version.compilerVersion + "</td>");
		appendln("<td><b>Report Grenerate Date : </b></td>");
		Date now = new Date();
		appendln("<td>"+now.toString()+"</td>");
		appendln("<td><b></b></td>");
		appendln("<td></td>");
		appendln("</tr>");

		appendln("</tbody>");
		appendln("</table>");
		appendln("</div>");
		appendln("</div>");
		// ////////////////////

		appendln("</body>");
		appendln("</html>");
		return buf.toString();
	}

	public static String TestResultPage(String NavigationTitle, String content) {
		String[] titles = NavigationTitle.split("_");

		buf = new StringBuffer();
		appendln("<!DOCTYPE html>");
		appendln("<html lang=\"en\">");
		appendln("<head>");
		appendln("<meta charset=\"utf-8\" />");
		appendln("<title>Pyjama Report</title>");
		appendln("<link href=\"library/css/styles.css\" rel=\"stylesheet\" />");
		appendln("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
		appendln("</head>");

		appendln("<body>");
		appendln("<div id=\"main_content\" class=\"container-fluid\">");
		appendln("<div class=\"page-heading\">");
		appendln("<h2 class=\"page-title muted\">");
		appendln("<i class=\"micon-stats-up\"></i> Pyjama Benchmark Report");
		appendln("</h2>");
		appendln("</div>");

		appendln("<ul class=\"breadcrumb breadcrumb-main\">");
		appendln("<li><a>Pyjama Performance JUnit Test</a> <span class=\"divider\"><i class=\"icon-caret-right\"></i></span></li>");
		appendln("<li><a href=\"#\">"
				+ titles[0]
				+ "</a> <span class=\"divider\"><i class=\"icon-caret-right\"></i></span></li>");
		appendln("<li class=\"text-info\">" + titles[1] + "</li>");
		appendln("</ul>");

		appendln(content);

		appendln("<script src=\"library/js/jquery.js\"></script>");
		appendln("<script src=\"library/js/bootstrap.min.js\"></script>");
		appendln("<script src=\"library/js/chart-plugins.js\"></script>");
		appendln("<script src=\"library/js/jquery.uniform.js\"></script>");
		appendln("<script src=\"library/js/loader.js\"></script>");

		appendln("</body>");
		appendln("</html>");

		return buf.toString();
	}

	public static String Tabs_Top(String[] titles, String[] content) {
		bufTab = new StringBuffer();
		if (titles.length < 1 || content.length < 1)
			return bufTab.toString();

		Tab_appendln("<div class=\"tabbable tabs-custom\">");
		Tab_appendln("<ul class=\"nav nav-tabs\">");
		Tab_appendln("<li class=\"active\"><a href=\"#T0\" data-toggle=\"tab\">"
				+ titles[0] + "</a></li>");

		for (int i = 1; i < titles.length; i++)
			Tab_appendln("<li><a href=\"#T" + i + "\" data-toggle=\"tab\">"
					+ titles[i] + "</a></li>");

		Tab_appendln("</ul>");

		Tab_appendln("<div class=\"tab-content\">");

		Tab_appendln("<div class=\"tab-pane fade in active\" id=\"T0\">");
		Tab_appendln(content[0]);
		Tab_appendln("</div>");

		for (int i = 1; i < content.length; i++) {
			Tab_appendln("<div class=\"tab-pane fade\" id=\"T" + i + "\">");
			Tab_appendln(content[i]);
			Tab_appendln("</div>");
		}

		Tab_appendln("</div>");// close tab-content

		Tab_appendln("</div>");// close tabbable tabs-custom
		return bufTab.toString();
	}

	public static String Tabs_Left(String tabName, String[] titles,
			String[] content) {
		bufTab = new StringBuffer();
		if (titles.length < 1 || content.length < 1)
			return bufTab.toString();

		Tab_appendln("<div class=\"tabbable tabs-custom tabs-left\">");

		Tab_appendln("<ul class=\"nav nav-tabs\">");
		Tab_appendln("<li class=\"active\"><a href=\"#" + tabName
				+ "0\" data-toggle=\"tab\">" + titles[0] + "</a></li>");

		for (int i = 1; i < titles.length; i++)
			Tab_appendln("<li><a href=\"#" + tabName + i
					+ "\" data-toggle=\"tab\">" + titles[i] + "</a></li>");

		Tab_appendln("</ul>");

		Tab_appendln("<div class=\"tab-content\">");

		Tab_appendln("<div class=\"tab-pane active\" id=\"" + tabName + "0\">");
		Tab_appendln(content[0]);
		Tab_appendln("</div>");

		for (int i = 1; i < content.length; i++) {
			Tab_appendln("<div class=\"tab-pane \" id=\"" + tabName + i + "\">");
			Tab_appendln(content[i]);
			Tab_appendln("</div>");
		}

		Tab_appendln("</div>"); // close tab-content
		Tab_appendln("</div>");// close tabbable tabs-custom tabs-left
		return bufTab.toString();
	}

	/* Charts and Tables */

	public static String Compile_Table(String[][] content) {
		int rowNumber = content.length;
		int columnNumber = content[0].length;

		bufChart = new StringBuffer();
		Chart_appendln("<div class=\"well widget\">");

		Chart_appendln("<div class=\"widget-header\">");
		Chart_appendln("<h3 class=\"title\">Compile JUnit Testing Results</h3>");
		Chart_appendln("</div>");

		Chart_appendln("<div class=\"widget-content\">");
		Chart_appendln("<table class=\"table table-striped\">");

		Chart_appendln("<thead>");
		Chart_appendln("<tr>");
		for (int i = 0; i < columnNumber; i++)
			Chart_appendln("<th>" + content[0][i] + "</th>");
		Chart_appendln("</tr>");
		Chart_appendln("</thead>");

		Chart_appendln("<tbody>");
		for (int i = 1; i < rowNumber; i++) {
			Chart_appendln("<tr>");
			for (int j = 0; j < columnNumber; j++) {
				Chart_appendln(content[i][j]);
			}
			Chart_appendln("</tr>");
		}
		Chart_appendln("</tbody>");

		Chart_appendln("</table>");
		Chart_appendln("</div>");
		Chart_appendln("</div>");
		return bufChart.toString();
	}

	public static String Correctness_Table(String[][] content) {
		int rowNumber = content.length;
		int columnNumber = content[0].length;

		bufChart = new StringBuffer();
		Chart_appendln("<div class=\"well widget\">");

		Chart_appendln("<div class=\"widget-header\">");
		Chart_appendln("<h3 class=\"title\">Correctness JUnit Testing Results</h3>");
		Chart_appendln("</div>");

		Chart_appendln("<div class=\"widget-content\">");
		Chart_appendln("<table class=\"table table-striped\">");

		Chart_appendln("<thead>");
		Chart_appendln("<tr>");
		for (int i = 0; i < columnNumber; i++)
			Chart_appendln("<th>" + content[0][i] + "</th>");
		Chart_appendln("</tr>");
		Chart_appendln("</thead>");

		Chart_appendln("<tbody>");
		for (int i = 1; i < rowNumber; i++) {
			Chart_appendln("<tr>");
			for (int j = 0; j < columnNumber; j++) {
				Chart_appendln(content[i][j]);
			}
			Chart_appendln("</tr>");
		}
		Chart_appendln("</tbody>");

		Chart_appendln("</table>");
		Chart_appendln("</div>");
		Chart_appendln("</div>");
		return bufChart.toString();
	}

	public static String Stability_Table(String[][] content, int testNumber) {
		int rowNumber = content.length;
		int columnNumber = content[0].length;

		bufChart = new StringBuffer();
		Chart_appendln(" <div class=\"well widget\">");

		Chart_appendln("<div class=\"widget-header\">");
		Chart_appendln("<h3 class=\"title\">Stability JUnit Testing Results</h3>");
		Chart_appendln("</div>");

		Chart_appendln("<div class=\"widget-content\">");
		Chart_appendln("Notice: Red row is slower than basic, Green row is faster than basic and Yellow is near basic.");
		Chart_appendln("<table class=\"table\">");

		Chart_appendln("<thead>");
		Chart_appendln("<tr>");
		for (int i = 0; i < columnNumber; i++)
			Chart_appendln("<th>" + content[0][i] + "</th>");
		Chart_appendln("</tr>");
		Chart_appendln("</thead>");

		Chart_appendln("<tbody>");
		for (int i = 1; i < rowNumber; i++) {
			int different = Integer.parseInt(content[i][columnNumber - 1])
					- Integer.parseInt(content[i % testNumber == 0 ? testNumber
							: i % testNumber][columnNumber - 1]);

			String color;
			if (different > SettingConstans.STABILITY_DIFF_MS)
				color = "error";
			else if (different < -SettingConstans.STABILITY_DIFF_MS)
				color = "success";
			else
				color = "warning";

			Chart_appendln("<tr class=\"" + color + "\">");
			for (int j = 0; j < columnNumber; j++) {
				Chart_appendln("<td>" + content[i][j] + "</td>");
			}
			Chart_appendln("</tr>");
		}
		Chart_appendln("</tbody>");
		Chart_appendln("</table>");

		Chart_appendln("</div>");
		Chart_appendln("</div>");
		return bufChart.toString();
	}

	public static String SpeedUp_LineChart(int[][] data, String[] lineName) {
		int rowNumber = data.length;
		int columnNumber = data[0].length;
		String[] colors = { "#425eb8", "#409627", "#b64b53", "#3f4143",
				"#50204a", "#949323" };

		bufChart = new StringBuffer();

		String[] RunTime = new String[rowNumber];

		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				//if (data[i][j] != 0)
					RunTime[i] += data[i][j] + ",";
			}
			if (RunTime[i] != null)
				RunTime[i] = RunTime[i].substring(4, RunTime[i].length() - 1);
		}

		Chart_appendln("<div class=\"well widget\">");
		Chart_appendln("<div class=\"widget-header\">");
		Chart_appendln("<h3 class=\"title\">Running Time JUnit Testing Results</h3>");
		Chart_appendln("</div>");
		int index = 0;
		for (String item : lineName) {
			Chart_appendln("<h7 style=\" color: " + colors[index++] + " \">"
					+ item + "</h7> </br>");
			if (index >= colors.length)
				index = 0;
		}

		Chart_appendln("<div id=\"line-chart-div\" style=\"width:100%; height:300px;\" data-content=\"[");

		String timeData = "";
		for (int i = 0; i < rowNumber; i++) {
			timeData += "[" + RunTime[i] + "],";
		}
		timeData = timeData.substring(0, timeData.length() - 1);
		Chart_appendln(timeData);
		Chart_appendln("]\" data-colors='[ \"#425eb8\",\"#409627\",\"#b64b53\",\"#3f4143\",\"#50204a\" ]'></div>");
		Chart_appendln("</div>");

		//System.out.println(bufChart.toString());
		return bufChart.toString();
	}

	public static StringBuffer MemoryUsage_BarChart(long[][] value, String[] title) {
		bufChart = new StringBuffer();
		Chart_appendln("<div class=\"well widget\">");

		Chart_appendln("<div class=\"widget-header\">");
		Chart_appendln("<h3 class=\"title\">Memory Usage Rate JUnit Testing Results</h3>");
		Chart_appendln("</div>");
		String[] colors = { "#425eb8", "#409627", "#b64b53", "#3f4143",
				"#50204a" };
		int index = 0;
		for (String item : title) {
			Chart_appendln("<h7 style=\" color: " + colors[index++] + " \">"
					+ item + "</h7> ");
			if (index >= colors.length)
				index = 0;
		}

		Chart_appendln("<div id=\"vertical-bar-div\" data-value='[");
		for (int i = 0; i < title.length - 1; i++) {
			Chart_appendln(Arrays.toString(value[i])+",");
		}
		Chart_appendln(Arrays.toString(value[title.length-1])+",");
		Chart_appendln("]' data-ticks='[\"10% Complete\",\"20% Complete\",\"30% Complete\",\"40% Complete\",\"50% Complete\",\"60% Complete\",\"70% Complete\",\"80% Complete\",\"90% Complete\",\"100% Complete\"]' "
				+ "data-colors='[\"#425eb8\",\"#409627\",\"#b64b53\",\"#3f4143\",\"#50204a\" ]' style=\"width:100%;height:300px;\"></div>");
		Chart_appendln("</div>");

		return bufChart;
	}

	public static StringBuffer CPU_PieChart(double[] cpu) {
		bufChart = new StringBuffer();
		Chart_appendln("<div class=\"well widget\">");

		Chart_appendln("<div class=\"widget-header\">");
		Chart_appendln("<h3 class=\"title\">CPU Usage Rate JUnit Testing Results</h3>");
		Chart_appendln("</div>");
		DecimalFormat f = new DecimalFormat("##.00"); 
		Chart_appendln("<div id=\"pie-div\" style=\"width:100%;height:300px;\" data-content=\"[['CPU 1 : "
				+ f.format(cpu[1])+ " %',"+ f.format(cpu[1])+ "],['CPU 2 : "
				+ f.format(cpu[2])
				+ " %', "
				+ f.format(cpu[2])
				+ "], ['CPU 3 : "
				+ f.format(cpu[2])
				+ " %', "
				+ f.format(cpu[3])
				+ "], ['CPU 4 : "
				+ f.format(cpu[4])
				+ " %', "
				+ f.format(cpu[4])
				+ "],['Idle', 1]]\" data-colors='[ \"#feb847\",\"#425eb8\",\"#409627\",\"#b64b53\",\"#3f4143\"]'></div>");
		Chart_appendln("</div>");
		return bufChart;
	}

}
