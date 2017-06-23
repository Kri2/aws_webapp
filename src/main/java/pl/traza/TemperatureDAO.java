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
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Repository;
/*
@Repository
public interface TemperatureDAO extends Repository<Temperature,Long>{
	public Temperature findById(Long id);
}*/

@Repository
public interface TemperatureDAO extends CrudRepository<Temperature, Long> {
    public Temperature findById(Long id);
}