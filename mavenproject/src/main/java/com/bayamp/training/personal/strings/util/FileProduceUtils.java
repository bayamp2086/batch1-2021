package com.bayamp.training.personal.strings.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileProduceUtils {

	private static final String FILE_PATH = "src/files/product.txt";
	private static Map<String, String> produceMap = new HashMap<String, String>();

	static {
		readFileContent();
	}

	public static String getProduceType(String produce) {
	
		return produceMap.get(produce);
	}

	private static void readFileContent() {
		System.out.println("Rading file");

		try {

			File file = new File(FILE_PATH);
			
			file.exists();
		
			FileReader fileReader = new FileReader(file);

			BufferedReader reader = new BufferedReader(fileReader);

			String line = "";
			
			while ((line = reader.readLine()) != null) {

				String[] produceArray = line.split("-");
				String fruit = produceArray[0].trim();
				String produceType = produceArray[1].trim();

				produceMap.put(fruit, produceType);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
