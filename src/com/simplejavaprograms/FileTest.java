package com.simplejavaprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Sathyapriya.K
 *
 */
public class FileTest {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/**
		 * 
		 */
		try {
			for(String inputFile : args) {
				if(!inputFile.endsWith(".txt")) {
					continue;
				}
				FileReader fr = new FileReader("newsfeed\\"+inputFile);
				BufferedReader br = new BufferedReader(fr);
				String sCurrentLine;
				FileWriter fos = null;
				BufferedWriter bw = null;
				int index = 0;
				while ((sCurrentLine = br.readLine()) != null) {
					if (index == 0) {
						File f = new File("archive\\" + sCurrentLine + ".txt");
						if (!f.exists()) {
							f.createNewFile();
						}
						fos = new FileWriter(f, true);
						bw = new BufferedWriter(fos);
						System.out.println(sCurrentLine + ".txt : " + sCurrentLine);
					} else {
						bw.append(sCurrentLine);
						bw.append("\n");
					}
					index++;
				}
				br.close();
				bw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
