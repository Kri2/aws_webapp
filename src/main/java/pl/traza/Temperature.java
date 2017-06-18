package pl.traza;

public class Temperature {
	private Float temperatureC;
	private Float temperatureF;
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
