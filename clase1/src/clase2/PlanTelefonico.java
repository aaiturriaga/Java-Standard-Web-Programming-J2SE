package clase2;

//ALT+SHIFT+S
//Para generar automaticamente getters y settes

public class PlanTelefonico{
	
	private Integer gb;
	private Integer minutos;
	private Integer sms;
	private String nombre;
	
	//Por defecto
	public PlanTelefonico() {
	
		this.gb = 1;
		this.minutos = 100;
		this.sms = 10000;
		this.nombre = "BASE";
	
	}
	
	//parametrizado
	public PlanTelefonico(Integer gb, Integer minutos, Integer sms, String nombre) {
	
		this.gb = gb;
		this.minutos = minutos;
		this.sms = sms;
		this.nombre = nombre;
	
	}
	
	public Integer getGb() {
		return gb;
	}
	
	public void setGb(Integer gb) {
		this.gb = gb;
	}
	
	public Integer getMinutos() {
		return minutos;
	}
	
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}
	
	public Integer getSms() {
		return sms;
	}
	
	public void setSms(Integer sms) {
		this.sms = sms;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setString(String nombre) {
		this.nombre = nombre;
	}

	//ALT+SHIFT+S
	@Override
	public String toString() {
		return "PlanTelefonico [gb=" + gb + ", minutos=" + minutos + ", sms=" + sms + ", nombre=" + nombre + "]";
	}	
	
}
