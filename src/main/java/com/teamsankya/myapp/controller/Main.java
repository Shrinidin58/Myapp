package com.teamsankya.myapp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.teamsankya.myapp.dao.StudentDao;
import com.teamsankya.myapp.dto.MasterBean;
import com.teamsankya.myapp.util.StuddentServiceManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StudentDao dao = StuddentServiceManager
				.getInstence()
				.daoGenarater();
		dao.getStuednt(6);

	}

}






/*
@Override
public MasterBean getStuednt(int id) 
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/team_sankya?user=root&password=root"))
		{
			con.setAutoCommit(false);
			try(PreparedStatement pstmt = con.prepareStatement("select * from student_info where regno=?");
					PreparedStatement pstmt2 = con.prepareStatement("select * from guardian_info where regno=?");
					PreparedStatement pstmt3 = con.prepareStatement("select * from student_addressinfo where regno=?"))

			{
				pstmt.setInt(1, id);
				
				
				try(ResultSet rs =pstmt.executeQuery())
				{
					if(rs.next())
					{
						System.out.println("student found");
						int eid = rs.getInt("regno");
						String fname = rs.getString("fname");
						String mname = rs.getString("mname");
						String lname = rs.getString("lname");
						System.out.println(eid);
						System.out.println(fname);
						System.out.println(mname);
						System.out.println(lname);
					}

				}
				
				pstmt2.setInt(1, id);
				try(ResultSet rs1 =pstmt2.executeQuery())
				{
					if(rs1.next())
					{


						String gfname = rs1.getString("gfname");
						String gmname = rs1.getString("gmname");
						String glname = rs1.getString("glname");

						System.out.println(gfname);
						System.out.println(gmname);
						System.out.println(glname);
					}

				}
				pstmt3.setInt(1, id);
				try(ResultSet rs2 =pstmt3.executeQuery())
				{
					if(rs2.next())
					{


						String addrt = rs2.getString("addr_type");
						String addr1 = rs2.getString("addr1");
						String addr2 = rs2.getString("addr2");
						String city = rs2.getString("city");
						int pin = rs2.getInt("pincode");
						System.out.println(addrt);
						System.out.println(addr1);
						System.out.println(addr2);
						System.out.println(city);
						System.out.println(pin);
					}
				}
			}

		}


		con.commit();

	}


}}
catch (Exception e) {
e.printStackTrace();		}




return null;
}*/
