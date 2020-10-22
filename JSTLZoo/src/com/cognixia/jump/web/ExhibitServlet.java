package com.cognixia.jump.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognixia.jump.connections.ConnectionManager;

import com.cognixia.jump.daos.ExhibitDao;
import com.cognixia.jump.daos.ExhibitDaoImpl;
import com.cognixia.jump.models.Exhibit;


public class ExhibitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	private ExhibitDao exhibitDao;
  
	@Override
	public void init() {
		exhibitDao = new ExhibitDaoImpl();
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Exhibit> allExhibits = exhibitDao.getAllExhibits();
		request.setAttribute("allExhibits", allExhibits);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp_folder/exhibit-list.jsp");
		
		dispatcher.forward(request, response);	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	@Override
	public void destroy() {
		try {
			ConnectionManager.getConnection().close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
