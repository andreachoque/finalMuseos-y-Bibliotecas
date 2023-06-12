


public class Biblioteca  {
    private int idMun;
    private String nomMun, zona,direccion;
    private LSNormalLibros listaLibros;

    
    Biblioteca(int a , String b, String c,String d,LSNormalLibros listaLibros)
    {
        idMun=a;
        nomMun=b;
        zona=c;
        direccion=d;
        this.listaLibros = listaLibros ;
    }

    public int getIdMun() {
        return idMun;
    }

    public void setIdMun(int idMun) {
        this.idMun = idMun;
    }

    public String getNomMun() {
        return nomMun;
    }

    public LSNormalLibros getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(LSNormalLibros listaLibros) {
		this.listaLibros = listaLibros;
	}

	public void setNomMun(String nomMun) {
        this.nomMun = nomMun;
    }
    
    public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void agregarLibros(Libros libro) {
        listaLibros.addUltimo(libro);
    }

	public void mostrar()
    {
        System.out.println("["+idMun+" "+nomMun+" "+zona+" "+direccion+"]");
    }
	
	public void mostrarBiblioteca() {
		System.out.println("["+idMun+" "+nomMun+" "+zona+" "+direccion+"]");
	    System.out.println("Listado de libros:");
	    this.getListaLibros().mostrarLSN2();
	    
	}

	
}
