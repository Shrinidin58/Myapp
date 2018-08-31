package com.teamsankya.myapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.myapp.dao.StudentDao;
import com.teamsankya.myapp.util.StuddentServiceManager;

public class UpdateName extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("regno");
		String name = req.getParameter("fname");
		
		StudentDao dao = StuddentServiceManager
				.getInstence()
				.daoGenarater();
		dao.updateData(Integer.parseInt(id), name);
		
		
	}

}
