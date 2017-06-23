package pl.traza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TemperatureDAOold {
	@Autowired
	private DataSource dataSource;
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
    public Temperature findWithEM() {
        // jakieś operacje z EntityManagerem ...
		Temperature temperature = entityManager.find(Temperature.class, 1L);
		return temperature;
    }

	private Temperature temperature;
	public Temperature getTemperature(){
		return this.temperature;
	}
	/*
	public void setTemperature(Temperature temperature){
		this.temperature=temperature;
	}*/
	public void setTemperature(Temperature temperature){
		this.temperature = temperature;
		String sql = "INSERT INTO unit_converter (temperature_C,temperature_F) VALUES (?,?)";
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setFloat(1,temperature.getTemperatureC());
			ps.setFloat(2, temperature.getTemperatureF());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){}
			}
		}
	}
	
	public List<Temperature> temperatureList(){
		
		String sql = "SELECT * FROM unit_converter WHERE id=?";
		List<Temperature> list = new ArrayList<>();
		Connection conn = null;
		Integer temperature_id = 0;
		try {
		    conn = dataSource.getConnection();
		    PreparedStatement ps = conn.prepareStatement(sql);
		    Temperature temperature = null;
		    temperature_id++;
		    for(int i=0;i<3;i++){	
		    	ps.setInt(1, temperature_id);
		    	ResultSet rs = ps.executeQuery();
	    	
		    	if(rs.next()) {
		    		System.out.println("iteracja nr: "+ temperature_id);
		    		temperature = new Temperature();
		    		temperature.setTemperatureC(rs.getFloat("temperature_C"));
		    		//temperature.setTemperatureF(rs.getFloat("temperature_F"));
		    		list.add(temperature);
		    		temperature_id++;
		    		rs.close();
		    	}
		    	else break;
		    }   
		    ps.close();
		    return list;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		} finally {
		    if (conn != null) {
		        try {
		            conn.close();
		        } catch (SQLException e) {}
		    }
		}

	}
public List<Temperature> temperatureListAll(){
		
		String sql = "SELECT * FROM unit_converter";
		List<Temperature> list = new ArrayList<>();
		Connection conn = null;
		Integer temperature_id = 0;
		try {
		    conn = dataSource.getConnection();
		    PreparedStatement ps = conn.prepareStatement(sql);
		    Temperature temperature = null;
		    temperature_id++;	
		    //ps.setInt(1, temperature_id);
		    ResultSet rs = ps.executeQuery();
	    	
		    while(rs.next()) {
		    	System.out.println("iteracja nr: "+ temperature_id);
		    	temperature = new Temperature();
		    	temperature.setTemperatureC(rs.getFloat("temperature_C"));
		    	//temperature.setTemperatureF(rs.getFloat("temperature_F"));
		    	list.add(temperature);
		    	temperature_id++;
		    	
		    }
		    rs.close();
		       
		    ps.close();
		    return list;
		} catch (SQLException e) {
		    throw new RuntimeException(e);
		} finally {
		    if (conn != null) {
		        try {
		            conn.close();
		        } catch (SQLException e) {}
		    }
		}

	}

}
