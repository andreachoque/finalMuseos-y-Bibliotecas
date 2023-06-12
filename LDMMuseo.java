
public class LDMMuseo {

	private NodoDobleMuseo Pm;
	
	public LDMMuseo()
	{
		Pm = null;
	}

	public NodoDobleMuseo getPm() {
		return Pm;
	}

	public void setPm(NodoDobleMuseo pm) {
		Pm = pm;
	}
	public void adiFinal(Museo mx){
		NodoDobleMuseo nuevo=new NodoDobleMuseo();
        nuevo.setDatoL(mx);
        
        if(getPm()==null)
            setPm(nuevo);
        else {
        	NodoDobleMuseo r=getPm();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }
    public void mostrar()
    {
    	NodoDobleMuseo o=getPm();
        while(o!=null)
        {
            o.getDatoL().mostrar();
            o=o.getSig();
        }
    }
    public void mostrarMUSEO()
    {
    	NodoDobleMuseo o=getPm();
        while(o!=null)
        {
            o.getDatoL().mostrarMuseo();
            o=o.getSig();
        }
    }
}
