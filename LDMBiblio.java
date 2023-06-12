

public class LDMBiblio {

	private NodoDobleBiblio Pm;
	
	public LDMBiblio()
	{
		Pm = null;
	}

	public NodoDobleBiblio getPm() {
		return Pm;
	}

	public void setPm(NodoDobleBiblio pm) {
		Pm = pm;
	}
	public void adiFinal(Biblioteca mx){
		NodoDobleBiblio nuevo=new NodoDobleBiblio();
        nuevo.setDatoL(mx);
        
        if(getPm()==null)
            setPm(nuevo);
        else {
        	NodoDobleBiblio r=getPm();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }
    public void mostrar()
    {
    	NodoDobleBiblio o=getPm();
        while(o!=null)
        {
            o.getDatoL().mostrar();
            o=o.getSig();
        }
    }
    
    public void mostrarBiblio()
    {
    	NodoDobleBiblio o=getPm();
        while(o!=null)
        {
            o.getDatoL().mostrarBiblioteca();
            o=o.getSig();
        }
    }

	
		
	
}
