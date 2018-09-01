package com.teamsankya.myapp.util;

import java.io.FileReader;
import java.util.Properties;


import com.teamsankya.myapp.dao.StudentDao;


public class StuddentServiceManager {
	private StuddentServiceManager() {}
	
	private static final StuddentServiceManager STUDENT_SERVICE_MANAGER = new StuddentServiceManager();
	public static StuddentServiceManager getInstence() {
		return STUDENT_SERVICE_MANAGER;
	}
	public StudentDao daoGenarater() {
		Properties properties = new Properties();
		String path = getClass().getResource("/student-config.properties").getPath();
		
		try {
			FileReader fileReader = new FileReader(path);
			properties.load(fileReader);
		} catch (Exception e1) { 
			e1.printStackTrace();
		}
		StudentDao dao = null;
		
		try {
			dao = (StudentDao)Class
					.forName(properties.getProperty("dao_class"))
					.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}
	

}
