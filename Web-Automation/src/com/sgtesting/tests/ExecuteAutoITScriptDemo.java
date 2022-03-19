package com.sgtesting.tests;

public class ExecuteAutoITScriptDemo {

	public static void main(String[] args) {
		
		executeDemo();
		
	}
	private static void executeDemo()
	{
		try
		{
			String path="C:\\AutoIT\\Sample.exe";
			Runtime.getRuntime().exec(path);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
