package pl.traza;

import org.springframework.stereotype.Repository;

@Repository
public class TemperatureDAO {
	private Temperature temperature;
	public Temperature getTemperature(){
		return this.temperature;
	}
	public void setTemperature(Temperature temperature){
		this.temperature=temperature;
	}
}
