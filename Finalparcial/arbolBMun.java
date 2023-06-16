package Finalparcial;


import java.util.*;;

public class arbolBMun {
	private nodoM r;
	
	public arbolBMun() {
		this.r = null;
	}
	public nodoM getR() {
		return r;
	}
	public void setR(nodoM r) {
		this.r = r;
	}
	public void preorden(nodoM r) {
		if(r!=null) {
			//Proceso preorden(antes del llamar al metodo)
			r.getM().mostrar();
			
			//Llamar al metodo
			preorden(r.getIzq());
			preorden(r.getDer());
		}
	}
	
	
	public void inorden(nodoM r) {
		if(r!=null) {
			inorden(r.getIzq());
			r.getM().mostrar();
			inorden(r.getDer());
		}
	}
	public void posorden(nodoM r) {
		if(r!=null) {
			//Llamar a los metodos tanto para el hijo izq como el hijo der
			posorden(r.getIzq());
			posorden(r.getDer());
			
			//Proceso
			r.getM().mostrar();
		}
	}

	public void sol2(String x) {
		colaM nivel = new colaM();
		colaM desc = new colaM();//para recuperar datos
		nivel.adicionar(this.getR());//asignar los datos a la cola
		int c = 0;
		int n = 0;
		//if (raiz!=null)
		while (!nivel.esvacia()) {
			// System.out.println("Nivel : "+c+ "--->>");
			while (!nivel.esvacia()) {
				nodoM r = nivel.eliminar();
				// preceso de rrecorido
				int cx = 0;
				System.out.println("\tMunicipio : "+r.getM().getNomMunicipio());
				ListIterator<ComunidadRural> q = r.getM().getA().listIterator();
				while(q.hasNext()) {
					ComunidadRural ex = q.next();
					cx += ex.getColaV().solAux1(x);
				}
				System.out.println("ComunidadesRurales --> "+cx);
				
				int cy = 0;
				ListIterator<zonaUrbana> w = r.getM().getB().listIterator();
				while(w.hasNext()) {
					zonaUrbana ex = w.next();
					cy += ex.getCv().solAux1(x);
				}
				System.out.println("Zonas Urbanas --> "+cy);
				// fiin
				if (r.getIzq() != null) {
					desc.adicionar(r.getIzq());
				}
				if (r.getDer() != null) {
					desc.adicionar(r.getDer());
				}
			}
			nivel.vaciar(desc);
			c++;
		
		}
//		
	}
	public void sol3(String x, String y) {
		colaM niv = new colaM();
		colaM desc = new colaM();
		niv.adicionar(this.getR());
		int c = 0;
		int n = 0;
		//if (raiz!=null)
		while (!niv.esvacia()) {
			// System.out.println("Nivel : "+c+ "--->>");
			boolean sw = false;
			while (!niv.esvacia()) {
				nodoM r = niv.eliminar();
				// preceso de rrecorido
				if(r.getM().getNomMunicipio().equals(x))
				{
					ListIterator<ComunidadRural> q = r.getM().getA().listIterator();
					while(q.hasNext()) {
						ComunidadRural ex = q.next();
						ex.getColaV().solAux2(y);
					}
					
					ListIterator<zonaUrbana> w = r.getM().getB().listIterator();
					while(w.hasNext()) {
						zonaUrbana ex = w.next();
						ex.getCv().solAux2(y);
					}
				}
				// fiin
				if (r.getIzq() != null) {
					desc.adicionar(r.getIzq());
				}
				if (r.getDer() != null) {
					desc.adicionar(r.getDer());
				}
			}
			niv.vaciar(desc);
			if(sw)
				System.out.println("--> " + c);
			c++;
			// System.out.println("");
		}
		//System.out.println("--> " + n);
	}
//	
//	

}
