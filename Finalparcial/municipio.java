package Finalparcial;

import java.util.*;

public class municipio {
	private String departamento;
	private String nomMunicipio;
	private LinkedList<ComunidadRural>a = new LinkedList<ComunidadRural>();
	private LinkedList<zonaUrbana>b = new LinkedList<zonaUrbana>();
	
	municipio(String x, String y, LinkedList<ComunidadRural>z, LinkedList<zonaUrbana>w){
		departamento = x;
		nomMunicipio = y;
		a = z;
		b = w;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomMunicipio() {
		return nomMunicipio;
	}

	public void setNomMunicipio(String nomMunicipio) {
		this.nomMunicipio = nomMunicipio;
	}

	public LinkedList<ComunidadRural> getA() {
		return a;
	}

	public void setA(LinkedList<ComunidadRural> a) {
		this.a = a;
	}

	public LinkedList<zonaUrbana> getB() {
		return b;
	}

	public void setB(LinkedList<zonaUrbana> b) {
		this.b = b;
	}
	public void mostrar() {
		//System.out.println("\t"+departamento+" "+nomMunicipio);
		System.out.println("\t"+" DEPATAMENTO " + departamento + " MUNICIPIO "+ nomMunicipio);
		ListIterator<ComunidadRural> r = a.listIterator();
		while(r.hasNext()) {
			ComunidadRural ex = r.next();
			ex.mostrar();
		}
		System.out.println("");
		ListIterator<zonaUrbana> q = b.listIterator();
		while(q.hasNext()) {
			zonaUrbana ey = q.next();
			ey.mostrar();
		}
	}
	
}
