package Domain.Bean;

import java.util.ArrayList;
import java.util.List;

public class Data {
	public Data(){};
	public Data(String version){
		this.version=version;
	}
	private List<Result> list = new ArrayList<Result>();
	
	private String version;
	
	public List<Result> getList() {
		return list;
	}
	public void setList(List<Result> list) {
		this.list = list;
	}
	public void addResult(Result result){
		this.list.add(result);
	}
	
	public void ReSetResult(Result result){
		for(Result item :this.list){
			if (item.getTestName().equals(result.getTestName()))
				this.list.set(this.list.indexOf(item), result);
		}
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
