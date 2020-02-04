package com.adactln.helpers;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager fr =new FileReaderManager();
		return fr;
	}
	public ConfigurationReader getcrinstance() throws IOException{
		ConfigurationReader cr =new ConfigurationReader();
		return cr;
	}

}
