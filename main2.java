import java.util.Scanner;


public class main2 {
       
          
     public static void buscarAutorEnMuseos (PilaA a,String autorBuscado)
    {
        Museo elem;
        boolean encontrado = false;
        if (a.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux1 = new PilaA ();
            while (!a.esvacia ())
            {
                elem = a.eliminar ();
                aux1.adicionar (elem);
                 NodoObras aux=elem.getListaObras().getP();
                while (aux != null) {
                if (aux.getDato().getAutor().equalsIgnoreCase(autorBuscado)) {
                    encontrado = true;
                    //museo.mostrarMuseo();
                    System.out.println("Museo: " + elem.getDireccion());
                    System.out.println("Ubicación: " + elem.getNomMun());
                    System.out.println("Obra: " + aux.getDato().getNomObra());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
            }
             if (!encontrado) {
                System.out.println("No se encontraron obras del autor ");
            }
            while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                a.adicionar (elem);
            }
        }
    }
    
    public  void buscarObraEnMuseos(PilaA s,String nombreObraBuscada) {
        // Aquí debes tener acceso a las listas de museos, reemplaza "listaMuseos" por tu variable correspondiente
       
            boolean encontrado = false;
            Museo elem;
        if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux1 = new PilaA ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoObras aux=elem.getListaObras().getP();
            while (aux != null) {
                if (aux.getDato().getNomObra().equalsIgnoreCase(nombreObraBuscada)) {
                    encontrado = true;
                    //museo.mostrarMuseo();
                    System.out.println("Museo: " + elem.getDireccion());
                    System.out.println("Ubicación: " + elem.getNomMun());
                    System.out.println("Obra: " + aux.getDato().getNomObra());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    
                    break;
                }
                
                aux = aux.getSig();
            }
           }
        if (!encontrado) {
                System.out.println("No se encontró la obra en ningun museo ");
            }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }}
    }
   public  void buscarLibroPorCodigo(CSimpleD s,String codigoBuscado) {
        // Aquí debes tener acceso a las listas de bibliotecas, reemplaza "listaBibliotecas" por tu variable correspondiente
        boolean encontrado = false;
        Biblioteca elem;
         if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            CSimpleD aux1 = new CSimpleD ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoLibro aux=elem.getListaLibros().getP();
            while (aux != null) {
                if (aux.getDato().getCod().equalsIgnoreCase(codigoBuscado)) {
                    encontrado = true;
                    System.out.println("Biblioteca: " + elem.getNomMun());
                    System.out.println("Ubicación: " + elem.getDireccion());
                    System.out.println("Obra: " + aux.getDato().getCod());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún libro con el titulo buscado.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
        }
    } 
   
    public  void buscarLibroPorAnio(CSimpleD s,int codigoBuscado) {
        boolean encontrado = false;
        Biblioteca elem;
         if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            CSimpleD aux1 = new CSimpleD ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoLibro aux=elem.getListaLibros().getP();
            
            while (aux != null) {
                if (aux.getDato().getApub()==codigoBuscado) {
                    encontrado = true;
                    System.out.println("Biblioteca: " + elem.getNomMun());
                    System.out.println("Ubicación: " + elem.getDireccion());
                    System.out.println("Obra: " + aux.getDato().getCod());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
          
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún libro publicado en ese año.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
        }
    } 
   
    public  void buscarLibrosPorAutor (CSimpleD s,String autor) {
        // Aquí debes tener acceso a las listas de bibliotecas, reemplaza "listaBibliotecas" por tu variable correspondiente
       
       boolean encontrado = false;
        Biblioteca elem;
         if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            CSimpleD aux1 = new CSimpleD ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoLibro aux=elem.getListaLibros().getP();
            while (aux != null) {
                if (aux.getDato().getAutor().equalsIgnoreCase(autor)) {
                    encontrado = true;
                    //biblioteca.mostrarBiblioteca();
                    System.out.println("Biblioteca: " + elem.getNomMun());
                    System.out.println("Ubicación: " + elem.getDireccion());
                    System.out.println("Obra: " + aux.getDato().getCod());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
           
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el año buscado.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
        }
    }
 
    
     public  void buscarObrasPorAnio(PilaA s,  int anioBuscado) {
        
       boolean encontrado = false;
            Museo elem;
        if (s.esvacia ())
            System.out.println ("Pila vacia");
        else
        {
            System.out.println ("\n Datos de la Pila ");
            PilaA aux1 = new PilaA ();
            while (!s.esvacia ())
            {
                elem = s.eliminar ();
                aux1.adicionar (elem);
                 NodoObras aux=elem.getListaObras().getP();
            while (aux != null) {
                if (aux.getDato().getApub() == anioBuscado) {
                    encontrado = true;
                    System.out.println("Museo: " + elem.getDireccion());
                    System.out.println("Ubicación: " + elem.getNomMun());
                    System.out.println("Obra: " + aux.getDato().getNomObra());
                    System.out.println("Autor: " + aux.getDato().getAutor());
                    System.out.println("Año de publicacion : " + aux.getDato().getApub());
                    System.out.println("--------------------");
                    break;
                }
                
                aux = aux.getSig();
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron obras de arte publicadas en el año buscado.");
        }
         while (!aux1.esvacia ())
            {
                elem = aux1.eliminar ();

                s.adicionar (elem);
            }
    } 
     }
}

     