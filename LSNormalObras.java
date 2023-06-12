import java.util.Scanner;

public class LSNormalObras extends LSObras{
	public LSNormalObras()
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
	
	public void addPrimero(Obras x)
	{
		NodoObras w = new NodoObras();
		w.setDato(x);
		w.setSig(getP());
		setP(w);
	}
	
	public void addPrimero(NodoObras w)
	{
		w.setSig(getP());
		setP(w);
	}
	
	public void addUltimo(Obras x)
	{
		NodoObras w=new NodoObras();
		w.setDato(x);
		NodoObras aux;
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
	
	public void addUltimo(NodoObras w)
	{
		
		NodoObras aux;
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
	
	public NodoObras delPrincipio()
	{
		NodoObras w;
		w=getP();
		setP(getP().getSig());
		w.setSig(null);
		return w;
	}
	
	public NodoObras delFinal()
	{
		NodoObras aux;
		NodoObras w;
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
		NodoObras aux;
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
			Obras s = new Obras();
			addPrimero(s);
		}
	}
	
	public void leerFinal(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Obras s = new Obras();
			addUltimo(s);
		}
	}
	
	public void mostrarLSN()
	{
		NodoObras aux;
		aux=getP();
		Obras x= new Obras();
		while(aux.getSig()!=null)
		{
			x=aux.getDato();
			aux=aux.getSig();
			x.mostrarObras();
			System.out.print("-->"+aux.getDato());
		}
		x = aux.getDato();
		x.mostrarObras();
	}

	public void mostrarLSN3() {
		 NodoObras aux = getP();
		    while (aux != null) {
		        aux.getDato().mostrarObras();
		        aux = aux.getSig();
		    }
	}	
}
