package starter;

public class Temperatura {
	
	private int temperatura;
	
	public Temperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public String mensajeSaludo() {
		int valorF = (temperatura*9/5)+32;
		String mensaje = "La temperatura en fahrenheit es: "+valorF;
		return mensaje;
	}

}
