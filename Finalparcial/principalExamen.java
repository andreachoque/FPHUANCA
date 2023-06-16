package Finalparcial;

import java.util.*;
public class principalExamen {

	public static void main(String[] args) {
		//VIVIENDA : NRO PROPIEDAD - SERVICIO SANITARIO-TIPO ENERGIA- USO COCINA- ELIMINA BASURA- COMUNICACION

		vivienda v1 = new vivienda(1,"no tiene","panel solar","combustible","otra forma","radio");
		vivienda v2 = new vivienda(2,"alcantarillado","motor propio","gas domiciliario","al rio","televisor");
		vivienda v3 = new vivienda(3,"camara septica","red de empresa","combustible","la queman","computadora");
		vivienda v4 = new vivienda(4,"pozo ciego","panel solar","leña","otra forma","internet");
		vivienda v5 = new vivienda(5,"a la quebrada","motor propio","electricidad","basurero","televisor");
		vivienda v6 = new vivienda(6,"no tiene","red de empresa","gas domiciliario","basurero","radio");
		vivienda v7 = new vivienda(7,"alcantarillado","no tiene","combustible","otra forma","computadora");
		vivienda v8 = new vivienda(8,"camara septica","red de empresa","leña","basurero","radio");
		vivienda v9 = new vivienda(9,"pozo ciego","motor propio","combustible","basurero","televisor");
		vivienda v10 = new vivienda(10,"a la quebrada","no tiene","energia solar","basurero","radio");
		vivienda v11 = new vivienda(11,"no tiene","panel solar","combustible","basurero","internet");
		vivienda v12 = new vivienda(12,"alcantarillado","motor propio","leña","la entierran","televisor");
	
		
		colaViviendas c1  = new colaViviendas();
		c1.adicionar(v1);
		c1.adicionar(v2);
		colaViviendas c2 = new colaViviendas();
		c2.adicionar(v3);
		c2.adicionar(v4);
		colaViviendas c3 = new colaViviendas();
		c3.adicionar(v5);
		colaViviendas c4 = new colaViviendas();
		c4.adicionar(v6);
		c4.adicionar(v7);
		colaViviendas c5 = new colaViviendas ();
		c5.adicionar(v8);
		colaViviendas c6 = new colaViviendas();
		c6.adicionar(v9);
		colaViviendas c7 = new colaViviendas();
		c7.adicionar(v10);
		colaViviendas c8 = new colaViviendas();
		c8.adicionar(v11);
		c8.adicionar(v12);
		
		
		ComunidadRural cr1 = new ComunidadRural("com Rural 1", c1);
		ComunidadRural cr2 = new ComunidadRural("com Rural 2",c2);
		ComunidadRural cr3 = new ComunidadRural("com Rural 3",c3);
		ComunidadRural cr4 = new ComunidadRural("com Rural 4", c4);
		ComunidadRural cr5 = new ComunidadRural("com Rural 5",c5);
		ComunidadRural cr6 = new ComunidadRural("com Rural 6",c6);
		
		
		LinkedList<ComunidadRural> l1 = new LinkedList<ComunidadRural>();
		l1.add(cr1);
		l1.add(cr2);
		LinkedList<ComunidadRural> l2 = new LinkedList<ComunidadRural>();
		l2.add(cr3);
		LinkedList<ComunidadRural> l3 = new LinkedList<ComunidadRural>();
		l3.add(cr4);
		l3.add(cr5);
		
		zonaUrbana z1 = new zonaUrbana("zona 1",c6);
		zonaUrbana z2 = new zonaUrbana("zona 2",c7);
		zonaUrbana z3 = new zonaUrbana("zona 3",c8);
		
		LinkedList<zonaUrbana> ll1 = new LinkedList<zonaUrbana>();
		ll1.add(z1);
		LinkedList<zonaUrbana> ll2 = new LinkedList<zonaUrbana>();
		ll2.add(z2);
		LinkedList<zonaUrbana> ll3 = new LinkedList<zonaUrbana>();
		ll3.add(z3);
		
		municipio m1 = new municipio("la paz","MUNICIPIO DE PALCA",l1,ll1);
		municipio m2 = new municipio("oruro","MUNICIPIO LOS ANDES",l2,ll2);
		municipio m3 = new municipio("potosi","MUNICIPIO OVEJUYO",l3,ll3);
		
		
		
		arbolBMun a = new arbolBMun();
		nodoM n1 = new nodoM();
		n1.setM(m1);
		nodoM n2 = new nodoM();
		n2.setM(m2);
		nodoM n3 = new nodoM();
		n3.setM(m3);
		a.setR(n1);
		n1.setIzq(n2);
		n1.setDer(n3);
		System.out.println("\n===========  solucion 1 ============\n");
		a.preorden(a.getR());
		
		System.out.println("\n===========  solucion 2 ============\n");
		a.sol2("electricidad");
		
		System.out.println("\n===========  solucion 3 ============\n");
		a.sol3("MUNICIPIO DE PALCA","otra forma");
		
	}

}
