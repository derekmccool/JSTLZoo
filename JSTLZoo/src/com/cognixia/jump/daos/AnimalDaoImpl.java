package com.cognixia.jump.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.connections.ConnectionManager;
import com.cognixia.jump.models.Animal;

public class AnimalDaoImpl implements AnimalDao{

	private Connection conn = ConnectionManager.getConnection();
	
	@Override
	public List<Animal> getAllAnimals() {
		// TODO Auto-generated method stub

		List<Animal> animalList = new ArrayList<>();
		try(PreparedStatement pstmt = conn.prepareStatement("select * from animals");
				ResultSet rs = pstmt.executeQuery();){
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int population = rs.getInt("population");
				animalList.add(new Animal(id, name, population));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return animalList;
	}

}
