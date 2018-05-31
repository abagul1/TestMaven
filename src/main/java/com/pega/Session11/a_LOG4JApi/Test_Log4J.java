package com.pega.Session11.a_LOG4JApi;

import org.apache.log4j.Logger;

public class Test_Log4J {

	//Add the dependency
	//Add the log4j in main/resources
	//Logger

	public static void main(String[] args) {

		Logger log=Logger.getLogger ("devpinoyLogger");

		log.debug ("Starting the test");

		log.debug ("Executing the tests");

		log.debug ("Ending");

	}

}
