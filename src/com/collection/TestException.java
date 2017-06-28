package com.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) throws IOException {
		gofurther();
	}

	private static void gofurther()  {
		try {
			BufferedReader rd = new BufferedReader(new FileReader(new File("")));

			String inputLine = null;
			while ((inputLine = rd.readLine()) != null)
				System.out.println(inputLine);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
