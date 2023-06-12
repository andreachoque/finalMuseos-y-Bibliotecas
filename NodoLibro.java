public class NodoLibro {

	private Libros Dato;
	private NodoLibro Sig;
	
	public NodoLibro()
	{
		this.Sig=null;
	}

	public Libros getDato() {
		return Dato;
	}

	public void setDato(Libros dato) {
		Dato = dato;
	}

	public NodoLibro getSig() {
		return Sig;
	}

	public void setSig(NodoLibro sig) {
		Sig = sig;
	}	

}