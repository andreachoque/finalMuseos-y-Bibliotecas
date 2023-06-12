/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows
 */
public class CSimpleD {
    private int max=20;
    private Biblioteca v[]=new Biblioteca[max+1];
    private int ini,fin;

    CSimpleD()
    {
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
    void adicionar (Biblioteca elem)
    {
	if (!esllena ())
	{
	    fin++;         //v[fin+1]=elem
	    v [fin] = elem;  //fin=fin+1
	}
	else
	    System.out.println ("Cola Simple llena");
    }
    Biblioteca eliminar ()
    {
	Biblioteca elem = null;
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
    /*void mostrar ()
    {
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println ("\n Departamentos de la Cola ");
	    CSimpleD aux = new CSimpleD ();
	    while (!esvacia ())
	    {
		Biblioteca elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    */
    
    public void mostrar() {
    mostrarRecursivo();
}

private void mostrarRecursivo() {
    if (esvacia()) {
        System.out.println("Cola vacía");
        return;
    }
    
    System.out.println("\nDepartamentos de la Cola");
    CSimpleD aux = new CSimpleD();
    mostrarRecursivo(aux);
    vaciar(aux);
}

private void mostrarRecursivo(CSimpleD aux) {
    if (esvacia()) {
        return;
    }
    
    Biblioteca elem = eliminar();
    aux.adicionar(elem);
    elem.mostrar();
    mostrarRecursivo(aux);
    adicionar(elem);
}
    void mostrarbibliotecacompleta ()
    {
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    System.out.println ("\n Departamentos de la Cola ");
	    CSimpleD aux = new CSimpleD ();
	    while (!esvacia ())
	    {
		Biblioteca elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrarBiblioteca();
	    }
	    vaciar(aux);
	}
    }
    void vaciar (CSimpleD a)
    {
            while (!a.esvacia ())
                adicionar (a.eliminar ());

    }
}