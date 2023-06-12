/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows
 */
public class PilaA {
    private int max=100;
    private Museo v[]=new Museo[max+1];
    private int tope;
    
    PilaA(){
        tope=0;
    }
    
    boolean esvacia ()
    {
        if (tope == 0)
            return (true);
        return (false);
    }

    boolean esllena ()
    {
        if (tope == max)
            return (true);
        return (false);
    }

    int nroelem ()
    {
        return (tope);
    }

    void adicionar (Museo elem)
    {
        if (!esllena ())
        {
            tope++;
            v [tope] = elem;
        }
        else
            System.out.println ("Pila llena");
    }

    Museo eliminar ()
    {
        Museo elem = null;
        if (!esvacia ())
        {
            elem = v [tope];
            tope--;
        }
        else
            System.out.println ("Pila vacia");
        return (elem);
    }

    /*void mostrar ()
    {
        Museo elem;
        if (esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux = new PilaA ();
            while (!esvacia ())
            {
                elem = eliminar ();
                aux.adicionar (elem);
                elem.mostrar();
            }
            while (!aux.esvacia ())
            {
                elem = aux.eliminar ();

                adicionar (elem);
            }
        }
    }*/
    public void mostrar() {
    mostrarRecursivo();
}

private void mostrarRecursivo() {
    if (esvacia()) {
        System.out.println("Cola vacía");
        return;
    }
    
    System.out.println("\nDepartamentos de la Cola");
    PilaA aux = new PilaA();
    mostrarRecursivo(aux);
    vaciar(aux);
}

private void mostrarRecursivo(PilaA aux) {
    if (esvacia()) {
        return;
    }
    
    Museo elem = eliminar();
    aux.adicionar(elem);
    elem.mostrar();
    mostrarRecursivo(aux);
    adicionar(elem);
}
    
    
    void mostrarMuseoCompleto ()
    {
        Museo elem;
        if (esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux = new PilaA ();
            while (!esvacia ())
            {
                elem = eliminar ();
                aux.adicionar (elem);
                elem.mostrarMuseo();///////////////////
            }
            while (!aux.esvacia ())
            {
                elem = aux.eliminar ();

                adicionar (elem);
            }
        }
    }

    void vaciar (PilaA a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());
        
    }
}

