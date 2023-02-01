package org.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class a {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=new FileInputStream("D:\\Java\\OMRBranchAdactinAutomation\\config\\config.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		Object object = properties.get("jvmpath");
		String value=(String)object;
		System.out.println(value);

		// Location 
		String path = System.getProperty("user.dir");
		System.out.println(path);
	
	
	
	}



}
