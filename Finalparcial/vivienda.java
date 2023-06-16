package Finalparcial;


public class vivienda {
	private  int nroPropiedad;
	private String servicioSanitario;
	private String tipoEnergia;
	private String usaCocina;
	private String eliminaBasura;
	private String comunicacion;
	
	public vivienda(int a, String b, String c, String sw, String d, String e){
		nroPropiedad = a;
		servicioSanitario = b;
		tipoEnergia = c;
		usaCocina = sw;
		eliminaBasura = d;
		comunicacion = e;
	}
	
	public int getNroPropiedad() {
		return nroPropiedad;
	}

	public void setNroVivienda(int nroVivienda) {
		this.nroPropiedad = nroVivienda;
	}

	public String getServicioSanitario() {
		return servicioSanitario;
	}

	public void setServicioSanitario(String servicioSanitario) {
		this.servicioSanitario = servicioSanitario;
	}

	public String getTipoEnergia() {
		return tipoEnergia;
	}

	public void setTipoEnergia(String tipoEnergia) {
		this.tipoEnergia = tipoEnergia;
	}

	public String getUsaCocina() {
		return usaCocina;
	}

	public void setUsaCocina(String usaCocina) {
		this.usaCocina = usaCocina;
	}

	public String getEliminaBasura() {
		return eliminaBasura;
	}

	public void setEliminaBasura(String eliminaBasura) {
		this.eliminaBasura = eliminaBasura;
	}

	public String getComunicacion() {
		return comunicacion;
	}

	public void setComunicacion(String comunicacion) {
		this.comunicacion = comunicacion;
	}
	public void mostrar() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("No Vivienda : "+nroPropiedad);
		System.out.println("Servicio Sanitario : "+servicioSanitario);
		System.out.println("Tipo de energia : "+tipoEnergia);
		System.out.println("Usa Cocina : "+usaCocina);
		System.out.println("Elimina Basura : "+eliminaBasura);
		System.out.println("Comunicacion : "+comunicacion);
	}
	
}
