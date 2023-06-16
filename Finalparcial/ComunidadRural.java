package Finalparcial;
public class ComunidadRural {
	private String nomComunidad;
	private colaViviendas colaV;
	
	public ComunidadRural(String a, colaViviendas b){
		nomComunidad = a;
		colaV = b;
	}

	public String getNomComunidad() {
		return nomComunidad;
	}

	public void setNomComunidad(String nomComunidad) {
		this.nomComunidad = nomComunidad;
	}

	public colaViviendas getColaV() {
		return colaV;
	}

	public void setColaV(colaViviendas colaV) {
		this.colaV = colaV;
	}
	public void mostrar() {
		System.out.println("\t"+"NOMBRE DE LA COMUNIDAD : "+nomComunidad);
		colaV.mostrar();
	}
	
}
