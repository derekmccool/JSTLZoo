package com.cognixia.jump.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.connections.ConnectionManager;
import com.cognixia.jump.models.Exhibit;

public class ExhibitDaoImpl implements ExhibitDao{

	private Connection conn = ConnectionManager.getConnection();

	
	@Override
	public List<Exhibit> getAllExhibits() {
		
		List<Exhibit> exhibitList = new ArrayList<>();
		
		try(PreparedStatement pstmt = conn.prepareStatement("select * from exhibit");
				ResultSet rs = pstmt.executeQuery();){
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String picture = rs.getString("picture");
				boolean open = rs.getBoolean("open");
				exhibitList.add(new Exhibit(id, name, picture, open));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return exhibitList;
	}

}
