package sample1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MTLoginTest {

	public static void main(String[] args) throws IOException {
		// To specify file location
		FileInputStream fi = new FileInputStream("./properties\\mydata.properties");
		
		//Create object for properties
		Properties propObj = new Properties();
		
		//to load properties
		propObj.load(fi);
		
		//To read data
		System.out.println(propObj.getProperty("baseUrl"));
		System.out.println(propObj.getProperty("userId"));
		System.out.println(propObj.getProperty("passWd"));

	}

}
