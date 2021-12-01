package starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temperatura.mensaje")
public class TemperaturaProperties {
	
	private int temperatura =20;

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

}
