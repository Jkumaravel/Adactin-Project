package com.adactin.properties;

import com.adactin.helper.ConfigurationReader;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	
	public static FileReaderManager getInstance() {
		FileReaderManager helper = new FileReaderManager();
        return helper;
	}
	
	
	public ConfigurationReader getInstanceCR() throws Throwable {
		ConfigurationReader cr = new ConfigurationReader();
        return cr;
	}
	

}
