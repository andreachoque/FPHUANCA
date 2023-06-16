package Finalparcial;
public class zonaUrbana {
	private String nomZona;
	private colaViviendas cv;
	
	public zonaUrbana(String a, colaViviendas b){
		nomZona = a;
		cv = b;
	}

	public String getNomZona() {
		return nomZona;
	}

	public void setNomZona(String nomZona) {
		this.nomZona = nomZona;
	}

	public colaViviendas getCv() {
		return cv;
	}

	public void setCv(colaViviendas cv) {
		this.cv = cv;
	}
	public void mostrar() {
		System.out.println("\t "+" NOMBRE DE ZONA "+nomZona);
		cv.mostrar();
	}
}
