package com.adaticn.helper;

public class FileReaderManager {



	private FileReaderManager() {  // Restrict to create object in another class

	}



	public static FileReaderManager getInstance() {

		FileReaderManager f = new FileReaderManager();

		return f;

	}

	public ConfigurationReader getInstanceCr() throws Throwable {

		ConfigurationReader c = new ConfigurationReader();
		return c;

	}


}
