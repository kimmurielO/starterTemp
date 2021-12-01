package starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Temperatura.class)
@EnableConfigurationProperties(TemperaturaProperties.class)
public class TemperaturaAutoconfigure {

	private final TemperaturaProperties properties;
	
	public TemperaturaAutoconfigure(TemperaturaProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Temperatura saludo() {
		System.out.println("Temperatura: "+properties.getTemperatura());
		return new Temperatura(properties.getTemperatura());
	}

}
