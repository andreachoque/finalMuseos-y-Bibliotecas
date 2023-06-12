public class NodoDobleMuseo {

		private Museo DatoL;
		private NodoDobleMuseo Sig;
		private NodoDobleMuseo Ant;
		
		public NodoDobleMuseo()
		{
			this.Sig=null;
			this.Ant=null;
		}

		public Museo getDatoL() {
			return DatoL;
		}

		public void setDatoL(Museo datoL) {
			DatoL = datoL;
		}

		public NodoDobleMuseo getSig() {
			return Sig;
		}

		public void setSig(NodoDobleMuseo sig) {
			Sig = sig;
		}

		public NodoDobleMuseo getAnt() {
			return Ant;
		}

		public void setAnt(NodoDobleMuseo ant) {
			Ant = ant;
		}
		
		
	}