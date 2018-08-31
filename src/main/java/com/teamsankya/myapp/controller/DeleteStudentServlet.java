package com.teamsankya.myapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamsankya.myapp.dao.StudentDao;
import com.teamsankya.myapp.util.StuddentServiceManager;

public class DeleteStudentServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("regno"));
		
		
		StudentDao dao = StuddentServiceManager
				.getInstence()
				.daoGenarater();
		dao.deleteBean(id);
		
	}

}
