package Utility.JSONDatabaseHelper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Domain.Bean.Data;
import Domain.Bean.Result;

import com.google.gson.Gson;

public class resultWriterHelper {

	private FileWriter writer;

	public boolean write(Data data, String folderName, String directoryName,
			String fileName, boolean rewrite) {
		try {

			File theDir = new File(folderName);
			// if the directory does not exist, create it
			if (!theDir.exists())
				theDir.mkdir();
			theDir = new File(folderName + "/" + directoryName);
			// if the directory does not exist, create it
			if (!theDir.exists())
				theDir.mkdir();
			String file = folderName + "/" + directoryName + "/" + fileName
					+ ".json";

			Gson gson = new Gson();

			if (rewrite) {
				Data oldData = read(file);
				if (oldData.getList() != null) {
					data.getList().addAll(oldData.getList());
				}
			}
			else//false replace the same name
			{
				List<Result> copy = new ArrayList<Result>(data.getList());
					Data oldData = read(file);
					if (oldData.getList() != null) {
						for (Result oldItem :oldData.getList()) {
							boolean flag=true;
							for (Result item :data.getList()) {
								if(oldItem.equal(item))
									flag=false;
							}
							if(flag)
								copy.add(oldItem);
						}
					}	
				data.setList(copy);
			}	
			

			writer = new FileWriter(file);
			String json = gson.toJson(data);

			writer.write(json);
			writer.close();
			System.out.println(directoryName+"Done!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean writeHTML(String name, String context) throws Exception {
		File f = new File("Report/"+name + ".html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(context);
		bw.close();
		return true;
	}
	
	public Data read(String file) throws IOException {
		File fileCheck = new File(file);
		if (!fileCheck.exists())
			return new Data();

		String json = readFile(file);
		Gson gson = new Gson();
		return gson.fromJson(json, Data.class);
	}

	private String readFile(String file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		reader.close();
		return stringBuilder.toString();
	}

}
