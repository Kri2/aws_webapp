package pl.traza;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class TemperatureFormDTO {
	//later change to string and do regex
	@NotEmpty(message="Type in the temperature value.")
	//@Pattern(regexp="[-+]?[0-9]+[\\.]?[0-9]?", message="only numbers please")
	@Pattern(regexp="[-+]?[0-9]*\\.?[0-9]+", message="only numbers please")
	private String temperatureC;
	//private Float temperatureF;
	public void setTemperatureC(String temperatureC){
		this.temperatureC = temperatureC.trim();
	}
	public String getTemperatureC(){
		return this.temperatureC;
	}
	//public void setTemperatureF(Float temperatureF){
	//	this.temperatureF = temperatureF;
	//}
	//public Float getTemperatureF(){
	//	return this.temperatureF;
	//}
}
