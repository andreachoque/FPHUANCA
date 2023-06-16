package Finalparcial;

public class colaM {
	private int max=50;
	private nodoM v[] = new nodoM[max+1];
	private int ini, fin;
	
	public colaM(){
		ini=fin=0;
	}
	
	public boolean esvacia ()
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
    
    public void adicionar (nodoM xd)
    {
		if (!esllena ())
		{
		    fin++;         //v[fin+1]=elem
		    v [fin] = xd;  //fin=fin+1
		}
		else
		    System.out.println ("colaM Simple llena");
	}
    
    
    public nodoM eliminar ()
    {
		nodoM elem = null;
		if (!esvacia ())
		{
		    ini++;
		    elem = v [ini];
		    if (ini == fin)
			ini = fin = 0;
		}
		else
		    System.out.println ("colaM Simple vacia");
		return (elem);
    }
    
    
//    void mostrar ()
//    {
//		if (esvacia ())
//		    System.out.println ("colaM vacia");
//		else
//		{
//		    System.out.println ("\n nodoMs de la colaM ");
//		    colaM aux = new colaM ();
//		    while (!esvacia ())
//		    {
//				nodoM elem = eliminar ();
//				aux.adicionar (elem);
//				elem.mostrar();
//		    }
//		    vaciar(aux);
//		}
//    }
    public void vaciar (colaM a)
    {
            while (!a.esvacia ())
                adicionar (a.eliminar ());

    }

}

