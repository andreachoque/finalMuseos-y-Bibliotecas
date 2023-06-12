public class NodoDobleBiblio {

		private Biblioteca DatoL;
		private NodoDobleBiblio Sig;
		private NodoDobleBiblio Ant;
		
		public NodoDobleBiblio()
		{
			this.Sig=null;
			this.Ant=null;
		}

		public Biblioteca getDatoL() {
			return DatoL;
		}

		public void setDatoL(Biblioteca datoL) {
			DatoL = datoL;
		}

		public NodoDobleBiblio getSig() {
			return Sig;
		}

		public void setSig(NodoDobleBiblio sig) {
			Sig = sig;
		}

		public NodoDobleBiblio getAnt() {
			return Ant;
		}

		public void setAnt(NodoDobleBiblio ant) {
			Ant = ant;
		}
		
		
	}