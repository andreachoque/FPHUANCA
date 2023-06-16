package Finalparcial;
public class nodoM {
	private municipio m;
	private nodoM izq, der;
	
	public nodoM(){
		izq=der=null;
	}

	public municipio getM() {
		return m;
	}

	public void setM(municipio m) {
		this.m = m;
	}

	public nodoM getIzq() {
		return izq;
	}

	public void setIzq(nodoM izq) {
		this.izq = izq;
	}

	public nodoM getDer() {
		return der;
	}

	public void setDer(nodoM der) {
		this.der = der;
	}
	
}
