package pl.traza;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {
	@Test
	public void zeroCgives32F(){
		Temperature temperature = new Temperature();
		temperature.setTemperatureC(0.0f);
		//Assert.assertEquals("0C should give 32F", 32.0, temperature.getTemperatureF( temperature.setTemperatureC(0F)), 0.01);
		Assert.assertEquals("0C should be 32F", 32.0f, temperature.getTemperatureF().floatValue(), 0.01f);
	}
}
