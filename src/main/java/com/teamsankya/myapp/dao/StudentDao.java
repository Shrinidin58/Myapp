package com.teamsankya.myapp.dao;

import com.teamsankya.myapp.dto.MasterBean;

public interface StudentDao {
	public void createStudent(MasterBean mbean);
	public MasterBean getStuednt(int id);
	public void updateData(int id, String name);
	public void deleteBean(int id);

}		
