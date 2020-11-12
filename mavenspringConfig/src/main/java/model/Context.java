package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

	@Bean (name="temperatureBean") 
	   public Centigrade createCentigradeBean(){
	      return new Centigrade();
	   }
	
	@Bean (name="temperatureBean2") 
	   public Fahrenheit createFahrenheitBean(){
	      return new Fahrenheit();
	   }
	
}
