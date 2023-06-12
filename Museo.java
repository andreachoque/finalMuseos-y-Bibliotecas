
public class Museo {
    private int idMun;
    private String nomMun, zona,direccion;
    private LSNormalObras listaObras;

    
    public Museo(int a , String b, String c,String d,LSNormalObras listaObras )
    {
        idMun=a;
        nomMun=b;
        zona=c;
        direccion=d;
        this.listaObras = listaObras;
    }

    Museo(int i, String miraflores, String av_Del_Ejrcito, String espacio_de_la_memoria_histrica_de_las_luc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public LSNormalObras getListaObras() {
		return listaObras;
	}

	public void setListaObras(LSNormalObras listaObras) {
		this.listaObras = listaObras;
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

	public void mostrar()
    {
        System.out.println("["+idMun+" "+nomMun+" "+zona+" "+direccion+"]");
    }

	public void mostrarMuseo() {
		System.out.println("["+idMun+" "+nomMun+" "+zona+" "+direccion+"]");
		System.out.println("Listado de Obras:");
	    this.getListaObras().mostrarLSN3();
	}
}
