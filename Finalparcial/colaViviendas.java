package Finalparcial;

public class colaViviendas {
	private int max=50;
	private vivienda v[] = new vivienda[max+1];
	private int ini, fin;
	
	colaViviendas(){
		ini=fin=0;
	}
	
	boolean esvacia ()
    {
		if (ini == 0 && fin == 0)
		    return (true);
		return (false);
    }
	
    boolean esllena ()
    {
		if (fin == max)
		    return (true);
		return (false);
    }
    
    int nroelem ()
    {
    	return (fin - ini);
    }
    
    void adicionar (vivienda elem)
    {
		if (!esllena ())
		{
		    fin++;         //v[fin+1]=elem
		    v [fin] = elem;  //fin=fin+1
		}
		else
		    System.out.println ("Cola Simple llena");
	}
    
    
    vivienda eliminar ()
    {
		vivienda elem = null;
		if (!esvacia ())
		{
		    ini++;
		    elem = v [ini];
		    if (ini == fin)
			ini = fin = 0;
		}
		else
		    System.out.println ("Cola Simple vacia");
		return (elem);
    }
    
    
    void mostrar ()
    {
		if (esvacia ())
		    System.out.println ("Cola vacia");
		else
		{
		    System.out.println ("\n viviendas de la Cola ");
		    colaViviendas aux = new colaViviendas ();
		    while (!esvacia ())
		    {
				vivienda elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();
		    }
		    vaciar(aux);
		}
    }
    void vaciar (colaViviendas a)
    {
            while (!a.esvacia ())
                adicionar (a.eliminar ());

    }
    public int solAux1(String x) {
    	int c =0;
    	colaViviendas aux = new colaViviendas ();
	    
    	while (!esvacia())
	    {
			vivienda elem = eliminar();
			if(elem.getUsaCocina().equals("combustible") || elem.getUsaCocina().equals(x))
				c++;
			aux.adicionar (elem);
			//elem.mostrar();
	    }
	    vaciar(aux);
	    return c;
    }
    public void solAux2(String x) {
    	colaViviendas aux = new colaViviendas ();
	    
    	while (!esvacia())
	    {
			vivienda elem = eliminar();
			if(elem.getTipoEnergia().equals("panel solar") && elem.getEliminaBasura().equalsIgnoreCase(x))
				elem.mostrar();
			aux.adicionar (elem);
			//elem.mostrar();
	    }
	    vaciar(aux);
    }

}
