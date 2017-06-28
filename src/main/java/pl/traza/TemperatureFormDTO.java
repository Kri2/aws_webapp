package pl.traza;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class TemperatureFormDTO {
	//later change to string and do regex
	@NotNull(message="Type in the temperature value.")
	@Range(min=-274, max=10000, message="type in temperature (-273 to 10000)")
	private Float temperatureC;
	//private Float temperatureF;
	public void setTemperatureC(Float temperatureC){
		this.temperatureC = temperatureC;
	}
	public Float getTemperatureC(){
		return this.temperatureC;
	}
	//public void setTemperatureF(Float temperatureF){
	//	this.temperatureF = temperatureF;
	//}
	//public Float getTemperatureF(){
	//	return this.temperatureF;
	//}
}
