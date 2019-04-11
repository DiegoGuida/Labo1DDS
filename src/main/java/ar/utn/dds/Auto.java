package ar.utn.dds;

public class Auto {
	
	public boolean encendido;
	public int temperatura;
	public double combustible;

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public double getCombustible() {
		return combustible;
	}

	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}

	
	public Auto() {
		super();
		this.encendido = false;
		this.combustible = 0;
		this.temperatura = 0;
	}

	
	public void encender() throws SinCombustibleException {
		
		if (this.getCombustible()<0.001) {
			throw new SinCombustibleException();
		}else {
			this.setEncendido(true);
			this.setTemperatura(70);
		}

		
	}
	
	
	
}