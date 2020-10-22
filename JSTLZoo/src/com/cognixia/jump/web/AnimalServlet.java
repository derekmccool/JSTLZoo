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
import com.cognixia.jump.daos.AnimalDao;
import com.cognixia.jump.daos.AnimalDaoImpl;
import com.cognixia.jump.models.Animal;

public class AnimalServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private AnimalDao animalDao;
  
	@Override
	public void init() {
		animalDao = new AnimalDaoImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Animal> allAnimals = animalDao.getAllAnimals();
		request.setAttribute("allAnimals", allAnimals);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp_folder/animal-list.jsp");
		
		dispatcher.forward(request, response);
	}


	@Override
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
