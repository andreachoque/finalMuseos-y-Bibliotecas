public class NodoObras {

	private Obras Dato;
	private NodoObras Sig;
	
	public NodoObras()
	{
		this.Sig=null;
	}

	public Obras getDato() {
		return Dato;
	}

	public void setDato(Obras dato) {
		Dato = dato;
	}

	public NodoObras getSig() {
		return Sig;
	}

	public void setSig(NodoObras sig) {
		Sig = sig;
	}	

}