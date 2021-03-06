package starter;

public class Temperatura {
	
	private int temperatura;
	
	public Temperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public String mensajeTemperaturaCel(float tempe) {
		String mensaje = "La temperatura en celsius es: "+tempe;
		return mensaje;
	}
	
	public String mensajeTemperaturaFar(float tempe) {
		String mensaje = "La temperatura en fahrenheit es: "+tempe;
		return mensaje;
	}
	
	public String convertirTemperaturaCaF(float temp) {
		float valorF = (temp*9/5)+32;
		String mensaje = "La temperatura en fahrenheit es: "+valorF;
		return mensaje;
	}
	
	public String convertirTemperaturaFaC(float temp) {
		float valorC = (temp-32)*(5/9);
		String mensaje = "La temperatura en celsius es: "+valorC;
		return mensaje;
	}

}
