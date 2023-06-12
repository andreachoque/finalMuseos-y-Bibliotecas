public class LSNormalLibros extends LSLibros{
	public LSNormalLibros()
	{
		super();
	}
	
	public boolean esVacia()
	{
		if(getP()==null)
			return true;
		else
			return false;
	}
	
	public void addPrimero(Libros x)
	{
		NodoLibro w = new NodoLibro();
		w.setDato(x);
		w.setSig(getP());
		setP(w);
	}
	
	public void addPrimero(NodoLibro w)
	{
		w.setSig(getP());
		setP(w);
	}
	
	public void addUltimo(Libros x)
	{
		NodoLibro w=new NodoLibro();
		w.setDato(x);
		NodoLibro aux;
		if (esVacia())
		{
			setP(w);
		}
		else
		{
			aux=getP();
			while(aux.getSig()!=null)
			{
				aux=aux.getSig();
			}
			aux.setSig(w);
		}
	}
	
	public void addUltimo(NodoLibro w)
	{
		
		NodoLibro aux;
		if (esVacia())
		{
			setP(w);
		}
		else
		{
			aux=getP();
			while(aux.getSig()!=null)
			{
				aux=aux.getSig();
			}
			aux.setSig(w);
		}
	}
	
	public NodoLibro delPrincipio()
	{
		NodoLibro w;
		w=getP();
		setP(getP().getSig());
		w.setSig(null);
		return w;
	}
	
	public NodoLibro delFinal()
	{
		NodoLibro aux;
		NodoLibro w;
		aux=getP();
		w=getP();
		if(aux.getSig()==null)
		{
			setP(null);
		}
		else
		{
			while(aux.getSig()!=null)
			{
				w=aux;
				aux=aux.getSig();
			}			
		}
		w.setSig(null);
		w=aux;
		return(w);
		
	}
	
	public int cantNodos()
	{
		int c=0;
		NodoLibro aux;
		aux=getP();
		while(aux!=null)
		{
			c++;
			aux=aux.getSig();
		}
		return c;
	}
	
	public void leerPrincipio(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Libros s = new Libros();
			addPrimero(s);
		}
	}
	
	public void leerFinal(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Libros s = new Libros();
			addUltimo(s);
		}
	}
	
	public void mostrarLSN()
	{
		NodoLibro aux;
		aux=getP();
		Libros x= new Libros();
		while(aux.getSig()!=null)
		{
			x=aux.getDato();
			aux=aux.getSig();
			x.mostrarLibros();
			System.out.print(">"+aux.getDato());
		}
		x = aux.getDato();
		x.mostrarLibros();
	}	
	
	public void mostrarLSN2() {
	    NodoLibro aux = getP();
	    while (aux != null) {
	        aux.getDato().mostrarLibros();
	        aux = aux.getSig();
	    }
	}
}
