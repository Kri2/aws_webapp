package pl.traza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="unit_converter")
public class Temperature {
	@Id
	private Long id;
	
	@Column(name="temperature_C")
	private Float temperatureC;
	@Column(name="temperature_F")
	private Float temperatureF;
	
	public void setId(Long id){
		this.id=id;
	}
	public Long getId(){
		return this.id;
	}
	public void setTemperatureC(Float temperatureC){
		this.temperatureC=temperatureC;
		this.temperatureF=convertToFahrenheit(temperatureC);
	}
	public void setTemperatureF(Float temperatureF){
		this.temperatureC=convertToCelsius(temperatureF);
		this.temperatureF=temperatureF;
	}
	public Float getTemperatureC(){
		return this.temperatureC;
	}
	public Float getTemperatureF(){
		return this.temperatureF;
	}
	private Float convertToFahrenheit(Float temperatureCesius){
		Float temperatureFahrenheit = temperatureCesius * 9/5 + 32;
		//return 1.0F;
		return temperatureFahrenheit;
	}
	private Float convertToCelsius(Float temperatureFahrenheit){
		Float temperatureCelsius = (temperatureFahrenheit - 32) * 5/9;
		return temperatureCelsius;
	}
}
